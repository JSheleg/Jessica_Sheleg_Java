package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    ConverterSwitch converterSwitch;
    @Before
    public void setUp() throws Exception {
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void numberOfDayOfTheWeekConvertToNameOfTheDayOfTheWeek(){
        assertEquals("Monday", converterSwitch.convertDay(2));
        assertEquals("Thursday", converterSwitch.convertDay(5));
        assertEquals("Day of week is not valid", converterSwitch.convertDay(10));
    }

    @Test
    public void numberOfMonthConvertsToMonthOfYear(){
        assertEquals("February", converterSwitch.convertMonth(2));
        assertEquals("August", converterSwitch.convertMonth(8));
        assertEquals("This month doesn't exist", converterSwitch.convertMonth(24));
    }
}