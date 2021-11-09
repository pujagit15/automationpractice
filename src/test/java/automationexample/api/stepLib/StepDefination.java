package automationexample.api.stepLib;


import automationexample.utils.ConfigData;
import automationexample.models.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.ObjectPool;
import org.apache.tools.ant.taskdefs.Retry;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
@ScenarioScoped
public class StepDefination {

	public static ConfigData props = null;
	private static final Logger LOG = LoggerFactory.getLogger(Retry.class);
	public ChromeDriver driver;
	protected ObjectPool<WebDriver> pool;
	public String resultsFilePath;
	String url;
	ConfigData configData;


	@Before
	public void before() throws Exception {

		LOG.info("Scenario Before Called Functional Steps  " );
		resultsFilePath = configData.resultPath();
		LOG.info("Screen Shot Path: " + resultsFilePath);
		LOG.info("Number of WebDriver Object: " + pool.getNumActive());

	}

	@Given("Access the application via URL")
	public void access_the_application_via_URL() {
		//launch the Browser
		configData= new ConfigData();
        url = configData.getApplicationUrl();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		AccessURL accessURL =new AccessURL(driver, url);
		accessURL.runURL();
	}

	@When("Navigate to Summer Dress")
	public void select_Summer_Dress_in_Women_Section() throws InterruptedException {
		SummerDress summerDress =new SummerDress(driver);
		summerDress.summerDressAccess();

	}

	@Then("The selected dress added to the cart")
	public void the_selected_dress_added_to_the_cart() {
		AddToCart addToCart=new AddToCart(driver);
		addToCart.addToCart();
	}

	@Then("Proceed to Checkout")
	public void proceed_to_Checkout() {
		ProceedToCheckout proceedToCheckout=new ProceedToCheckout(driver);
		proceedToCheckout.proceedToCheckout();
	}

	@Then("Sign In page is accessible")
	public void sign_In_page_is_accessiable() {
		SignIn signIn =new SignIn(driver);
		signIn.signIn();

	}

}
