package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PagesBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginBtn;


    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerBtn;


    public void OpenLoginPage()
    {
        loginBtn.click();
    }

    public void OpenRegisterPage()
    {
        registerBtn.click();
    }


}
