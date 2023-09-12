package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	public WebDriver driver;  //This driver dont have any scope--
	 
	 //driver.findElement(By.xpath("//input[@name='username']"))
	 
	 private By username=By.xpath("//input[@name='username']");
	 
	 private By password=By.xpath("//input[@name='password']");
	 
	 private By login=By.xpath("//button[@type='submit']");


	 //This is constructor
	 public loginPageObjects(WebDriver driver2) {
	  
	  this.driver=driver2;
	 }

	 
	 public WebElement  enterUsername() {
	  
	  return driver.findElement(username);
	        
	 }
	 
	    public WebElement enterPassword() {
	  
	  return driver.findElement(password);
	    }

		 
	    public WebElement clickonlogin() {
	  
	  return driver.findElement(login);
	    }
	    

}
