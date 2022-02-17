package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    Warrior max;

    @Before
    public void setUp() throws Exception{
        max = new Warrior("Max");
    }

    @Test
    public void testingDefaultsOfWarrior(){
        assertEquals("Max", max.getName());
        assertEquals(75, max.getStrength());
        assertEquals(100, max.getHealth());
        assertEquals(100, max.getStamina());
        assertEquals(50, max.getSpeed());
        assertEquals(10, max.getAttackPower());
        assertEquals(100, max.getShieldStrength());
        assertEquals(false, max.isRunning());
        assertEquals(false, max.isArrested());
    }



}