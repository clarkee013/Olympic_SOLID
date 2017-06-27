package com.example.user.olympicssolid;

import static android.os.Looper.prepare;

/**
 * Created by user on 27/06/2017.
 */

public abstract class Athlete {

    protected int pointsA;
    protected int pointsB;
    protected String medalColour;

    abstract int calculatePoints();

    public Athlete(int pointsA, int pointsB){
        this.pointsA = pointsA;
        this.pointsB = pointsB;
    }


    public void prepare(){
        System.out.println("I'm getting ready!");
    }

    public void compete(){
        System.out.println("Going for Gold!");
    }

    public void awardMedal(int total){
        this.medalColour = Medal.medalAward(total);
    }

    public void enterEvent(){
        prepare();
        compete();
        int total = calculatePoints();
        awardMedal(total);
    }

    public String getMedalColour() {
        return medalColour;
    }
}





