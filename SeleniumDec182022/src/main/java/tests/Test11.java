package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");
		for(int i=1;i<=10;i++) {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".sc-f3593cc1-0.cOwSoM.switch-button")).click();
		}
	}
}
