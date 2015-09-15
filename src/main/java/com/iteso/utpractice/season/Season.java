package com.iteso.utpractice.season;

/**
 * Created by Guillermo Roldan on 9/15/14.
 */
public class Season {
    public String whichSeason(int day, int month) {
      if(month <= 0 || month >= 13)
       return "month must be between 1 and 12";

      if(month % 1 != 0)
        return "month must be a int number";

      if(month == 2 && day >=29)
        return "February dont have more than 29 days";

      if((month == 1 || month == 3 ||month == 5 || month == 7|| month == 8 || month == 10 || month == 12) && (day < 30))
        return "the month you select have 31 days not 30";

      if(day < 0 || day > 31)
        return "there are no more than 31 days in any month";

      if(day %1 !=0)
        return "days can only be a int value";

      switch (month) {

        case 1: return "Winter";
        case 2: return "Winter";
        case 3: if(21 > day){
                   return "Winter";
                }else {
                    return "Spring";
                  }
        case 4: return "Spring";
        case 5: return "Spring";
        case 6: if(day < 21){
                   return "Spring";
                  }else{
                     return "Summer";}
        case 7: return "Summer";
        case 8: return "Summer";
        case 9:  if(day < 21){
                   return "Summer";
                    }else{
                      return "Autumn";}
        case 10: return "Autumn";
        case 11: return "Autumn";
        case 12: if(day < 21){
                   return "Autumn";
                    }else{
                       return "Winter";}


}

        return null;
    }
}

