package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PagesBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="gender-male")
    WebElement malegenderRadBtn;

    @FindBy(id="gender-female")
    WebElement femalegenderRadBtn;

    @FindBy(id="FirstName")
    WebElement fnTxtBox;

    @FindBy(id="LastName")
    WebElement lnTxtBox;

    @FindBy(id="Email")
    WebElement emailTxtBox;

    @FindBy(id="Password")
    WebElement pwTxtBox;

    @FindBy(id="ConfirmPassword")
    WebElement conpwTxtBox;

    @FindBy(id="register-button")
    WebElement regBtn;


    @FindBy(xpath="//div[@class='page-body']/div[@class='result']")
    WebElement bodyMsg;


    public void userRegistration(String fn, String ln, String e, String pw)
    {
        malegenderRadBtn.click();
        fnTxtBox.sendKeys(fn);
        lnTxtBox.sendKeys(ln);
        emailTxtBox.sendKeys(e);
        pwTxtBox.sendKeys(pw);
        conpwTxtBox.sendKeys(pw);
        regBtn.submit();

    }

    public String regResult()
    {
        return bodyMsg.getText();
    }





}
