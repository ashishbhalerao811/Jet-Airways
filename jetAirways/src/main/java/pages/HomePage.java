package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{
	public static WebDriver driver;
	public static TestBase testBaase;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
}
