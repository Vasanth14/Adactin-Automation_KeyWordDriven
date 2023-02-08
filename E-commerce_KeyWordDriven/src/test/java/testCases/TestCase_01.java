package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_01 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("elonmusk14");
		
		driver.findElement(By.id("password")).sendKeys("62G9IH");
		
		driver.findElement(By.id("login")).click();
		
		
	}
}
