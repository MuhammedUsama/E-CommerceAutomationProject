package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SearchPage extends PagesBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }


    public int getSearchResultSize()
    {
        ArrayList <WebElement> elements = new ArrayList<WebElement>(driver.findElements(By.xpath("//div[@class='item-box']")));
        //elements= (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='item-grid']//child::div[3]"));
        int size =elements.size();
        System.out.println(size);
        return size;
    }




}
