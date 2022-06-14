package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.runners.TestRunner;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CurrenciesStepDef extends TestRunner {

    HomePage homeObj;
    Select select;
    @When("user change currency")
    public void user_change_currency() {
        homeObj = new HomePage(driver);
        select= new Select(homeObj.getCurrency());
        select.selectByVisibleText("Euro");


    }
    @Then("currency switches successfully")
    public void currency_switches_successfully() {



        homeObj = new HomePage(driver);
        Assert.assertTrue(homeObj.getProduct_price().getText().contains("€"));

    }


}
