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

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
