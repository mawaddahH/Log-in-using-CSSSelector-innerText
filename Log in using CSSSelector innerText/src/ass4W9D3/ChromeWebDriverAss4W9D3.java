package ass4W9D3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss4W9D3 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000); // waiting for the elements to load and be visible to use

	}

	/**
	 * Test TextField using cssSelector with inner text
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// Find instagram TextField by Tag and Attribute
		WebElement instagram = driver.findElement(By.cssSelector("a[title*='Instagram']"));
		instagram.click();
//		Thread.sleep(2000);

		// hold all window handles in array list
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
//		Thread.sleep(2000);

		// Find username TextField by Tag and Attribute
		WebElement username = driver.findElement(By.cssSelector("input[aria-label*='number,']"));
		username.sendKeys("Mawaddah");
//		Thread.sleep(2000);

		// Find password TextField by Tag and Attribute
		WebElement password = driver.findElement(By.cssSelector("input[class*='pexuQ'][name='password']"));
		password.sendKeys("Hanbali");
//		Thread.sleep(2000);

		// Find login button by Tag and Attribute
		WebElement login = driver.findElement(By.cssSelector("button[class*='L3NKy']"));
		login.click();
//		Thread.sleep(2000);

		// close tab window
		driver.close();

		// switch to parent window
		driver.switchTo().window(newTb.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
//		Thread.sleep(2000);

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
