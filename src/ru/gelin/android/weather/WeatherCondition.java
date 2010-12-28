package ru.gelin.android.weather;

//import java.net.URL;

/**
 *  Common weather conditions.
 */
public interface WeatherCondition {
    
    /**
     *  Returns condition as a human readable text.
     */
    String getConditionText();
    
    /**
     *  Returns URL to condition icon.
     */
    //URL getConditionIcon();
    
    /**
     *  Returns the temperature in default units.
     */
    Temperature getTemperature();
    
    /**
     *  Returns the temperature in specified units.
     */
    Temperature getTemperature(UnitSystem units);
    
    /**
     *  Returns humidity as a human readable text.
     *  Can return null. 
     */
    String getHumidityText();
    
    /**
     *  Returns wind conditions as a human readable text.
     *  Can return null.
     */
    String getWindText();
    

}
