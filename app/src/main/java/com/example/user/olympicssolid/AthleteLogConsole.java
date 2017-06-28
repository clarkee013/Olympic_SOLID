package com.example.user.olympicssolid;

/**
 * Created by user on 28/06/2017.
 */

public class AthleteLogConsole implements AthleteLog {
    public void record(int distance, int totalDistance) {
        System.out.println("Distance this run: " + distance);
        System.out.println("Total distance covered: " + totalDistance);
    }
}
