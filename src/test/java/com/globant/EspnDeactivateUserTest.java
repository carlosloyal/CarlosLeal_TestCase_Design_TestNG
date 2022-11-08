package com.globant;

import org.testng.annotations.Test;

public class EspnDeactivateUserTest extends MainClass {
    @Test(dataProvider = "loginData", priority = 4)
    public void logOut(String emailAddress, String password) {
        log.info(" Click the person icon at the top right corner");
        log.info("Click on 'Log In' ");
        log.info("Insert" + emailAddress + " in 'Email Address' field");
        log.info("Type the " + password + " in 'Password ' field");
        log.info("Click  'Log In' button");
        log.info("Click on 'ESPN Profile' option");
        log.info("Click on 'Delete Account' option");
        log.info("Click on 'Yes, delete this account' button");
        log.info("Click on 'OK' button");
        System.out.println();
    }
}
