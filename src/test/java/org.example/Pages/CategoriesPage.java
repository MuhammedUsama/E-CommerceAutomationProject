package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends PagesBase{
    public CategoriesPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement desktopCategory;


    public String getCategory()
    {
        return desktopCategory.getText();
    }
}
