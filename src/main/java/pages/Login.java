package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='userid']")
	 WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	 WebElement password;
	@FindBy(xpath = "//button[@class='button-orange wide']")
	 WebElement LoginBtn;
	@FindBy(xpath = "//a[contains(text(),'Forgot')]")
	 WebElement ForgotPasswordLink;
	@FindBy(xpath = "//input[@id='pin']")
	 WebElement LoginPin;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	 WebElement ContinueBtn;
	
public void clickLogin(String uname, String pword) {
		
	userName.sendKeys(uname);
	password.sendKeys(pword);
	LoginBtn.click();
	}
	public void ClickForgotP() {
		ForgotPasswordLink.click();
	}
	public void clickPin(String pin) {
		LoginPin.sendKeys(pin);
		ContinueBtn.click();
	}
}
