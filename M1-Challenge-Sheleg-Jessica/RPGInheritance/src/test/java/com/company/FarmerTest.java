package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    Farmer john;

    @Before
    public void setUp() throws Exception {
         john = new Farmer("John");
    }

    @Test
    public void testingDefaultsOfFarmer(){
        assertEquals("John", john.getName());
        assertEquals(100, john.getHealth());
        assertEquals(75, john.getStamina());
        assertEquals(10, john.getSpeed());
        assertEquals(1, john.getAttackPower());
        assertEquals(false,john.isArrested());
        assertEquals(false, john.isHarvesting());
        assertEquals(false, john.isPlowing());
        assertEquals(false, john.isRunning());
    }

    @Test
    public void farmerPlow(){

        //plow method
        assertEquals(false, john.isPlowing());
        john.plow();
        assertEquals(true, john.isPlowing());
    }

    @Test
    public  void farmerHarvest(){
        //harvest method
        assertEquals(false, john.isHarvesting());
        john.harvest();
        assertEquals(true, john.isHarvesting());
    }


}