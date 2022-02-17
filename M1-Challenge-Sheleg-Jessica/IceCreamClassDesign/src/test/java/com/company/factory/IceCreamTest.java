package com.company.factory;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {


        @Test
        public void getIceCream(){
            String[] ingredients = new String [] {"Strawberries", "Milk", "Vanilla"};
            IceCream iceCream = new IceCream("Strawberry", 5.0, 1.5,60,ingredients);

            assertEquals("Strawberry", iceCream.getFlavor());
            assertEquals(5.0, iceCream.getSalePrice(), 0);
            assertEquals(1.5, iceCream.getProductionCost(), 0);
            assertEquals(60, iceCream.getProductionTime(), 0);
            assertArrayEquals(ingredients, iceCream.getIngredients());
        }

        @Test
        public void iceCreamCost(){
            String[] ingredients = new String [] {"Strawberries", "Milk", "Vanilla"};
            IceCream iceCream = new IceCream("Strawberry", 5.0, 1.5,60,ingredients);
            assertEquals(3.5,iceCream.profit(iceCream.getSalePrice(),iceCream.getProductionCost()), 0);
        }



}