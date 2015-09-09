package com.iteso.utpractice.today;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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

        day = myCalendar.get(Calendar.DAY_OF_WEEK);

        boolean result = myToday.isToday(day);

        assertTrue(result);

    }
    @Test
    public void testIsTodayFalse(){

        day = myCalendar.get(Calendar.DAY_OF_WEEK);
        day += 2;

        boolean result = myToday.isToday(day);

        assertFalse(result);

    }

    @Test
    public void testIsTodayInvalid(){

        day = 9;

        boolean result = myToday.isToday(day);

        assertFalse(result);

    }

}
