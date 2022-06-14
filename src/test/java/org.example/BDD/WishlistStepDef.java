package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.WishlistPage;
import org.example.runners.TestRunner;
import org.testng.Assert;

public class WishlistStepDef extends TestRunner {

    HomePage homeObj;
    @When("user add a product to wishlist")
    public void user_add_a_product_to_wishlist() {



        homeObj= new HomePage(driver);
        homeObj.OpenProductWishlist();
        homeObj.AddToWishlist();
        Assert.assertTrue(homeObj.AddedToWishlist().contains("The product has been added"));
        homeObj.OpenWishlist();

    }

    WishlistPage wishlistObj;
    @Then("product is added successfully to wishlist")
    public void product_is_added_successfully_to_wishlist() {



        wishlistObj= new WishlistPage(driver);
        Assert.assertTrue(wishlistObj.ProductExist().contains("Apple"));
    }



}
