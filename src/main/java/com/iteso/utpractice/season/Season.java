package com.iteso.utpractice.season;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Season {
    public String whichSeason(int day, int month) {

        if(day >=32 || month >=13 || day<=0 || month<=0 ||(month==2 && day>28))
            return "Invalid";

        else if((day>=21 && month==12) || ((day>=1 && 1<=month) && (month<=3 && day<=20)))
            return "Winter";

        else if((day>=21 && month==3) || ((day>=1 && 4<=month) && (month<=6 && day<=20)))
            return "Spring";

        else if((day>=21 && month==6) || ((day>=1 && 7<=month) && (month<=9 && day<=20)))
            return "Summer";

        else if((day>=21 && month==9) || ((day>=1 && 10<=month) && (month<=12 && day<=20)))
            return "Autumn";

        else
            return null;
    }
}
