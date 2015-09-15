package com.iteso.utpractice.season;

/**
 * Created by rvillalobos on 9/15/14.
 */
public class Season {
    public String whichSeason(int day, int month) {
    	if(month <= 0 || month >= 32)
    		return "invalid";
    	if (month % 1 != 0)
    		return "invalid";
        return null;
    }
}
