package com.globant;

import org.testng.annotations.Test;

public class EspnLoginTest extends MainClass {
    @Test(dataProvider = "loginData", priority = 1)
    public void logIn(String emailAddress, String password) {
        log.info("Click the  person icon");
        log.info("Click on 'Log In' option");
        log.info("Type " + emailAddress + " in 'Email Address' field");
        log.info("Type " + password + " in 'Password' field");
        log.info("Click on 'Log In' button");
        log.info("Verify if successfully logged in");
        System.out.println();
    }

    @Test (dataProvider = "invalidData", priority = 2)
    public void FailedLogIn(String emailAddress, String password) {
        log.info("Click on 'Log In' option");
        log.info("Type " + emailAddress + " in 'Username or Email Address' field");
        log.info("Type " + password + " in 'Password (case sensitive)' field");
        log.info("Click on 'Log In' button");
        log.info("Verify if the 'the data entered is incorrect' is shown");
        System.out.println();
    }
}
