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
        if(insideT == idealT)
            return;

        else
        {
            double counter = 0;
            double temp = insideT;
            double newAirT = 0;

            if (insideT > idealT)
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
            else if(insideT < idealT)
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
