package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class GymnastTest {

    private Gymnast gymnast;
    private Gymnast gymnast1;
    private Gymnast gymnast2;
    private Gymnast gymnast3;

    @Before
    public void before() {
        gymnast = new Gymnast(12, 4);
        gymnast1 = new Gymnast(6, 7);
        gymnast2 = new Gymnast(2, 4);
        gymnast3 = new Gymnast(2, 1);
    }

    @Test
    public void canCalculatePoints()throws Exception {
        assertEquals(16, gymnast.calculatePoints());
    }


    @Test
    public void canAwardGold() {
        gymnast.enterEvent();
        assertEquals("Gold", gymnast.getMedalColour());
    }

    @Test
    public void canAwardBronze() {
        gymnast1.enterEvent();
        assertEquals("Silver", gymnast1.getMedalColour());
    }

    @Test
    public void canAwardSilver() {
        gymnast2.enterEvent();
        assertEquals("Bronze", gymnast2.getMedalColour());
    }

    @Test
    public void canAwardLoser() {
        gymnast3.enterEvent();
        assertEquals("Thanks for taking part", gymnast3.getMedalColour());
    }


}