package utils;

import org.openqa.selenium.By;

public class Locators {

	public static By getById(String locatorValue) {
		
		return By.id(locatorValue);
		

	}
	
	public static By getByName(String locatorValue) {
		
		return By.name(locatorValue);
		

	}
	
}
