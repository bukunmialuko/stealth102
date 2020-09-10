package com.example.stealth102;

import com.example.stealth102.interfaces.ICoach;
import com.example.stealth102.interfaces.IFortuneService;

public class BaseballCoach implements ICoach {

    private IFortuneService fortuneService;

    private BaseballCoach(IFortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
