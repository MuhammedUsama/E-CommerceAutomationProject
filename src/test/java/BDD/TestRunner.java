package BDD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

@CucumberOptions(

    features = "src/main/Features/Register.feature",
    glue ={"BDD"},
    tags="@SuccessfullyRegister"


)



public class TestRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver=null;


   @BeforeSuite
    public void Start()
   {
       String Chromepath=System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", Chromepath);
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://demo.nopcommerce.com/");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


   }



   @AfterSuite
    public void End()
   {
       driver.quit();
   }

}
