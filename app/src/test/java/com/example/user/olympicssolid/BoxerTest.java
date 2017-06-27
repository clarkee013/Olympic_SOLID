package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static android.support.v7.widget.AppCompatDrawableManager.get;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class BoxerTest {

    private Boxer boxer;
    private Boxer boxer1;
    private Boxer boxer2;
    private Boxer boxer3;

    @Before
    public void before(){
        boxer = new Boxer(20, 4);
        boxer1 = new Boxer(20, 7);
        boxer2 = new Boxer(10, 4);
        boxer3 = new Boxer(13, 10);
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(16, boxer.calculatePoints());
    }


    @Test
    public void canAwardGold(){
        boxer.enterEvent();
        assertEquals("Gold", boxer.getMedalColour());
    }

    @Test
    public void canAwardBronze(){
        boxer1.enterEvent();
        assertEquals("Silver", boxer1.getMedalColour());
    }

    @Test
    public void canAwardSilver(){
        boxer2.enterEvent();
        assertEquals("Bronze", boxer2.getMedalColour());
    }

    @Test
    public void canAwardLoser(){
        boxer3.enterEvent();
        assertEquals("Thanks for taking part", boxer3.getMedalColour());
    }





}