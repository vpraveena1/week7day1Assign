package week7day1assign1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	
	@BeforeTest
	public void openDb() {//db conntion
		//excelfile funtion to open createlead
		excelFile = "CreateLead";
	}
	
	@Test(dataProvider = "fData")
	
	public void createLead(String cName, String first, String last, String pnum) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();

	}

	
	}

