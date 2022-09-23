package com.amazon.pages;

import com.amazon.base.base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends base {


    //Page Factory -- Object Repository

    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElement signIndropdown;

    @FindBy (className="nav-action-inner")
    WebElement signIn;

    @FindBy(id="ap_email")
    WebElement userEmail;

    @FindBy(id ="continue")
    WebElement continueButton;

    @FindBy(id="ap_password")
    WebElement password;

    @FindBy(id="signInSubmit")
    WebElement loginButton;


    public LoginPage(){

        PageFactory.initElements(driver,this); // this point to current class object
    }

    public HomePage Login(String email, String PW){
        Actions action=new Actions(driver);
        action.moveToElement(signIndropdown).build().perform();
        signIn.click();
        userEmail.sendKeys(email);
        continueButton.click();
        password.sendKeys(PW);
        loginButton.click();
        return new HomePage();
    }




}
