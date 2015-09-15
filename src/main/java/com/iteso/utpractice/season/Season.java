package com.iteso.utpractice.season;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Season {

    public Season(){

    }

    public String whichSeason(int day, int month) {

        if(month > 12 || day>31)
            return "Invalid";

        if(day == 0 || month==0)
            return "Invalid";

        if(month == 2 && day>28)
            return "Invalid";

        if(day>30 && (month== 4 || month == 6 || month == 9 || month == 11 || month == 12))
            return "Invalid";


        if(day >= 20 && day<=31 && month == 12 || month == 1 || month ==2 || month == 3)
        {
            if(month == 12 && day ==20)
                return"Autumn";

            if(month == 3 && day>=21) {
                return "Spring";
            }
            return "Winter";
        }

        if(day >= 20 && day<=31 && month == 3 || month == 4 || month == 5 || month == 6){

            if(month == 6 && day>=21) {
                return "Summer";
            }
            return "Spring";
        }

        if(day >= 20 && day<=31 && month == 6 || month == 7 || month == 8 || month == 9) {

            if(month == 9 && day>=21) {
                return "Autumn";
            }
            return "Summer";
        }

        if(day >= 20 && day<=31 && (month == 9 || month == 10 || month == 11 || month == 12)) {

            if(month == 12 && day>=21) {
                return "Winter";
            }
            return "Autumn";
        }

        return null;
    }


}
