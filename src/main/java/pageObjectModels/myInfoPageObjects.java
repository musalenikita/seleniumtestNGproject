package pageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObjects {
	public WebDriver driver;

	private By myInfo = By.xpath("//span[normalize-space()='My Info']");

	private By firstname = By.xpath("//input[@name='firstName']");
	private By middlename = By.xpath("//input[@name='middleName']");
	private By LastName = By.xpath("//input[@name='lastName']");
	private By NickName = By.xpath("(//div[@data-v-957b4417='']/input)[4]");
	private By otherID = By.xpath("(//div[@data-v-957b4417='']/input)[6]");
	private By empID = By.xpath("(//div[@data-v-957b4417='']/input)[5]");
	private By DrlicenseNo = By.xpath("(//div[@data-v-957b4417='']/input)[7]");
	private By ssnNo = By.xpath("(//div[@data-v-957b4417='']/input)[8]");
	private By sinNo = By.xpath("(//div[@data-v-957b4417='']/input)[9]");
	
	private By nationalityDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");

	private By nationalityOptions = By.xpath("//div[@class='oxd-select-option']");
	private By gender=By.xpath("(//label[@data-v-7ef819fd=''])[2]");

	private By maritalDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By maritalOptions = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");

	public myInfoPageObjects(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement clickOnMyInfo() {
		// TODO Auto-generated method stub
		return driver.findElement(myInfo);
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

	public WebElement empID() {
		// TODO Auto-generated method stub
		return driver.findElement(empID);
	}

	public WebElement otherID() {
		// TODO Auto-generated method stub
		return driver.findElement(otherID);
	}

	public WebElement DrlicenseNo() {
		// TODO Auto-generated method stub
		return driver.findElement(DrlicenseNo);
	}

	public WebElement ssnNo() {
		// TODO Auto-generated method stub
		return driver.findElement(ssnNo);
	}

	public WebElement sinNo() {
		// TODO Auto-generated method stub
		return driver.findElement(sinNo);
	}
	public List<WebElement> chooseNationality() {
		// TODO Auto-generated method stub
		return driver.findElements(nationalityOptions);
	}

	public WebElement clickOnNationalityDropdwon() {
		// TODO Auto-generated method stub
		return driver.findElement(nationalityDropdown);
	}

	public WebElement clickMaritalStatus() {
		// TODO Auto-generated method stub
		return driver.findElement(maritalDropdown);
	}

	public List<WebElement> chooseMaritalStatus() {
		// TODO Auto-generated method stub
		return driver.findElements(maritalOptions);
	}

	/*public WebElement clickOnCalender() {
		// TODO Auto-generated method stub
		return driver.findElement(expDate);
	}

	

	public WebElement clickOnDate() {
		// TODO Auto-generated method stub
		return driver.findElement(selDate);/*
	}

	

	/*public WebElement MaritalStatus() {
		// TODO Auto-generated method stub
		return driver.findElement(statusDropDown);
	}

	public List<WebElement> chooseStatus() {
		// TODO Auto-generated method stub
		return driver.findElements(statusOptions);*/
	

}
