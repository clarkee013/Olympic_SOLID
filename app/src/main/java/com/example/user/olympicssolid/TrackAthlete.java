package com.example.user.olympicssolid;

/**
 * Created by user on 28/06/2017.
 */

public class TrackAthlete {

    AthleteLog log;

    public TrackAthlete(AthleteLog log){
        this.log = log;
    }

    private int totalDistance;

    public void run(int distance){
        totalDistance += distance;
        log.record(distance, totalDistance);
    }


}

