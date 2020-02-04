package WebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	public static String site_url="http://www.way2automation.com/angularjs-protractor/banking/#/login";
	
	WebElement bankmgrbtn=driver.findElement(By.cssSelector("div:nth-child(3)>button.btn.btn-primary.btn-lg"));

public HomePage(WebDriver driver) {
	this.driver=driver;
	driver.get(site_url);
	
}
public void LoginAsMgr() {
	bankmgrbtn.click();
}
}
