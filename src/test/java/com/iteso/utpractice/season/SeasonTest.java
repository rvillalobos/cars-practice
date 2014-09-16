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

        day = 22;
        month = 12;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Winter");

        day = 20;
        month = 3;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Winter");

    }

    @Test
    public void testSpring(){

        day = 22;
        month = 3;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Spring");

        day = 20;
        month = 6;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Spring");
    }

    @Test
    public void testSummer(){

        day = 22;
        month = 6;

        result = mySeason.whichSeason(day, month);
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
        assertEquals(result, "Autumn");
    }


    @Test
    public void testInvalid(){

        day = 0;
        month = 0;

        result = mySeason.whichSeason(day,month);
        assertEquals(result, "Invalid");

        day = 32;
        month = 12;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Invalid");

        day = 2;
        month = 13;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Invalid");

        day = 30;
        month = 2;

        result = mySeason.whichSeason(day, month);
        assertEquals(result, "Invalid");
    }

}
