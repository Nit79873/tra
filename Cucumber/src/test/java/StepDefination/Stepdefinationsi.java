package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinationsi {

	
WebDriver driver;
	
	@Given("User Navigates to omayo URL")
	public void user_navigates_to_omayo_url() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium class\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize(); 
	  
	}

	@When("User Enters Omayo Application")
	public void user_enters_omayo_application() {
		List<WebElement> List=driver.findElements(By.xpath("//select[@id='drop1']/option"));
		List.get(3).click();
		for(WebElement Lists:List) {
			System.out.println(Lists.getText());
		}
	   
	}

	@And("user write one paragraph on to text field")
	public void user_write_one_paragraph_on_to_text_field() {
		driver.findElement(By.id("ta1")).sendKeys("Tiwari");
	
	}

	@Then("user close the Browser")
	public void user_close_the_browser() {
	 driver.findElement(By.id("textbox1")).clear();
	}
}

