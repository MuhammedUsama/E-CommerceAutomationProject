package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PagesBase{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[3]")
    WebElement ProductName;


    public String ProductExist()
    {

        return ProductName.getText();


    }
}
