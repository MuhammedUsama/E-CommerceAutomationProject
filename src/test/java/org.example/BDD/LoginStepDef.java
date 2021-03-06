package org.example.BDD;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.example.runners.TestRunner;
import org.testng.Assert;

public class LoginStepDef extends TestRunner {




    @Given("user open login page")
    public void user_open_login_page() {
        HomePage homeObj=new HomePage(driver);
        homeObj.OpenLoginPage();


    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {


        LoginPage loginObj = new LoginPage(driver);
        loginObj.Login("usamaa2111br@test.com","12345678");


    }
    @Then("user could login successfully")
    public void user_could_login_successfully() {


        LoginPage loginObj = new LoginPage(driver);
        Assert.assertTrue(loginObj.logRes().contains("My account"));


    }


}
