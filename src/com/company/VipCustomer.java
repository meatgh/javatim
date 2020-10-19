package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("default name", 100.5, "me@myemail.com");
        System.out.println("constructor with no parameters");
    }

    public VipCustomer(String name, String emailAddress){
        this(name, 100.2, emailAddress);
        System.out.println("Constructor with only two parameters");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
//        this(name, creditLimit, emailAddress);
        System.out.println("constructor with all the parameters");
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        //System.out.println("An Empty constructor is created, let's see if it is working");
    }





    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
