package automationexample.models;
import com.amazonaws.services.codepipeline.model.WebhookDefinition;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.Getter;
import org.apache.tools.ant.taskdefs.Retry;
import org.openqa.selenium.WebDriver;

public class AccessURL {
    private WebDriver webDriver;
    private static final Logger LOG = LoggerFactory.getLogger(Retry.class);
    String url;

    public AccessURL(WebDriver webDriver, String url) {
       this.webDriver=webDriver;
        this.url=url;

    }
    public void runURL()
    {
        LOG.debug("Accessing URL");
        webDriver.get(url);
    }

}