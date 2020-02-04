package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankMgrPage {

	private WebDriver driver;
	
	WebElement AddCustBtn=driver.findElement(By.cssSelector("button[ng-class='btnClass1']"));
	WebElement OpenAccBtn=driver.findElement(By.cssSelector("button[ng-class='btnClass2']"));
	WebElement CustBtn=driver.findElement(By.cssSelector("button[ng-class='btnClass2']"));
	
	public BankMgrPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickOnAddCustomer() {
		AddCustBtn.click();
	}
}
