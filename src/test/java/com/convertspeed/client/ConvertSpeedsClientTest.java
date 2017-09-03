package com.convertspeed.client;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ConvertSpeedsClientTest {

    private ConvertSpeedClient convertSpeedClient = new ConvertSpeedClient();
    private ConvertSpeedsSoap convertSpeedsSoap = convertSpeedClient.client;

    @Test
    public void convert0SpeedsTest () {
        Double actualResult = convertSpeedsSoap.convertSpeed(0, SpeedUnit.KILOMETERS_PERHOUR, SpeedUnit.CENTIMETERS_PERSECOND);
        assertEquals (0, actualResult, 1e-15);
    }

    @Test
    public void convertMaxValueSpeedsTest () {
        Double actualResult = convertSpeedsSoap.convertSpeed(Double.MAX_VALUE, SpeedUnit.KILOMETERS_PERHOUR, SpeedUnit.KILOMETERS_PERHOUR);
        assertEquals (Double.MAX_VALUE, actualResult);
    }

    @Test
    public void convertMaxValue1SpeedsTest () {
        Double actualResult = convertSpeedsSoap.convertSpeed(Double.MAX_VALUE, SpeedUnit.KILOMETERS_PERHOUR, SpeedUnit.CENTIMETERS_PERSECOND);
        assertEquals (Double.isInfinite(actualResult), true);
    }

    @Test
    public void convertNanSpeedsTest () {
        Double actualResult = convertSpeedsSoap.convertSpeed(Double.NaN, SpeedUnit.KILOMETERS_PERHOUR, SpeedUnit.CENTIMETERS_PERSECOND);
        assertEquals (Double.isNaN(actualResult), true);
    }

    @Test
    public void convertPositiveInfinitySpeedsTest () {
        Double actualResult = convertSpeedsSoap.convertSpeed(Double.POSITIVE_INFINITY, SpeedUnit.KILOMETERS_PERHOUR, SpeedUnit.CENTIMETERS_PERSECOND);
        assertEquals (Double.isInfinite(actualResult), true);
    }
}
