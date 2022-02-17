package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class IceCreamTest {




    @Test
    public void getIceCream(){
        IceCream iceCream = new IceCream(
                "Strawberry",
                4.75,
                20
        );

       assertEquals("Strawberry", iceCream.getFlavor());
       assertEquals(4.75, iceCream.getPrice(),0.1);
       assertEquals(20, iceCream.getQuantity());
    }

    @Test
    public void salesOfAFlavor(){
        IceCream iceCream = new IceCream("Strawberry",4.75,20);
        IceCream iceCream2 = new IceCream("Vanilla",5.30,30);
        IceCream iceCream3 = new IceCream("Chocolate", 4.39, 50);

        assertEquals(95.0, iceCream.totalSalesForAFlavor(iceCream.getFlavor(),iceCream.getPrice(), iceCream.getQuantity()), 0);
        assertEquals(159.0, iceCream2.totalSalesForAFlavor(iceCream2.getFlavor(),iceCream2.getPrice(), iceCream2.getQuantity()), 0);
        assertEquals(219.50, iceCream3.totalSalesForAFlavor(iceCream3.getFlavor(),iceCream3.getPrice(), iceCream3.getQuantity()), 0.1);



    }



}