package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends PagesBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginBtn;


    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerBtn;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    WebElement firstSlider;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    WebElement secondSlider;

    @FindBy(id="customerCurrency")
    WebElement currency;

    @FindBy(xpath = "//span[@class='price actual-price']")
    WebElement Product_price;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    WebElement ComputersHover;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[1]/a")
    WebElement DesktopsHover;

    @FindBy(id="small-searchterms")
    WebElement searchTextField;

    @FindBy(xpath= "//button[@type='submit']")
    WebElement searchButton;

    @FindBy(linkText = "Facebook")
    WebElement fbLink;

    @FindBy(linkText = "Twitter")
    WebElement twitterLink;

    @FindBy(linkText = "RSS")
    WebElement rssLink;

    @FindBy(linkText = "YouTube")
    WebElement youTubeLink;

    @FindBy(xpath = "(//button[@class='button-2 add-to-wishlist-button'])[2]")
    WebElement ProductWishlist;

    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addToWishlist;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement AddedToWishlist;

    @FindBy(linkText = "wishlist")
    WebElement wishlist;

    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
    WebElement ProductShoppingCart;

    @FindBy(id="add-to-cart-button-4")
    WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement AddedToShoppingCart;

    @FindBy(linkText = "shopping cart")
    WebElement ShoppingCart;









    public void OpenLoginPage()
    {
        loginBtn.click();
    }

    public void OpenRegisterPage()
    {
        registerBtn.click();
    }

    public void ClickOnFirstSlider()
    {firstSlider.click();}

    public void ClickOnSecondSlider()
    {secondSlider.click();}


    public WebElement getCurrency()
    {
        return currency;
    }

    public WebElement getProduct_price()
    {
        return Product_price;
    }

    public WebElement getComputersHover()
    {
        return ComputersHover;
    }

    public WebElement getDesktopsHover()
    {
        return DesktopsHover;
    }

    public void search(String s)
    {
        searchTextField.sendKeys(s);
        searchButton.click();
    }

    public void OpenfbLink()
    {
        fbLink.click();
    }


    public void OpentwiterLink()
    {
        twitterLink.click();
    }


    public void OpenrssLink()
    {
        rssLink.click();
    }


    public void OpenyouTubeLink()
    {
        youTubeLink.click();
    }

    public void switchTabByIndex(int x)
    {
        ArrayList<String> availableWindows= new ArrayList<String>(driver.getWindowHandles());
        if(!availableWindows.isEmpty())
        {
            driver.switchTo().window(availableWindows.get(x));
        }


    }

    public void OpenProductWishlist()
    {
        ProductWishlist.click();
    }

    public void AddToWishlist()
    {
        addToWishlist.click();
    }

    public String AddedToWishlist()
    {
        return AddedToWishlist.getText();
    }

    public void OpenWishlist()
    {wishlist.click();}

    public void OpenProductShoppingCart()
    {
        ProductShoppingCart.click();
    }

    public void AddToShoppingCart()
    {
        addToCart.click();
    }

    public String AddedShoppingCart()
    {
        return AddedToShoppingCart.getText();
    }

    public void OpenShoppingCart()
    {ShoppingCart.click();}




}
