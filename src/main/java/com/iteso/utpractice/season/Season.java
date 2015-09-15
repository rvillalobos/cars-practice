package com.iteso.utpractice.season;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Season {
    public String whichSeason(int day, int month) {
        if(day <= 0 || month <=0 || month >12 || day > 31)
            return "Invalid";
        if(month == 2 && day >28)
            return "Invalid";
        if((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30))
            return "Invalid";
        switch (month){
            case 1: return "Winter";
            case 2: return "Winter";
            case 3: if(day < 21)return "Winter";
                else return "Spring";
            case 4: return "Spring";
            case 5: return "Spring";
            case 6: if(day < 21) return "Spring";
                else return "Summer";
            case 7: return "Summer";
            case 8: return "Summer";
            case 9:  if(day < 21) return "Summer";
                else return "Autumn";
            case 10: return "Autumn";
            case 11: return "Autumn";
            case 12: if(day < 21) return "Autumn";
                else return "Winter";
        }
        return null;
    }
}
