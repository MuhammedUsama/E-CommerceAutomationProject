package org.example.BDD;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.runners.TestRunner;
import org.testng.Assert;

import java.util.ArrayList;

public class FollowUsStepDef extends TestRunner {

    HomePage homeObj;

    @When("user click on fb link")
    public void user_click_on_fb_link() throws InterruptedException {
        homeObj = new HomePage(driver);
        homeObj.OpenfbLink();

        Thread.sleep(2000);


    }

    @Then("fb is opened")
    public void fb_is_opened() {
        homeObj = new HomePage(driver);
        //homeObj.switchTabByIndex(1);
        ArrayList<String> availableWindows= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(availableWindows.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
        driver.close();
        driver.switchTo().window(availableWindows.get(0));



    }

    @When("user click on twitter link")
    public void user_click_on_twitter_link() throws InterruptedException {
        homeObj = new HomePage(driver);
        homeObj.OpentwiterLink();

        Thread.sleep(2000);

    }
    @Then("twitter is opened")
    public void twitter_is_opened() {
        homeObj = new HomePage(driver);
        //homeObj.switchTabByIndex(1);
        ArrayList<String> availableWindows= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(availableWindows.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("twitter"));
        driver.close();
        driver.switchTo().window(availableWindows.get(0));
    }





    @When("user click on youtube link")
    public void user_click_on_youtube_link() throws InterruptedException {
        homeObj = new HomePage(driver);
        homeObj.OpenyouTubeLink();

        Thread.sleep(2000);
    }
    @Then("youtube is opened")
    public void youtube_is_opened() {
        homeObj = new HomePage(driver);
        //homeObj.switchTabByIndex(1);
        ArrayList<String> availableWindows= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(availableWindows.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));
        driver.close();
        driver.switchTo().window(availableWindows.get(0));
    }


    @When("user click on rss link")
    public void user_click_on_rss_link() throws InterruptedException {
        homeObj = new HomePage(driver);
        homeObj.OpenrssLink();

        Thread.sleep(2000);
    }
    @Then("rss is opened")
    public void rss_is_opened() {
        homeObj = new HomePage(driver);
        //homeObj.switchTabByIndex(1);
        ArrayList<String> availableWindows= new ArrayList<String>(driver.getWindowHandles());
        Assert.assertTrue(availableWindows.size()>1);
        //driver.close();
        //driver.switchTo().window(availableWindows.get(0));
    }


}
