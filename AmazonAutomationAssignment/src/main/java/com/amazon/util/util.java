package com.amazon.util;

import com.amazon.base.base;
import org.openqa.selenium.WebElement;

public class util extends base {


    public void verifyIsSelected(WebElement e)
    {
        if (!e.isSelected()){
            e.click();
        }
        else
        {
            System.out.println("Item Check box selected ");
        }
    }

}
