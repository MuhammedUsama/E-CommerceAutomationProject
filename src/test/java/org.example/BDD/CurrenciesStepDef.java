package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.runners.TestRunner;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class CurrenciesStepDef extends TestRunner {

    HomePage homeObj;
    @When("user change currency")
    public void user_change_currency() {
        homeObj = new HomePage(driver);
        homeObj.ChangeCurreny("Euro");

    }
    @Then("currency switches successfully")
    public void currency_switches_successfully() {



        homeObj = new HomePage(driver);
        int size=homeObj.getHomeProductsTableSize();
        List <WebElement> ProductsPrices= homeObj.getHomeProductsTablePrices();
        for(int i=0;i<size;i++)
        {
            Assert.assertTrue(ProductsPrices.get(i).getText().contains("€"));

        }



    }


}
