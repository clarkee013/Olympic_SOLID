package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static android.support.v7.widget.AppCompatDrawableManager.get;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class BoxerTest {

    Boxer boxer;
    private Boxer boxer1;
    private Boxer boxer2;
    private Boxer boxer3;

    @Before
    public void before(){
        boxer = new Boxer(20, 5);
        boxer1 = new Boxer(20, 6);
        boxer2 = new Boxer(20, 15);
        boxer3 = new Boxer(20, 19);
    }


    @Test
    public void canAwardGold(){
        boxer.enterEvent();
        assertEquals("Gold", boxer.getMedalColour());
    }

    @Test
    public void canAwardSilver(){
        boxer1.enterEvent();
        assertEquals("Silver", boxer.getMedalColour());
    }

    @Test
    public void canAwardBronze(){
        boxer2.enterEvent();
        assertEquals("Bronze", boxer.getMedalColour());
    }

    @Test
    public void canAwardLoser(){
        boxer3.enterEvent();
        assertEquals("Thanks for taking part", boxer.getMedalColour());
    }

    @Test
    public void canGetPointsCalculation(){
        assertEquals(15, Boxer.calculatePoints());
    }


}
