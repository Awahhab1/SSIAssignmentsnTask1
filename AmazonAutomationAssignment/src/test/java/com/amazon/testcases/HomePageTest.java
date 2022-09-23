package com.amazon.testcases;

import com.amazon.base.base;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends base {


    LoginPage loginpage;
    HomePage homePage;

    HomePageTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp(){

        initialization();
        loginpage= new LoginPage();
        homePage= loginpage.Login(prop.getProperty("email"),prop.getProperty("password"));

    }


    @Test(priority = 1)
    public void verifyAddtoCartTest(){

        homePage.validateaddtocart(prop.getProperty("searchbartext"));
    }


}
