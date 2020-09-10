package com.example.stealth102;

import com.example.stealth102.interfaces.ICoach;
import com.example.stealth102.interfaces.IFortuneService;

public class TrackCoach implements ICoach {

    private IFortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(IFortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return  "Just do it ! "+ fortuneService.getFortune();
    }
}
