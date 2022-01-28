package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	WebDriver driver;
	By searchbar=By.xpath("//input[@type='search']");
	
	
	public WebElement searvhbar()
	{
		return driver.findElement(searchbar);
	}
	

}
