package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void m1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://coinmarketcap.com/currencies/maker/");
		System.out.println(driver.findElement(By.cssSelector("a[href*='charts']")).getText());
		WebElement mayBeLater = driver.findElement(By.xpath("//button[contains(text(),'Maybe later')]"));
		try {
			if (mayBeLater.isDisplayed()) {
				mayBeLater.click();
			}
		} catch (Exception e) {

		}

		WebElement exc = driver.findElement(By.cssSelector("div.menu-item-1 a[href*='exchanges']"));

		Actions act = new Actions(driver);
		act.moveToElement(exc).build().perform();
		

	}
}
