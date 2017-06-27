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

    @Before
    public void before(){
        boxer = new Boxer(20, 5);
        boxer1 = new Boxer(10, 3);
        boxer2 = new Boxer(20, 9);
    }

    @Test
    public void canAwardGold(){
        boxer.enterEvent();
        assertEquals("Gold", boxer.getMedalColour());
    }

    @Test
    public void canAwardBronze() throws Exception {
        boxer1.enterEvent();
        assertEquals("Bronze", boxer.getMedalColour());
    }
}
