package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_1 extends Base_class
{

@Test
public void demoqa()
{

	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys("Kavitha");
	Reporter.log("username entered...", true);
	driver.findElement(By.id("userEmail")).sendKeys("kavik277@gmail.com");
	Reporter.log("Email entered...", true);
	driver.findElement(By.id("currentAddress")).sendKeys("Bangalore");
	Reporter.log("Currenr Add entered...", true);
	driver.findElement(By.id("permanentAddress")).sendKeys("Doddaballapur");
	Reporter.log("Permanent Add entered...", true);
	driver.findElement(By.id("submit")).submit();
	Reporter.log("All the data is submitted...", true);
}

}