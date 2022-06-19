package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PagesBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginBtn;


    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerBtn;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[2]")
    WebElement firstSlider;

    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    WebElement secondSlider;

    @FindBy(id="customerCurrency")
    WebElement currency;

    @FindBy(id = "price-value-4")
    WebElement Product_price;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    WebElement ComputersHover;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[1]/a")
    WebElement DesktopsHover;



    @FindBy(id="small-searchterms")
    WebElement searchTextField;

    @FindBy(xpath= "//button[@type='submit']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='item-box'][1]")
    WebElement firstSearchResult;

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


    public void ChangeCurreny(String text)
    {

        Select select= new Select(currency);
        select.selectByVisibleText(text);

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
    public void OpenProductAfterSearch()
    {
        firstSearchResult.click();
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

    public int getHomeProductsTableSize()
    {
        List<WebElement> elements = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        //elements= (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='item-grid']//child::div[3]"));
        int size =elements.size();
        System.out.println(size);
        return size;
    }

    public List getHomeProductsTablePrices()
    {
        List<WebElement> elements = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return elements;
    }




}
