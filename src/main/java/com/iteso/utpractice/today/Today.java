package com.iteso.utpractice.today;

import java.util.Calendar;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Today {

    int dia;
    Calendar myCalendar;

    public Today(){

        dia=0;
        myCalendar = Calendar.getInstance();
    }

    public boolean isToday(int day) {

        dia = myCalendar.get(Calendar.DAY_OF_WEEK);

        if(day == dia)
        {
            return true;
        }
        else
            return false;


    }
}
