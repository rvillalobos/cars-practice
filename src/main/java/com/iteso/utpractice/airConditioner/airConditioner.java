package com.iteso.utpractice.airConditioner;
import com.iteso.utpractice.airConditioner.airConditioner;

/**
 * Created by Sacrp on 9/15/15.
 */
public class airConditioner
{
    private double idealTemperature;
    private double insideTemperature;
    private double currentConditionerTemperature;

    public void setIdealTemperature(double iT)
    {
        idealTemperature = iT;
    }
    public void setInsideTemperature(double iT)
    {
        insideTemperature = iT;
    }
    public void setCurrentConditionerTemperature(double iT) { currentConditionerTemperature = iT; }
    public double getIdealTemperature()
    {
        return idealTemperature;
    }
    public double getInsideTemperature()
    {
        return insideTemperature;
    }
    public double getCurrentConditionerTemperature() { return currentConditionerTemperature; }
    public double finalTemperature()
    {
        return getCurrentConditionerTemperature() + getInsideTemperature();
    }


    public void adjustAirTemperature(double idealT, double insideT, double currentA)
    {
        if(insideT == idealT)
            return;

        if(insideT > idealT)
        {
            double counter = 0;
            double temp = insideT;

            while(temp != idealT)
            {
                counter --;
                temp--;
            }

            setCurrentConditionerTemperature(getCurrentConditionerTemperature() + counter);
        }

        if(insideT < idealT)
        {
            double counter = 0;
            double temp = insideT;

            while(temp != idealT)
            {
                counter ++;
                temp++;
            }

            setCurrentConditionerTemperature(getCurrentConditionerTemperature() + counter);
        }
        return;
    }
}
