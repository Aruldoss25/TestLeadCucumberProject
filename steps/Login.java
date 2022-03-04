package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	@Given("give UserName as {string}")

	public void giveCredential(String Username) {

		driver.findElement(By.id("username")).sendKeys(Username);

	}

	@Given("Password as {string}")

	public void givePassword(String Password) {

		driver.findElement(By.id("password")).sendKeys(Password);

	}

	@When("Click Login")
	public void clickLogin() {

		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	
	

}
