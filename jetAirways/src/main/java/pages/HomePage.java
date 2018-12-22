package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePage extends TestBase{
	public static WebDriver driver;
	public static TestBase testBase;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=".//*[@id='Return']")
	static
	WebElement returnBtn;
	
	@FindBy(xpath=".//*[@id='OneWay']")
	static
	WebElement oneWay;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_lnkMultipleDests']")
	static
	WebElement multiWay;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_autoOriginHome_AutoText']")
	static
	WebElement fromCity;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_autoDestinationHome_AutoText']")
	static
	WebElement destCity;
	
	@FindBy(xpath=".//*[@id='txtStartDate']")
	static
	WebElement departDate;
	
	@FindBy(xpath=".//*[@id='departureCalendar']/div")
	WebElement twoMonthsCalendar;
	
	@FindBy(xpath=".//*[@id='departureCalendar']/div/child::div[1]/descendant::table")
	WebElement december;
	
	@FindBy(xpath=".//*[@id='departureCalendar']/div/child::div[2]/descendant::table")
	WebElement january;
	
	@FindBy(xpath=".//*[@id='departureCalendar']/div/child::div[2]//descendant::a[1]//span[contains(text(),'Next')]")
	WebElement next;
	
	@FindBy(xpath=".//*[@id='noOfTravellers']")
	static
	WebElement NumberOfPassengers;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_spanPaySelectIcon']")
	static
	WebElement cash;
	
	@FindBy(xpath=".//*[@id='txtPromotion']")
	static
	WebElement promo;
	
	@FindBy(xpath=".//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath=".//*[@id='txtHeaderJPNumber']")
	static
	WebElement email;
	
	@FindBy(xpath=".//*[@id='txtHeaderPassword']")
	static
	WebElement pWd;
	
	@FindBy(xpath=".//*[@id='Login_btnSubmitLogin']")
	static
	WebElement loginBtn;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_btnBookOnline']")
	static
	WebElement clickOnFlight;
	
	
	public static void departSelection() {
		returnBtn.click();
	}
	
	public static void oneWaySelection() {
		oneWay.click();
	}
	
	public static void twoWaySelection() {
		multiWay.click();
	}
	
	public static void departureCity() {
		fromCity.sendKeys("Pune");
	}
	
	public static void destinationCity() {
		destCity.sendKeys("Mumbai");
	}
	
	public static void clickOnDate() {
		departDate.click();
		List<WebElement>list=driver.findElements(By.xpath("twoMonthsCalendar"));
		int count=list.size();
		for(int i=0; i<=count; i++) {
			String datesTitle=list.get(i).getText();
			
			if(datesTitle.equalsIgnoreCase("25")) {
				list.get(i).click();
				break;
			}
			
		}
	}
	
	public static void passengerList() {
		NumberOfPassengers.click();
	}
	
	public static void clickOnCash() {
		cash.click();
	}
	
	public static void clickOnPromotionOption() {
		promo.click();
	}
	
	public static void userLogin(String uName, String passWord) {
		email.sendKeys(prop.getProperty(uName));
		pWd.sendKeys(prop.getProperty(passWord));
		loginBtn.click();
	}
	
	public static void clickOnFlightBtn() {
		clickOnFlight.click();
	}
	
}

	
