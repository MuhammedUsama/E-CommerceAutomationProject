package org.example.BDD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.ShoppingCartPage;
import org.example.runners.TestRunner;
import org.testng.Assert;

public class ShoppingCartStepDef extends TestRunner {


    HomePage homeObj;
    @When("user add a product to Shopping Cart")
    public void user_add_a_product_to_shopping_cart() throws InterruptedException {

        homeObj= new HomePage(driver);
        homeObj.OpenProductShoppingCart();
        homeObj.AddToShoppingCart();
        Assert.assertTrue(homeObj.AddedShoppingCart().contains("The product has been added"));
        homeObj.OpenShoppingCart();

    }
    ShoppingCartPage ShoppingCartObj;
    @Then("product is added successfully to Shopping Cart")
    public void product_is_added_successfully_to_shopping_cart() {



        ShoppingCartObj= new ShoppingCartPage(driver);
        Assert.assertTrue(ShoppingCartObj.ProductExist().contains("Apple"));


    }


}
