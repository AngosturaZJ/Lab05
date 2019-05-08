package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature {
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = (float) (getValue()*1.8 + 32);
        return new Celsius(temp);
    }

    public String toString()
    {
        // TODO: Complete this method
        return getValue()+" C";
    }
}