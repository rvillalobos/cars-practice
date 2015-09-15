package com.iteso.utpractice.season;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Season {
    public String whichSeason(int day, int month) {
        if((day >= 1 && month >= 1) || (day <= 31 && month <= 12)) {
            switch (month) {
                case 1:
                    if(day <= 31 && day >= 21){
                        return "Winter";
                    } else {
                        return "Invalid";
                    }
                case 2:
                    if(day <= 28) {
                        return "Winter";
                    } else {
                        return "Invalid";
                    }
                case 3:
                    if(day < 21) {
                        return "Winter";
                    } else {
                        if(day <= 31 && day >= 21){
                            return "Spring";
                        } else {
                            return "Invalid";
                        }
                    }
                case 4:
                    if(day <= 30) {
                        return "Spring";
                    } else {
                        return "Invalid";
                    }
                case 5:
                    if (day <= 31) {
                        return "Spring";
                    } else {
                        return "Invalid";
                    }
                case 6:
                    if(day < 21) {
                        return "Spring";
                    } else {
                        if(day <= 30 && day >= 21){
                            return "Summer";
                        } else {
                            return "Invalid";
                        }
                    }
                case 7:
                    if (day <= 31) {
                        return "Summer";
                    } else {
                        return "Invalid";
                    }
                case 8:
                    if (day <= 31) {
                        return "Summer";
                    } else {
                        return "Invalid";
                    }
                case 9:
                    if(day < 21) {
                        return "Summer";
                    } else {
                        if(day <= 30 && day >= 21){
                            return "Autumn";
                        } else {
                            return "Invalid";
                        }
                    }
                case 10:
                    if (day <= 31) {
                        return "Autumn";
                    } else {
                        return "Invalid";
                    }
                case 11:
                    if (day <= 30) {
                        return "Autumn";
                    } else {
                        return "Invalid";
                    }
                case 12:
                    if(day < 21) {
                        return "Autumn";
                    } else {
                        if(day <= 30 && day >= 21){
                            return "Winter";
                        } else {
                            return "Invalid";
                        }
                    }
                default:
                    return "Invalid";
            }
        } else {
            return "Invalid";
        }
    }
}
