package BDD;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterStepDef extends TestRunner{





    @Given("user open registration")
    public void user_open_registration() {

        HomePage homeObj= new HomePage(driver);
        homeObj.OpenRegisterPage();


    }
    @When("user enters valid registrations data")
    public void user_enters_valid_registrations_data() {

        RegistrationPage regObj = new RegistrationPage(driver);
       regObj.userRegistration("Mohamed","Usama","usama1@test.com","12345678");

    }
    @Then("user could register successfully")
    public void user_could_register_successfully() {

        RegistrationPage regObj = new RegistrationPage(driver);

        Assert.assertTrue(regObj.regResult().contains("Your registration completed"));

    }
}
