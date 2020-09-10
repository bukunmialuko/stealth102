package com.example.stealth102.main;

import com.example.stealth102.TrackCoach;
import com.example.stealth102.interfaces.ICoach;

public class MyApp {
    public static void main(String[] args) {
        ICoach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
