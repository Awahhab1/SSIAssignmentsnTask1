package com.amazon.pages;

import com.amazon.base.base;
import com.amazon.util.util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends base {

    public util UtilObject = new util();
    @FindBy(id="twotabsearchtextbox")
    WebElement Searchbar;


    @FindBy(id="nav-search-submit-button")
    WebElement searchButton;
    @FindBy(xpath ="//li[@id='p_89/Apple']//child::i" ) //
    WebElement appleCheckbox;


    @FindBy(id="a-autoid-0-announce")
    WebElement sortbydropdown;

    @FindBy(id="s-result-sort-select_4")
    WebElement arrivals_option;


    @FindBy(xpath="//img[@class='s-image' and @data-image-index=1]")
    WebElement PhoneImage;

    @FindBy(id="add-to-cart-button")
    WebElement add_to_cart;

    @FindBy (xpath = "(//i[@class='a-icon a-icon-checkbox'])[2]")
    WebElement elementCheckbox;

    @FindBy(xpath="//a[contains(text(),'Go to Cart')]")
    WebElement goToCart;
    public HomePage(){

        PageFactory.initElements(driver,this); // this point to current class object
    }

    public String ValidateHomePageTile(){
        return driver.getTitle();
    }

    public void validateaddtocart(String keyword){
        Searchbar.sendKeys(keyword);
        searchButton.click();
        boolean isDisplayed = appleCheckbox.isDisplayed();


        if (isDisplayed==true){
        appleCheckbox.click();
        }


        //Select sortby_dropdown = new Select(sortbydropdown);
        //sortby_dropdown.selectByIndex(4);
        sortbydropdown.click();
        arrivals_option.click();
        PhoneImage.click();

        add_to_cart.click();
        if (goToCart.isDisplayed()) {
            goToCart.click();
        }
        UtilObject.verifyIsSelected(elementCheckbox);




       // Assert.assertTrue(is_Selected);

       // if (is_Selected== true)
       // {
         //   System.out.println("Check box selected successfully");
        //}
    }
}
