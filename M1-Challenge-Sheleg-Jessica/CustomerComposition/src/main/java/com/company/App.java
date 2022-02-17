package com.company;

public class App {
    public static void main(String[] args) {

        //Set up shipping address
        Address shippingAddress = new Address();
        shippingAddress.setStreet1("101 SouthSide Lane");
        shippingAddress.setStreet2("Apt 243");
        shippingAddress.setCity("Denver");
        shippingAddress.setState("Colorado");
        shippingAddress.setZip("34321");

        //set billing address
        Address billingAddress = new Address();
        billingAddress.setStreet1("343 NorthSide Lane");
        billingAddress.setStreet2("Apt 343");
        billingAddress.setCity("Austin");
        billingAddress.setState("Texas");
        billingAddress.setZip("27471");


        Customer customer = new Customer();
        customer.setFirstName("Jessica");
        customer.setLastName("Sheleg");
        customer.setEmail("jessica@gmail.com");
        customer.setPhoneNumber("4779577");
        customer.setRewardsMember(true);
        customer.setShippingAddress(shippingAddress);
        customer.setBillingAddress(billingAddress);



        System.out.println("------ Customer Info -------");
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getPhoneNumber());
        System.out.println(customer.isRewardsMember());
        System.out.println("Shipping Address: " + customer.getShippingAddress());
        System.out.println("Billing Address: " + customer.getBillingAddress());
        System.out.println("Customer's shipping state: " + customer.getShippingAddress().getState());


    }
}
