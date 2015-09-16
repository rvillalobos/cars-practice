package com.iteso.utpractice.season;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Season {
    String result = "Chino";
    public String whichSeason(int day, int month) {
        // Invalid
        if(day < 1 && month < 1 || month > 12)
            return "Invalid";
        else if(day > 31 && month == 1 || day > 31 && month == 3 || day > 31 && month == 5 || day > 31 && month == 7 || day > 31 && month == 8 || day > 31 && month == 10 || day > 31 && month == 12)
            return "Invalid";
        else if(day > 30 && month == 4 || day > 30 && month == 6 || day > 30 && month == 9 || day > 30 && month == 11)
            return "Invalid";
        else if(day > 28 && month == 2)
            return "Invalid";

        //Winter
        if(day >= 21 && month == 12)
            return "Winter";
        else if(month == 1 || month == 2)
            return "Winter";
        else if(day <= 20 && month == 3)
            return "Winter";

        //Spring
        if(day >= 22 && month == 3)
            return "Spring";
        else if(month == 4 || month == 5)
            return "Spring";
        else if(day <= 20 && month == 6)
            return "Spring";

        //Summer
        if(day >= 22 && month == 6)
            return "Summer";
        else if(month == 7 || month == 8)
            return "Summer";
        else if(day <= 20 && month == 9)
            return "Summer";

        //Autumn
        if(day >= 22 && month == 9)
            return "Autumn";
        else if(month == 10 || month == 11)
            return "Autumn";
        else if(day <= 20 && month == 12)
            return "Autumn";

        return result;
    }
}
