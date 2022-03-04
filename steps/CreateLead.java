package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	
	@Given("give Company name as {string}")
	
	public void giveDetails(String companyName) {
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys(companyName);
		
		
	}
	
@Given("give First name as {string}")
	
	public void giveDetailsFirstName(String firstName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys(firstName);
		
		Thread.sleep(200);
	}

@Given("enter the lastName as {string}")

public void giveDetailsLastName(String lastName) {
	
	driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys(lastName);
	
	
}

@Given("give Phone number as {string}")
public void givePhoneNumber(String phoneNumber) {
	driver.findElement(By.xpath("//input[@id=\"createLeadForm_primaryPhoneNumber\"]")).sendKeys(phoneNumber);
}


@When("Click createLead")

public void submit() {
	driver.findElement(By.xpath("//input[@value=\"Create Lead\"]")).click();
}
	
@When("click on {string} link")

public void clickLink(String link) {
	driver.findElement(By.linkText(link)).click();
}
	
	
	
	
	
	}

