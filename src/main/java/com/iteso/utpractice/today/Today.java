package com.iteso.utpractice.today;

import java.util.Calendar;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Today {
    public boolean isToday(int day) {
       if(day >= 1 && day <= 7)
           if(day == Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
               return true;
            else
               return false;
        else
           return false;
    }
}
