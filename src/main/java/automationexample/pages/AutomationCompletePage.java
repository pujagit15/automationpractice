package automationexample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AutomationCompletePage {

    @FindBy(how = How.XPATH, using="//li[@class='last']/a[contains(@title,'You will find here all woman fashion collections')]")
    public WebElement clickWomen;

    @FindBy(how = How.XPATH, using="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")
    public WebElement dressButton;

    @FindBy(how = How.XPATH, using="//div[@class='block_content']/ul/li[@class='last']/a")
    public WebElement summerDressButton;

    @FindAll
    ({@FindBy(how = How.XPATH, using="//div[@class='product-image-container']/a[@class='product_img_link']")})
    protected List<WebElement> productsLink;

    @FindBy(how = How.XPATH, using= "//button[@type='submit']")
    public WebElement addToCart;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
    protected WebElement proceedTocheckout;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']/a/span")
    protected WebElement proceedTocheckout2;

    @FindBy(xpath = "//li[@class='step_current second']/span")
    protected WebElement signInBar;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    protected WebElement login;


    public void clickWomen(){
        clickWomen.click();
    }


    public void clickDress(){
        dressButton.click();
    }

    public void clickSummerDress()
    {
        summerDressButton.click();
    }

    public void productDetail()
    {
        productsLink.get(0).click();

    }

    public void addToCart()
    {
        addToCart.click();
    }


    public void proceedTOCheckout()
    {
        proceedTocheckout.click();

    }

    public void proceedTOCheckout2()
    {
        proceedTocheckout2.click();

    }

    public String signInBar()
    {
        return signInBar.getText();
    }

    public String signInButton()
    {
        return login.getText();
    }

}