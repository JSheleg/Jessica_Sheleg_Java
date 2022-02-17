package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    Constable rob;

    @Before
    public void setUp() throws Exception {
        rob = new Constable("Rob", "city");
    }

    @Test
    public void testingDefaultsOfConstable(){
        assertEquals("Rob", rob.getName());
        assertEquals(60, rob.getStrength());
        assertEquals(100, rob.getHealth());
        assertEquals(60, rob.getStamina());
        assertEquals(20, rob.getSpeed());
        assertEquals(5, rob.getAttackPower());
        assertEquals(false, rob.isRunning());
        assertEquals(false, rob.isArrested());
        assertEquals("city", rob.getJurisdiction());

    }

}