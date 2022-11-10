package DDT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TS_Excel_1 extends Base_class
{
	@Test
	public void demoqa() throws EncryptedDocumentException, IOException
	{

		String Firstname = Generic_Excel.getdata("sheet1", 0, 0);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys(Firstname);

		String email = Generic_Excel.getdata("sheet1", 1, 0);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,200)");
		
		String current = Generic_Excel.getdata("sheet1", 2, 0);
		driver.findElement(By.id("currentAddress")).sendKeys(current);
		
		String permanent = Generic_Excel.getdata("sheet1", 3, 0);
		driver.findElement(By.id("permanentAddress")).sendKeys(permanent);

		driver.findElement(By.id("submit")).submit();
	}
}
