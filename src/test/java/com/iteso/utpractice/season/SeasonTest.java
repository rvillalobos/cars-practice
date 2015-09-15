package com.iteso.utpractice.season;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by rvillalobos on 9/15/14.
 */
public class SeasonTest {
    int day;
    int month;
    Season mySeason;
    String result;

    @Before
    public void setUp(){

        day = 0;
        month = 0;
        mySeason = new Season();
    }

    @Test
    public void testWinter(){



        result = mySeason.whichSeason(22, 12);
        assertEquals(result, "Winter");



        result = mySeason.whichSeason(20, 3);
        assertEquals(result, "Winter");

    }

    @Test
    public void testSpring(){

        day = 22;
        month = 3;

        result = mySeason.whichSeason(22, 3);
        assertEquals(result, "Spring");

        day = 20;
        month = 6;

        result = mySeason.whichSeason(20, 6);
        assertEquals(result, "Spring");
    }

    @Test
    public void testSummer(){



        result = mySeason.whichSeason(22, 6);
        assertEquals(result, "Summer");

        day = 20;
        month = 9;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Summer");
    }

    @Test
    public void testAutumn(){

        day = 22;
        month = 9;

        result = mySeason.whichSeason(day,month);
        assertEquals(result, "Autumn");

        day = 20;
        month = 12;

        result = mySeason.whichSeason(day, month);
        assertEquals("Autumn", result);
    }


    @Test
    public void testInvalid(){



        result = mySeason.whichSeason(0,0);
        assertEquals(result, "Invalid");


        result = mySeason.whichSeason(32, 12);
        assertEquals(result, "Invalid");


        result = mySeason.whichSeason(2, 13);
        assertEquals(result, "Invalid");


        result = mySeason.whichSeason(30, 2);
        assertEquals(result, "Invalid");
    }

}
