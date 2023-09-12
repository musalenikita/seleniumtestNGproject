package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObjects {
	public WebDriver driver;

	private By myInfo = By.xpath("//span[normalize-space()='My Info']");
	
	private By firstname=By.xpath("//input[@name='firstName']");
	private By middlename=By.xpath("//input[@name='middleName']");
	private By LastName=By.xpath("//input[@name='lastName']");
	private By NickName=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	private By nationalityDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");

	private By nationalityOptions = By.xpath("//div[@class='oxd-select-option']");

	public myInfoPageObjects(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement clickOnMyInfo() {
		// TODO Auto-generated method stub
		return driver.findElement(myInfo);
	}

	public WebElement clickOnNationalityDropdwon() {
		// TODO Auto-generated method stub
		return driver.findElement(nationalityDropdown);
	}

	public List<WebElement> chooseNationality() {
		// TODO Auto-generated method stub
		return driver.findElements(nationalityOptions);
	}

	public WebElement EnterFirstName() {
		return driver.findElement(firstname);
		
	}
	public WebElement EntermiddletName() {
		return driver.findElement(middlename);
	}
	public WebElement LastName() {
		return driver.findElement(LastName);
	}

	public WebElement NickName() {
		// TODO Auto-generated method stub
		return driver.findElement(NickName);
	}


}
