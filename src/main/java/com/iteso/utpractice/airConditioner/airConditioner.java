package com.iteso.utpractice.airConditioner;
import com.iteso.utpractice.airConditioner.AirConditioner;

/**
 * Created by Sacrp on 9/15/15.
 */
public class AirConditioner
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
    public void setCurrentConditionerTemperature(double iT)
    {
        currentConditionerTemperature = iT;
    }

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
        double totalT = finalTemperature();


        if(totalT == idealT)
            return;

        else
        {
            double counter = 0;
            double temp = totalT;
            double newAirT = 0;

            if (totalT > idealT)
            {

                while (temp > idealT)
                {
                    counter = counter + 0.1;
                    temp = temp - 0.1;
                }
                newAirT = getCurrentConditionerTemperature() - counter;
                setCurrentConditionerTemperature(newAirT);
                return;
            }
            else if(totalT < idealT)
            {
                while (temp < idealT)
                {
                    counter += 0.1;
                    temp += 0.1;
                }
                newAirT = getCurrentConditionerTemperature() + counter;
                setCurrentConditionerTemperature(newAirT);
                return;
            }
        }
    }
}
