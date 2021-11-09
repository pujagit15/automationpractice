package automationexample.models;
import automationexample.pages.AutomationCompletePage;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.tools.ant.taskdefs.Retry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class AddToCart {
    private WebDriver webDriver;
    private static final Logger LOG = LoggerFactory.getLogger(Retry.class);
    AutomationCompletePage automationCompletePage;

    public AddToCart(WebDriver webDriver) {
        this.webDriver=webDriver;
        automationCompletePage = PageFactory.initElements(webDriver, AutomationCompletePage.class);

    }


    public void addToCart()
    {
        LOG.debug("Add To Cart");
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-image-container']/a[@class='product_img_link']")));
        automationCompletePage.productDetail();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
        automationCompletePage.addToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-default button button-medium']")));


    }

}