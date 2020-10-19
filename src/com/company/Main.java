package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println("yes, it's working. Let's get going!!");
        VipCustomer test = new VipCustomer();
        VipCustomer test1 = new VipCustomer("Syed", "syed@rahman.com");
        VipCustomer test2 = new VipCustomer("Syed", 1000.5, "syed@rahman.com");


        System.out.println(test.getName());
        System.out.println(test.getEmailAddress());
        System.out.println(test.getCreditLimit());
    }
}
