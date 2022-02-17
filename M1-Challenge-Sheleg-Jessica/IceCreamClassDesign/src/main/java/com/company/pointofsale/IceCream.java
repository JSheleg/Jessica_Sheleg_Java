package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public IceCream() {
    }

    public double totalSalesForAFlavor(String flavor, double price, int quantity){
        if(flavor == "strawberry"){
           double sales = price * quantity;
            System.out.println("Total sales of Strawberry were: " + sales);
            return sales;

        }else if(flavor == "vanilla"){
            double sales = price * quantity;
            System.out.println("Total sales of vanilla were: " + sales);
            return sales;
        }else{
            double sales = price * quantity;
            System.out.println("Total sales of chocolate were: " + sales);
            return sales;
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
