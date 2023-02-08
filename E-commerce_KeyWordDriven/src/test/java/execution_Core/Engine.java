package execution_Core;

import java.lang.reflect.Method;

import org.openqa.selenium.By;

import actionKeywords.ActionKeywords;
import constants.Constants;
import utils.ExcelUtils;
import utils.Locators;

public class Engine {
	
	ActionKeywords actionKeywords;
	Method[] methods;
	
	public static By locator;
	
	public Engine() {
		
		actionKeywords = new ActionKeywords();
		
		methods = actionKeywords.getClass().getMethods();
	}
	
	public void executeKeywords() throws Exception {
		
		for (int i = 0; i < methods.length; i++) {
		   if(methods[i].getName().equalsIgnoreCase(ExcelUtils.keywordColumnValue)) {
			   methods[i].invoke(actionKeywords);
			   break;
		   }
		}

	}
	
	public void findWebElementsToBeUs() {
		
		switch (ExcelUtils.locatorName) {
		case "id":
			
		       locator = Locators.getById(ExcelUtils.locatorValue);
			
			break;
			
        case "name":
			
        	locator = Locators.getByName(ExcelUtils.locatorValue);
        	
			break;

		default:
			break;
		}

	}

	public static void main(String[] args) throws Exception {
		
		ExcelUtils utils = new ExcelUtils();
		
		utils.readExcelFile(Constants.EXCEL_Path);
		
		Engine engine= new Engine();
		
		int locatorColumn=3;
		int keywordColumn=locatorColumn+1;
		int dataColumn = locatorColumn+2;
		
		
		for (int row = 1; row <=ExcelUtils.totalRows ; row++) {
			
			//keyword = utils.getLocatorsKeywordsAndData(row, locatorColumn,keywordColumn,dataColumn);
			utils.getLocatorsKeywordsAndData(row, locatorColumn,keywordColumn,dataColumn);
			engine.findWebElementsToBeUs();
			engine.executeKeywords();
//			if (keyword.equalsIgnoreCase("openBrowser")) {
//				ActionKeywords.openBrowser();
//			}else if (keyword.equalsIgnoreCase("goToUrl")) {
//				ActionKeywords.goToUrl();
//			}else if (keyword.equalsIgnoreCase("enterUserName")) {
//				ActionKeywords.enterUserName();
//			}else if (keyword.equalsIgnoreCase("enterPassword")) {
//				ActionKeywords.enterPassword();
//			}else if (keyword.equalsIgnoreCase("clickLogin")) {
//				ActionKeywords.clickLogin();
//			}else if (keyword.equalsIgnoreCase("searchHotel")) {
//				ActionKeywords.searchHotel();
//			}else if (keyword.equalsIgnoreCase("selectHotel")) {
//				ActionKeywords.selectHotel();
//			}else if (keyword.equalsIgnoreCase("bookHotel")) {
//				ActionKeywords.bookHotel();
//			}else if (keyword.equalsIgnoreCase("getHotel")) {
//				ActionKeywords.getHotel();
//			}
		}
	}
	
} 





