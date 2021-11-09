package automationexample.models;
import automationexample.pages.AutomationCompletePage;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.tools.ant.taskdefs.Retry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SignIn {
    private WebDriver webDriver;
    private static final Logger LOG = LoggerFactory.getLogger(Retry.class);
    AutomationCompletePage automationCompletePage;

    public SignIn(WebDriver webDriver) {
        this.webDriver=webDriver;
        automationCompletePage = PageFactory.initElements(webDriver, AutomationCompletePage.class);

    }


    public void signIn()
    {
        LOG.debug("Verify the Sign In page");
        String barText =automationCompletePage.signInBar();
        String buttonText =automationCompletePage.signInBar();
        Assert.assertEquals(" Sign in",barText,"Sign In bar is displyed");
        Assert.assertEquals(" Sign in",buttonText,"Sign In button is displayed verified");


    }

}