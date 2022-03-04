package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	
	
	@When("click on Find Leads link")
	
	public void findLead() {
		
		driver.findElement(By.xpath("//a[text()=\"Find Leads\"]")).click();
		}
	
	@When("click on Phone button")
	
	public void phoneButton() {
		
		driver.findElement(By.xpath("//span[text()=\"Phone\"]")).click();
	}
	
	@Then("give phoneNumber")
	public void phoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9524820844");
	}
	
	@When("click findLeads")
	public void clickFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
		Thread.sleep(200);
	}
	
	@When("choose Lead")
	public void chooseLead() {
		driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a")).click();
		
	}
	
	@When("click Edit")
	
	public void clickEdit() {
		
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Then("update company details")
	public void changeCompany() {
		
		WebElement a1 = driver.findElement(By.id("updateLeadForm_companyName"));
		a1.clear();
		a1.sendKeys("CTS");
	}
		
@When("click delete")
		
public void clickDelete() {
			
			driver.findElement(By.linkText("Delete")).click();
		}
		
		
	
	
	@When("click update")
	
	public void update() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	
	/*@Given("click on Phone button")
	
	public void editLead() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement a1 = driver.findElement(By.id("updateLeadForm_companyName"));
		a1.clear();
		a1.sendKeys("CTS");
		driver.findElement(By.name("submitButton")).click();
	}*/
	
		
}
