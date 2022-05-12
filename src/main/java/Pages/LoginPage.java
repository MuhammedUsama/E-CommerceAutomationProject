package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PagesBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "Email")
    WebElement Email;


    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(xpath = "//div[@class='buttons']/button[@type='submit']")
    WebElement LoginBtn;


    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    WebElement myAccBtn;

    public void Login(String email,String pw)
    {
        Email.sendKeys(email);
        Password.sendKeys(pw);
        LoginBtn.submit();
    }

    public String logRes()
    {
        return myAccBtn.getText();
    }

}
