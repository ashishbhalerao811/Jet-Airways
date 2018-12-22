package jetAirways;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jetairways.com/EN/IN/Home.aspx");
		
		/*
		 * buttons=
		 * return----.//*[@id='Return']
		 * oneWway---.//*[@id='OneWay']
		 * multiWay--.//*[@id='ObeFlights1_lnkMultipleDests']
		 * fromCity---.//*[@id='ObeFlights1_autoOriginHome_AutoText']
		 * destCity---.//*[@id='ObeFlights1_autoDestinationHome_AutoText']
		 * depart----.//*[@id='txtStartDate']
		 * 2months ---.//*[@id='departureCalendar']/div
		 * if(month.equalsIgnoreCase("December")){

			* december===.//*[@id='departureCalendar']/div/child::div[1]/descendant::table

			}
		else-if(month.equalsIgnoreCase("January"))
		 {
		 * January===.//*[@id='departureCalendar']/div/child::div[2]/descendant::table
		 
		 * }
		 * else{
		 * next-------.//*[@id='departureCalendar']/div/child::div[2]//descendant::a[1]//span[contains(text(),'Next')]
		 * }
		 * no. of passengers----.//*[@id='noOfTravellers']
		 * cash---------.//*[@id='ObeFlights1_spanPaySelectIcon']
		 * promo--------.//*[@id='txtPromotion']
		 * login----.//a[contains(text(),'Login')]
		 * email----.//*[@id='txtHeaderJPNumber']
		 * pass-----.//*[@id='txtHeaderPassword']
		 * 
		 * loginBtn---.//*[@id='Login_btnSubmitLogin']
		 * */
	}

}
