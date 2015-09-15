package com.iteso.utpractice.today;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.Calendar;
import static org.mockito.Mockito.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TodayTest {
    int day;
    Calendar myCalendar;
    Today myToday;

    @Before
    public void setUp(){

        day = 0;
        myCalendar = Calendar.getInstance();
        myToday = new Today();
    }

    @Test
    public void testIsTodayTrue(){

       boolean result = myToday.isToday(3);

        assertTrue(result);

    }
    @Test
    public void testIsTodayFalse(){

        boolean result = myToday.isToday(5);

        assertFalse(result);

    }

    @Test
    public void testIsTodayInvalid(){

        boolean result = myToday.isToday(9);

        assertFalse(result);

    }

}
