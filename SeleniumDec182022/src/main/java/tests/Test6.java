package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {
	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");
		driver.findElement(By.cssSelector("button[data-btnname='Sign up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).getText());
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("User34358358@gmail.coms");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("User34358358@gmail.coms");
		
		//Alert: This is a svg element & it doesn't support standard XPath format. Learn more...
		driver.findElement(By.xpath("//div[@class=\"sc-f23c2c4c-0 gEqHyg\"]//span//*[name()=\"svg\"]")).click();
		// driver.findElement(By.xpath("//div[@class=\"sc-f23c2c4c-0
		// gEqHyg\"]//span//*[name()=\"svg\"]")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'I agree')]")).getText());

		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Create an account')]")).getText());
		
		//Alert: This is a svg element & it doesn't support standard XPath format. Learn more...
		driver.findElement(By.xpath("//div[@class=\"cmc-modal has-style\"]//*[name()=\"svg\"]//*[name()=\"path\" and contains(@d,\"M18 6L6 18\")]")).click();
		Thread.sleep(4000);
		driver.quit();
		//Alert: This is a svg element & it doesn't support standard XPath format. Learn more...
	}
}
