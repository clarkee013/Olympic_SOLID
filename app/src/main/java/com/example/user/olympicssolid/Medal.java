package com.example.user.olympicssolid;

/**
 * Created by user on 27/06/2017.
 */

public class Medal {

    public static String medalAward(int totalPoints){
        if (totalPoints >= 15){
            return "Gold";
        }
        else if (totalPoints  >= 10){
            return "Silver";
        }
        else if (totalPoints >= 5){
            return "Bronze";
        }
        else{
            return "No Award";
        }
    }
}
