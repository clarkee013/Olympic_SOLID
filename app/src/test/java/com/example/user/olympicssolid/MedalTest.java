package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static android.media.CamcorderProfile.get;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class MedalTest {

    Medal medal;

    @Before
    public void before(){
        medal = new Medal();
    }

    @Test
    public void canAwardGold(){
        assertEquals("Gold", Medal.medalAward(15));
    }

    @Test
    public void canAwardSilver(){
        assertEquals("Silver", Medal.medalAward(14));
    }

    @Test
    public void canAwardBronze(){
        assertEquals("Bronze", Medal.medalAward(6));
    }

    @Test
    public void canAwardLoser(){
        assertEquals("Thanks for taking part", Medal.medalAward(3));
    }


}



