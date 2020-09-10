package com.example.stealth102;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context =  new
                ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring  container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
