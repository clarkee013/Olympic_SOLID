package com.example.user.olympicssolid;

/**
 * Created by user on 28/06/2017.
 */

public class Runner {

    public static void main(String[] args){
        AthleteLogConsole log = new AthleteLogConsole();
        TrackAthlete runner = new TrackAthlete();
        runner.run(20);
        runner.run(15);

        AthleteLogFile fileLog = new AthleteLogFile();
        TrackAthlete runner2 = new TrackAthlete(fileLog);
        runner2.run(10);
        runner2.run(12);
    }
}
