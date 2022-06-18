package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.runners.TestRunner;
import org.testng.Assert;


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
        homeObj.search("Apple MacBook Pro 13-inch");
        homeObj.OpenProductAfterSearch();
        Assert.assertTrue(homeObj.getProduct_price().getText().contains("€"));

    }


}
