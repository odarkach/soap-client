package com.convertspeed.client;

import javax.xml.ws.soap.SOAPFaultException;
import org.testng.Assert;
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

    @Test
    public void convertNegativeTest () {
        Double actualResult = convertSpeedsSoap.convertSpeed (SpeedUnit.KILOMETERS_PERHOUR, SpeedUnit.CENTIMETERS_PERSECOND);
    }

    @Test(expectedExceptions = SOAPFaultException.class)
    public void checkResponseWithIncorrectFromUnitValue() {
        try {
            convertSpeedsSoap.convertSpeed(100, SpeedUnit.DASHA, SpeedUnit.MILES_PERHOUR);
        } catch (SOAPFaultException e) {
            Assert.assertTrue(e.getMessage().contains("'Dasha' is not a valid value for SpeedUnit"));
            throw e;
        }
    }
}
