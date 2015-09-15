package com.iteso.utpractice.today;

import java.util.Calendar;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Today {
    public boolean isToday(int day) {

        Calendar myCalendar;
        int today;

        myCalendar = Calendar.getInstance();
        today = myCalendar.get(Calendar.DAY_OF_WEEK);

        if(day < 1 && day > 7) {
            return false;
        } else {
            if(today == day){
                return true;
            } else {
                return false;
            }
        }
    }
}
