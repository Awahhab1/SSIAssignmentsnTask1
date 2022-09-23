package com.amazon.testcases;

import com.amazon.base.base;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends base {

    LoginPage loginpage;

    HomePage Hpage;

    // Constructor of Child class calls the constructor of parent class as we need to initlize properties
    public LoginPageTest(){
        super();
    }


    @BeforeMethod
    public void setUp(){

        // Call the initialization method from the base class
        initialization();

        loginpage= new LoginPage();


    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
         Hpage= loginpage.Login(prop.getProperty("email"),prop.getProperty("password"));



    }



    @AfterMethod

    public void tearDown() {
        driver.quit();
    }

}
