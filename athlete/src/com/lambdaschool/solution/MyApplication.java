package com.lambdaschool.solution;

public class MyApplication implements Processor {
    private AthleteService athlete;

    public MyApplication(AthleteService athlete) {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete() {
        System.out.println("*****************");
        athlete.displayAthlete();
        System.out.println("*****************");
    }
}
