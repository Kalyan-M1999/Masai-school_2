package stepsformatTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberStepsFormatTestNG {
    WebDriver driver;

    @Given("User open a chrome browser and enter a url")
    public void user_open_a_chrome_browser_and_enter_a_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @When("User enters firstname, lastname, Email, contact number, message")
    public void user_enters_firstname_lastname_email_contact_number_message() {
        driver.findElement(By.id("firstName")).sendKeys("kalyan");
        driver.findElement(By.id("lastName")).sendKeys("Yadav");
        driver.findElement(By.id("email")).sendKeys("mk@gmail.com");
        driver.findElement(By.id("number")).sendKeys("7978675388");
        driver.findElement(By.xpath("//textarea")).sendKeys("Hi Masai_school");
    }

    @And("User clicks on submit button")
    public void user_clicks_on_submit_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @Then("A pop alert should be displayed")
    public void a_pop_alert_should_be_displayed() {
        System.out.println("An alert pop up is displayed");
    }
    @And("user clicks on alertbox")
    public void user_clicks_on_alertbox() {
    	Alert a1 = driver.switchTo().alert();
    	
    	a1.accept();
    }
   
    }


