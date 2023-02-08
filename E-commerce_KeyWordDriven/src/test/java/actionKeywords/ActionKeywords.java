package actionKeywords;

import java.time.Duration;

import org.apache.poi.ss.formula.functions.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import execution_Core.Engine;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelUtils;

public class ActionKeywords {
	static WebDriver driver;

	public static void openBrowser() {

		if (ExcelUtils.dataColumnvalue.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			//
		}

	}

	public static void goToUrl() {
		driver.get(ExcelUtils.dataColumnvalue);
		driver.manage().window().maximize();

	}

	public static void enterUserName() {

		driver.findElement(Engine.locator).sendKeys(ExcelUtils.dataColumnvalue);

	}

	public static void enterPassword() {

		driver.findElement(Engine.locator).sendKeys(ExcelUtils.dataColumnvalue);
	}

	public static void clickLogin() {
		driver.findElement(Engine.locator).click();

	}

	public static void searchLocation() {

		Select location = new Select(driver.findElement(Engine.locator));
		location.selectByVisibleText("London");

	}

	public void selectHotelName() {
		WebElement hotell = driver.findElement(Engine.locator);
		Select hotel = new Select(hotell);
		hotel.selectByVisibleText("Hotel Sunshine");

	}

	public void hotelType() {
		Select roomType = new Select(driver.findElement(Engine.locator));
		roomType.selectByVisibleText("Super Deluxe");

	}

	public void roomNo() {

		Select roomNos = new Select(driver.findElement(Engine.locator));
		roomNos.selectByVisibleText("1 - One");
	}

	public void adultPerRoom() {

		Select adults = new Select(driver.findElement(Engine.locator));
		adults.selectByVisibleText("2 - Two");

	}

	public void childPerRoom() {

		Select child = new Select(driver.findElement(Engine.locator));
		child.selectByVisibleText("- Select Children per Room -");

	}

	public void clickSubmit() {

		driver.findElement(Engine.locator).click();

	}

	public static void selectHotel() {

		driver.findElement(Engine.locator).click();

	}

	public void selectHotelSubmit() {

		driver.findElement(Engine.locator).click();

	}

	public static void firstName() {

		driver.findElement(Engine.locator).sendKeys(ExcelUtils.dataColumnvalue);

	}

	public void lastName() {

		driver.findElement(Engine.locator).sendKeys(ExcelUtils.dataColumnvalue);
	}

	public void addrr() {

		driver.findElement(Engine.locator).sendKeys(ExcelUtils.dataColumnvalue);
	}

	public void cardnum() {

		driver.findElement(Engine.locator).sendKeys("7894561231234564");
	}

	public void cardtyp() {

		Select cardType = new Select(driver.findElement(Engine.locator));
		cardType.selectByVisibleText("VISA");

	}

	public void cardMonth() {

		Select month = new Select(driver.findElement(Engine.locator));
		month.selectByVisibleText("September");
	}

	public void cardYear() {
		Select year = new Select(driver.findElement(Engine.locator));
		year.selectByVisibleText("2022");

	}

	public void cardCvv() {
		driver.findElement(Engine.locator).sendKeys("222");

	}

	public void confirmHotelSubmit() {
		//driver.findElement(Engine.locator).click();
		driver.findElement(By.id("book_now")).click();

	}

//	public static void getHotel() {
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		String message = driver.findElement(Engine.locator).getText();
//		System.out.println(message);
//
//	}

}
