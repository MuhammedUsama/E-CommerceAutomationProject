package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PagesBase{
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[4]")
    WebElement ProductName;


    public String ProductExist()
    {

        return ProductName.getText();


    }

}
