package com.google.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.goolepage.ui.ScriptUtil;

/* this is main class which initialize driver,navigate to page and acces all method */

public class MainClass {

	public static void main(String[] args) {
	

		//set system property for chromedriver
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		//initialize driver
		WebDriver driver=new ChromeDriver();
		
		//Hit url and maximize window
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//Access methods of util to perform search operation
		ScriptUtil utils=new ScriptUtil();
		utils.basicSearch();
	}
	

}
