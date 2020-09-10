package com.example.stealth102;

import com.example.stealth102.interfaces.ICoach;
import com.example.stealth102.interfaces.IFortuneService;

public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-args constructor");
    }

    public void setFortuneService(IFortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setFortuneService method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
