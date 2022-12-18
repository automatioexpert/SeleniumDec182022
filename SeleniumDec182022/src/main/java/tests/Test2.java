package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void m1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");
		WebElement crypto = driver.findElement(By.xpath("//span[contains(text(),'Cryptocurrencies')]"));
		Actions act = new Actions(driver);
		act.moveToElement(crypto).build().perform();
		
		List<WebElement> menus=driver.findElements(By.cssSelector("div.submenu>a"));
		System.out.println("Total Elements are: "+menus.size());
		
		for(WebElement menu:menus) {
			System.out.println(menu.getText());
		}
		
		driver.quit();
	}
}
