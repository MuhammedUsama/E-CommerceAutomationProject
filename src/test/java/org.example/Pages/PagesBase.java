package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagesBase {

    WebDriver driver;


    public PagesBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }




}
