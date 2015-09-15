package com.iteso.utpractice.today;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Today {
    public boolean isToday(int day) {
        Calendar mc = Calendar.getInstance();
        int dt =  mc.get(Calendar.DAY_OF_WEEK);
      if(dt == day)
          return true;
        else
            return false;
    }
}
