package com.example.stealth102.main;

import com.example.stealth102.interfaces.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring  container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);
        ICoach alphaCoach = context.getBean("myCoach", ICoach.class);

        boolean result = (theCoach == alphaCoach);
        // call methods on the bean
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
        // close the context
        context.close();
    }
}
