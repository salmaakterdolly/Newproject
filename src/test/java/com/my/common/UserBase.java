package com.my.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserBase {
	public static WebDriver driver;
    public static String baseURL = "https://www.macys.com/";
    
    public static void launchBrowser() {
    	
    	System.setProperty("webdriver.chrome.driver","/home/mahbub/Webdrivers/chromedriver_linux64/chromedriver");
    	driver = new ChromeDriver();
    	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get(baseURL);
    }
 public void tearDown() {
	 driver.close();
 }






}

