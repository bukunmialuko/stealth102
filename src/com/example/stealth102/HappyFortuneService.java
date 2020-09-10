package com.example.stealth102;

import com.example.stealth102.interfaces.IFortuneService;

public class HappyFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
