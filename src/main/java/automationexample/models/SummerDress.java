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


public class SummerDress {
    private WebDriver webDriver;
    private static final Logger LOG = LoggerFactory.getLogger(Retry.class);
    AutomationCompletePage automationCompletePage;

    public SummerDress(WebDriver webDriver) {
        this.webDriver=webDriver;
        automationCompletePage = PageFactory.initElements(webDriver, AutomationCompletePage.class);

    }


    public void summerDressAccess() {
        LOG.debug("Clicking on Summer Dress");
        WebDriverWait wait = new WebDriverWait(webDriver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='last']/a[contains(@title,'You will find here all woman fashion collections')]")));
        automationCompletePage.clickWomen();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")));
        automationCompletePage.clickDress();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='block_content']/ul/li[@class='last']/a")));
        automationCompletePage.clickSummerDress();

    }

}