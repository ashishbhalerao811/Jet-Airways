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
	public TestBase testBase;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=".//*[@id='Return']")
	
	WebElement returnBtn;
	
	@FindBy(xpath=".//*[@id='OneWay']")
	WebElement oneWay;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_lnkMultipleDests']")
	WebElement multiWay;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_autoOriginHome_AutoText']")
	WebElement fromCity;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_autoDestinationHome_AutoText']")
	WebElement destCity;
	
	@FindBy(xpath=".//*[@id='txtStartDate']")
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
	
	WebElement NumberOfPassengers;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_spanPaySelectIcon']")
	
	WebElement cash;
	
	@FindBy(xpath=".//*[@id='txtPromotion']")
	WebElement promo;
	
	@FindBy(xpath=".//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath=".//*[@id='txtHeaderJPNumber']")
	
	WebElement email;
	
	@FindBy(xpath=".//*[@id='txtHeaderPassword']")
	
	WebElement pWd;
	
	@FindBy(xpath=".//*[@id='Login_btnSubmitLogin']")
	
	WebElement loginBtn;
	
	@FindBy(xpath=".//*[@id='ObeFlights1_btnBookOnline']")
	
	WebElement clickOnFlight;
	
	
	public void departSelection() {
		returnBtn.click();
	}
	
	public void oneWaySelection() {
		oneWay.click();
	}
	
	public void twoWaySelection() {
		multiWay.click();
	}
	
	public void departureCity() {
		fromCity.sendKeys("Pune");
	}
	
	public void destinationCity() {
		destCity.sendKeys("Mumbai");
	}
	
	public void clickOnDate() {
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
	
	public void passengerList() {
		NumberOfPassengers.click();
	}
	
	public void clickOnCash() {
		cash.click();
	}
	
	public void clickOnPromotionOption() {
		promo.click();
	}
	
	public void userLogin(String uName, String passWord) {
		email.sendKeys(prop.getProperty(uName));
		pWd.sendKeys(prop.getProperty(passWord));
		loginBtn.click();
	}
	
	public  void clickOnFlightBtn() {
		clickOnFlight.click();
	}
	
}

	
