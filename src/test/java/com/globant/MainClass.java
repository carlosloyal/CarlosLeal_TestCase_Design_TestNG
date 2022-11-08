package com.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class MainClass {
         protected static Logger log = LoggerFactory.getLogger(MainClass.class);

        @DataProvider(name = "loginData")
        public Object [][] getLoginData() {
            return new Object[][] {{"Carlos@email.com", "password"}, {"Arturo@email.com", "password2"}, {"Leal@email.com", "password3"}};
        }

        @DataProvider (name = "invalidData")
        public Object [][] getInvalidData() {
            return new Object[][] {{"Julio@email.com", "password4"}, {"Andres@email.com", "password5"}, {"Camila@email.com", "password6"}};
        }

        @BeforeSuite
        public void enrollAccount() {
            log.info("Open Browser");
            log.info("Go to https://www.espnqa.com/?_adbock=true&src=com");
            log.info("select the person icon in the navigation bar");
            log.info("If an account has not been created, select 'Log In' option");
            log.info("If needed, select 'Sign Up' option");
            log.info("If needed, create an account");
            log.info("Close Browser");
            System.out.println();
        }

        @BeforeTest
        public void openBrowser() {
            log.info("Open Browser");
            System.out.println();
        }

        @BeforeMethod
        public void removeCookies() {
            log.info("Go to https://www.espnqa.com/?_adbock=true&src=com");
            log.info("Select 'View site information' button");
            log.info("Click on 'Cookies' option");
            log.info("Remove all cookies");
            System.out.println();
        }

        @AfterTest
        public void closeBrowser() {
            log.info("Close Browser");
            System.out.println();
        }
    }


