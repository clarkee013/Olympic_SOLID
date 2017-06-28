package com.example.user.olympicssolid;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by user on 28/06/2017.
 */

public class AthleteLogFile implements AthleteLog{

    public void record(int distance, int totalDistance) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("log.txt", true));
            pw.println("Distance covered this run was: " + distance);
            pw.println("Total distance now covered: " + totalDistance);
            pw.close();
        } catch (Exception e) {
            System.out.println("Ooops" + e.getMessage());
        }
    }
}

