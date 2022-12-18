package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {
	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("(//*[name()='svg'])[3]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@class=\"sc-c3d05745-1 dbjsyd global-stats\"]")).getText());
		driver.quit();
	}
}
