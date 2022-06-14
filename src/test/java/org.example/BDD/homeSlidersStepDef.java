package org.example.BDD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.runners.TestRunner;
import org.testng.Assert;

public class homeSlidersStepDef extends TestRunner {

    HomePage homeObj;

    @When("user click on the first slider")
    public void user_click_on_the_first_slider() {
       homeObj = new HomePage(driver);
       homeObj.ClickOnFirstSlider();
    }

    @Then("product on first slider is displayed")
    public void product_on_first_slider_is_displayed() {

        homeObj = new HomePage(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("iphone"));

    }

    @When("user click on the second slider")
    public void user_click_on_the_second_slider() {

        homeObj = new HomePage(driver);
        homeObj.ClickOnSecondSlider();

    }

    @Then("product on second slider is displayed")
    public void product_on_second_slider_is_displayed() {
        homeObj = new HomePage(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("nokia"));

    }



}
