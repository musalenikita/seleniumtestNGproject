package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonmethods;
import pageObjectModels.loginPageObjects;

public class loginTestCases extends baseClass {

	@Test(priority = 0)
	public void verifyValidLogin() throws IOException, InterruptedException {

		Thread.sleep(2000);

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickonlogin().click();
		commonmethods.handleAssertion(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}


	@Test(priority = 1)
	public void verifyInvalidValidLogin() throws IOException, InterruptedException {

		Thread.sleep(2000);

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin345");
		lpo.enterPassword().sendKeys("admin12321");
		lpo.clickonlogin().click();

		Thread.sleep(5000);
		commonmethods.handleAssertion(lpo.erroemesage().getText(),"Invalid credentials");
		
	}

}
