package com.example.stealth102.main;

import com.example.stealth102.CricketCoach;
import com.example.stealth102.interfaces.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        // retrieve bean from spring  container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
