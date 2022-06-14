package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.SearchPage;
import org.example.runners.TestRunner;
import org.testng.Assert;

public class SearchStepDef extends TestRunner {


    HomePage homeObj;
    SearchPage searchObj;
    @When("user search for a product with {string}")
    public void user_search_for_a_product_with(String s) {

        homeObj= new HomePage(driver);
        homeObj.search(s);

    }
    @Then("product is found successfully")
    public void product_is_found_successfully() {

        searchObj = new SearchPage(driver);

        Assert.assertTrue(driver.getCurrentUrl().contains("search?q"));
        //Assert.assertTrue(searchObj.getSearchResultSize()>0);

    }








}
