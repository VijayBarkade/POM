package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	 WebDriver driver;
	 public Dashboard(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 @FindBy(xpath = "//input[contains(@placeholder,'Search')]")
	 WebElement searchBox;
	 @FindBy(xpath = "//span[contains(text(),'MRF')]//following-sibling::span[contains(text(),'NSE')]")
	 WebElement MRF_NSE;
	 @FindBy(xpath = "//button[@class='button-green']")
	 WebElement Add_Btn;
	 @FindBy(xpath = "//span[contains(text(),'XA0634')]")
	 WebElement ProfileBtn;
	 @FindBy(xpath = "//a[contains(text(),'Logout')]")
	 WebElement Logout;
	 
	 public void updateWatchList() {
		 searchBox.sendKeys("MRF");
			Actions actions = new Actions(driver);
			actions.moveToElement(MRF_NSE).build().perform();
//			actions.moveToElement((WebElement) MRF_NSE).build().perform();
			Add_Btn.click();
		}
		public void logout() {
			ProfileBtn.click();
			Logout.click();
		}
	 
}
