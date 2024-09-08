package com.tight.coupling;

public class TightCouplingExample {

    public static void main(String[] args) {

        UserManager UserManager = new UserManager();

        System.out.println(UserManager.getUserInfo());
    }
}
