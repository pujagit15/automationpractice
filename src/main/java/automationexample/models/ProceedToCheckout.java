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


public class ProceedToCheckout {
    private WebDriver webDriver;
    private static final Logger LOG = LoggerFactory.getLogger(Retry.class);
    AutomationCompletePage automationCompletePage;

    public ProceedToCheckout(WebDriver webDriver) {
        this.webDriver=webDriver;
        automationCompletePage = PageFactory.initElements(webDriver, AutomationCompletePage.class);

    }


    public void proceedToCheckout()
    {
        LOG.debug("Proceed to Checkout");
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-default button button-medium']")));
        automationCompletePage.proceedTOCheckout();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='cart_navigation clearfix']/a/span")));
        automationCompletePage.proceedTOCheckout2();

    }

}