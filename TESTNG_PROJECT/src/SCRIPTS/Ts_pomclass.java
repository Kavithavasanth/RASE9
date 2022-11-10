package SCRIPTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ts_pomclass 
{

	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		PomClass pmc = new PomClass(driver);
		pmc.username("Kavitha");
		Thread.sleep(2000);
		driver.navigate().refresh();
		pmc.username("vasanth");
		
	}
}
