package com.globant;

import org.testng.annotations.Test;

public class EspnLogoutTest extends MainClass {
    @Test(dataProvider = "loginData", priority = 3)
    public void logOut(String emailAddress, String password) {
        log.info("Click on 'Log In' option");
        log.info("Type " + emailAddress + " in 'Email Address' field");
        log.info("Type " + password + " in 'Password' field");
        log.info("Click on 'Log In' button");
        log.info("Click on 'Log Out' option");
        log.info("Verify if successfully  the session were logged out");
        System.out.println();
    }
}
