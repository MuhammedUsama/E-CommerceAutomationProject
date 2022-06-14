package org.example.runners;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

@CucumberOptions(

    features = "src/main/Features",
    glue ={"org.example"},
    plugin =
    {
            "pretty",
            "html:target/cucumber.html",
            "json:target/cucumber.json",
            "junit:target/cukes.xml",
            "rerun:target/rerun.txt",

    },
    tags="@smoke"


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
   @AfterMethod
   public void smokeBackToHome()
   {
       driver.navigate().to("https://demo.nopcommerce.com/");
   }


   @AfterSuite
    public void End()
   {
       //driver.quit();
   }

}
