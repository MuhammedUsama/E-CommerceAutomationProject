package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.CategoriesPage;
import org.example.Pages.HomePage;
import org.example.runners.TestRunner;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class hoverCategoriesStepDef extends TestRunner {

    Actions action;
    HomePage homeObj;
    CategoriesPage catObj;
    @When("user hover and select category")
    public void user_hover_and_select_category() {

    action= new Actions(driver);
    homeObj= new HomePage(driver);
    action.moveToElement(homeObj.getComputersHover()).perform();
    homeObj.getDesktopsHover().click();

    }
    @Then("category changes successfully")
    public void category_changes_successfully() {

        catObj = new CategoriesPage(driver);
        Assert.assertEquals(catObj.getCategory(),"Desktops");
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));

    }


}
