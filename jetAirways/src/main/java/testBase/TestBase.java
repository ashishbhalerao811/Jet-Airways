package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static Properties prop =new Properties();;
	public static WebDriver driver;
	
	public TestBase() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Ashish\\eclipse-workspace\\jetAirways\\src\\main\\java\\config\\config.properties");
			 prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	 catch (IOException e) {
		e.printStackTrace();
	}
		
	}
	
	public static void initialization() {
		String browser= prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","G:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
}
