package com.example.stealth102;

import com.example.stealth102.interfaces.ICoach;

public class TrackCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
