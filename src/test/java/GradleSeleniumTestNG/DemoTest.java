package GradleSeleniumTestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test

	public void test() {

		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		System.out.println("google title is" + driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), "Google");
		driver.quit();
	}
}
