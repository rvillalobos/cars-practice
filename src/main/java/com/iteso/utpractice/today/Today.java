package com.iteso.utpractice.today;

import java.util.Calendar;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Today {
    public boolean isToday(int day) {
        if(day == Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
            return true;
        return false;
    }
}
