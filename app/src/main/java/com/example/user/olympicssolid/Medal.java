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
            return "Thanks for taking part";
        }
    }
}

//    public void awardMedal(int points) {
//        if (points >= 15) {
//            System.out.println("Gold");
//        } else if (points >= 10 && points <= 14){
//            System.out.println("Silver");
//        } else if (points >= 5 && points <= 9) {
//            System.out.println("Bronze");
//        } else {
//            System.out.println("Not Placed");
//        }
//    }