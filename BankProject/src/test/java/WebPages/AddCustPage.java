package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustPage {

	private WebDriver driver;

	WebElement firstName = driver.findElement(By.cssSelector("input[ng-model='fName']"));
	WebElement lastName = driver.findElement(By.cssSelector("input[ng-model='lName']"));
	WebElement postCode = driver.findElement(By.cssSelector("input[ng-model='postCd']"));
	WebElement sbmt = driver.findElement(By.cssSelector("button[type='submit']"));
	
	

	public void addCustomer() {
		firstName.sendKeys("James");
		lastName.sendKeys("Bond");
		postCode.sendKeys("54654");
		sbmt.click();
	}
}
