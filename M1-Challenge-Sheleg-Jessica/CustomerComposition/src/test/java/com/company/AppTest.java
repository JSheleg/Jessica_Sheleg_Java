package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

//    @Before
//    public void setUp() throws Exception {
//        //Set up shipping address
//        Address shippingAddress = new Address();
//        shippingAddress.setStreet1("101 SouthSide Lane");
//        shippingAddress.setStreet2("Apt 243");
//        shippingAddress.setCity("Denver");
//        shippingAddress.setState("Colorado");
//        shippingAddress.setZip("34321");
//
//        //set billing address
//        Address billingAddress = new Address();
//        billingAddress.setStreet1("343 NorthSide Lane");
//        billingAddress.setStreet2("Apt 343");
//        billingAddress.setCity("Austin");
//        billingAddress.setState("Texas");
//        billingAddress.setZip("27471");
//
//
//        Customer customer = new Customer();
//        customer.setFirstName("Jessica");
//        customer.setLastName("Sheleg");
//        customer.setEmail("jessica@gmail.com");
//        customer.setPhoneNumber("4779577");
//        customer.setRewardsMember(true);
//        customer.setShippingAddress(shippingAddress);
//        customer.setBillingAddress(billingAddress);
//
//    }

    @Test
    public void testCustomer(){
        Customer customer = new Customer();
        customer.setFirstName("Jessica");
        customer.setLastName("Sheleg");
        customer.setEmail("jessica@gmail.com");
        customer.setPhoneNumber("4779577");
        customer.setRewardsMember(true);

        assertEquals("Jessica", customer.getFirstName());
        assertEquals("Sheleg", customer.getLastName());
        assertEquals("jessica@gmail.com", customer.getEmail());
        assertEquals("4779577",customer.getPhoneNumber());
        assertEquals(true, customer.isRewardsMember());

    }
    @Test
    public void testingAddress(){
        Customer customer = new Customer();
        Address shippingAddress = new Address();
        customer.setShippingAddress(shippingAddress);
        Address billingAddress = new Address();
        customer.setBillingAddress(billingAddress);

        shippingAddress.setStreet1("101 SouthSide Lane");
        shippingAddress.setStreet2("Apt 243");
        shippingAddress.setCity("Denver");
        shippingAddress.setState("Colorado");
        shippingAddress.setZip("34321");

        billingAddress.setStreet1("343 NorthSide Lane");
        billingAddress.setStreet2("Apt 343");
        billingAddress.setCity("Austin");
        billingAddress.setState("Texas");
        billingAddress.setZip("27471");

        assertEquals("Colorado", customer.getShippingAddress().getState());
        assertEquals("Texas", customer.getBillingAddress().getState());
        assertEquals("101 SouthSide Lane", customer.getShippingAddress().getStreet1());

    }

}