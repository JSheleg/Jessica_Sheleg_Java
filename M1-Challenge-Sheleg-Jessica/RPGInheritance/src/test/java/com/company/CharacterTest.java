package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    Farmer john;
    Constable rob;
    Warrior max;
    @Before
    public void setUp() throws Exception{
        john = new Farmer("John");
        rob = new Constable("Rob", "city");
        max = new Warrior("Max");
    }

    @Test
    public void characterAttacksCharacter(){
        john.attack(rob);
        john.attack(max);
        assertEquals(99, rob.getHealth());
        assertEquals(99,rob.getHealth());
        rob.attack(john);
        rob.attack(max);
        assertEquals(95,john.getHealth());
        assertEquals(94,max.getHealth());
        max.attack(john);
        max.attack(rob);
        assertEquals(85, john.getHealth());
        assertEquals(89, rob.getHealth());

    }

    @Test
    public void constableArrestsCharacter(){
        rob.arrest(john);
        rob.arrest(max);

        assertEquals(true,john.isArrested());
        assertEquals(true, max.isArrested());

    }


}