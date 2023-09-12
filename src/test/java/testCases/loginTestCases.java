package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.baseClass;
import pageObjectModels.loginPageObjects;

public class loginTestCases extends baseClass {

	@Test
	public void fillPersonalDetails() throws IOException, InterruptedException {

		initializeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.clickonlogin().click();

	}

}
