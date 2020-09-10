package com.example.stealth102;

import com.example.stealth102.interfaces.ICoach;
import com.example.stealth102.interfaces.IFortuneService;

public class CricketCoach implements ICoach {

    private String emailAddress;
    private String team;

    private IFortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-args constructor");
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: setting email address");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: setting team");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
