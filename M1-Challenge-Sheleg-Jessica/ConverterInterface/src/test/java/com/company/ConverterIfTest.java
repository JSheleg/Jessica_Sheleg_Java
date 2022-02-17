package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    ConverterIf converterIf;
    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();
    }

    @Test
    public void numberOfDayConvertsToNameOfDayOfWeek(){
        assertEquals("Monday", converterIf.convertDay(2));
        assertEquals("Friday", converterIf.convertDay(6));
        assertEquals("Day of the week doesn't exist!", converterIf.convertDay(17));
    }

    @Test
    public void numberOfMonthConvertsToMonthOfYear(){
        assertEquals("October", converterIf.convertMonth(10));
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("Number doesn't match a Month", converterIf.convertMonth(0));
    }
}