package com.example.user.olympicssolid;

/**
 * Created by user on 27/06/2017.
 */

    public class Boxer extends Athlete {

        public Boxer(int pointsA, int pointsB){
            super (pointsA, pointsB);
        }

        public int calculatePoints(){
            int totalPoints = pointsA - pointsB;
            return totalPoints;
        }


    }

