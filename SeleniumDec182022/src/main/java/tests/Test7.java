package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {
	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");
		driver.findElement(By.xpath("//span[contains(text(),'English')]")).click();

		// Get list of all the languages from dropdown
		List<WebElement> langs = driver.findElements(By.cssSelector("a.cmc-language-picker__option"));

		System.out.println("Total languages: "+langs.size());
		for (int i = 0; i < langs.size(); i++) {
			System.out.println(langs.get(i).getText());
		}

		driver.quit();
/*		
		Total languages: 36
		English EN
		Русский RU
		Tiếng Việt VI
		Türkçe TR
		Español ES
		اَلْعَرَبِيَّةُ AR
		български BG
		Čeština CS
		Dansk DA
		Deutsch DE
		ελληνικά EL
		English EN
		Español ES
		Suomeksi FI
		Français FR
		हिन्दी HI
		Magyar HU
		Bahasa Indonesia ID
		Italiano IT
		日本語 JA
		한국어 KO
		Nederlands NL
		Norsk NO
		Język polski PL
		Português Brasil PT-BR
		Română RO
		Русский RU
		Slovenčina SK
		Svenska SV
		ไทย TH
		Türkçe TR
		Українська UK
		اُردُو UR
		Tiếng Việt VI
		简体中文 ZH
		繁體中文 ZH-TW */
	}
}
