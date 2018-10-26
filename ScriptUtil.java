package com.goolepage.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//This class contain locator and operations to be perform on locators*/
public class ScriptUtil {
	
	WebDriver driver;
	
	By LOC_SEARCH= By.id("gsfi");
	
	

	ExcelReader ex=new ExcelReader();
	String data=ExcelReader.datacontent;
	public void basicSearch()
	{
		driver.findElement(LOC_SEARCH).sendKeys(data);
		driver.findElement(LOC_SEARCH).sendKeys(Keys.ENTER);
		
		
	}
	
	
}
