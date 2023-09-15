package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.baseClass;
import pageObjectModels.loginPageObjects;
import pageObjectModels.myInfoPageObjects;

public class myInfoTestCases extends baseClass {
	 @Test
	 public void fillPersonalDetails() throws IOException, InterruptedException {
	  
	  
	
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  loginPageObjects  lpo=new loginPageObjects(driver);
	  lpo.enterUsername().sendKeys("Admin");
	  lpo.enterPassword().sendKeys("admin123");
	  lpo.clickonlogin().click();
	  
	 
	  myInfoPageObjects mpo=new myInfoPageObjects (driver);
	  
	  Thread.sleep(3000);
	  mpo.clickOnMyInfo().click();
	  
	  Thread.sleep(3000);
	 
	  mpo.EnterFirstName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.EnterFirstName().sendKeys("john");
	  
	  Thread.sleep(2000);
	  mpo.EntermiddletName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.EntermiddletName().sendKeys("Rusk");
	  
	  Thread.sleep(2000);
	  mpo.LastName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.LastName().sendKeys("paul");
	  
	  Thread.sleep(2000);
	  mpo.NickName().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.NickName().sendKeys("bob");
	  
	  Thread.sleep(2000);
	  mpo.empID().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.empID().sendKeys("56588");
	 
	  Thread.sleep(2000);
	  mpo.otherID().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.otherID().sendKeys("123345");
	  
	 Thread.sleep(2000);
	  mpo.DrlicenseNo().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.DrlicenseNo().sendKeys("7879455");
	  
	 Thread.sleep(2000);
	  mpo.ssnNo().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.ssnNo().sendKeys("7678");
	  
	  Thread.sleep(2000);
	  mpo.sinNo().sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
	  mpo.sinNo().sendKeys("8454556");
	  
	  
	  Thread.sleep(2000);
	  mpo.clickOnNationalityDropdwon().click();
	  
	  Thread.sleep(3000);
	  List<WebElement> obj= mpo.chooseNationality();
	  
	  for(WebElement k:obj) {
	   if(k.getText().equalsIgnoreCase("Indian")) {
	    k.click();
	             break;
	             }
	  }
	 
	  Thread.sleep(5000);
	  List<WebElement> obj1= mpo.chooseMaritalStatus();
	  
	 for(WebElement k:obj1) {
	   if(k.getText().equalsIgnoreCase("single")) {
	    k.click();
	             break;
	   }
	 }
	  
		 
	  
	 }
}
	  
	 


