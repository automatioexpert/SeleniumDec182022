package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	@Test
	public void m1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");

		List<WebElement> elements = driver
				.findElements(By.xpath("//table[@class='sc-f7a61dda-3 kCSmOD cmc-table  ']/tbody/tr/td"));

		for (WebElement ele : elements) {
			System.out.println(ele.getText());
		}

		System.out.println("Test case Passed!!!!!!!!!");
		driver.quit();
	}
}
