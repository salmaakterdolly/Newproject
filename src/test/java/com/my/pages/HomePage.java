package com.my.pages;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  WebDriver driver;
  
  public HomePage(WebDriver driver) {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
	  
  }//end of constructor
 // @FindBy (name="user.email_address")
  //WebElement "";
  

}
