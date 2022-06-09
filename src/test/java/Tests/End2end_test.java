package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Dashboard;
import pages.Login;

public class End2end_test {
	
public static void main(String[] args) throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\vijay\\Desktop\\Eclipse Projects\\Selenium_Java_Jan22\\Binary\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://kite.zerodha.com");
	driver.manage().window().maximize();
	
	Login login = new Login(driver);
	
	Dashboard dpage = new Dashboard(driver);
	
	login.clickLogin("XA0634","Sarika699!");
	Thread.sleep(2000);
	
	login.clickPin("691991");
	Thread.sleep(2000);
	
	dpage.updateWatchList();
	
	dpage.logout();
}
}
