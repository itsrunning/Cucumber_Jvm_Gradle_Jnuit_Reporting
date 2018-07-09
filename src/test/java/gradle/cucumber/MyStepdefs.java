package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Assert;

import java.util.List;
import java.net.URL;


public class MyStepdefs {

    ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();

    }
    @After
    public void quitDriver(){
        driver.quit();
    }
//
    @Given("^i am in the google home page$")
    public void iamInGoogleHomePage() throws Throwable {

        driver.get("http://www.google.com");

    }
        @When("^i search for \"([^\"]*)\" in page$")
        public void iSearchForInPage(String arg0) throws Throwable {
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys(arg0);
        element.submit();
        }

    @Then("^i see more than one result displayed$")
    public void iSeeMoreThanOneResultDisplayed() throws Throwable {
        List<WebElement> elements= driver.findElements(By.className("r"));
        Assert.assertTrue(elements.size() > 0);
    }

}
