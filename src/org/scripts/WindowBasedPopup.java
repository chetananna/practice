package org.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class WindowBasedPopup {
	WebDriver drv;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void setUp() {
	  drv=new FirefoxDriver();
	  drv.findElement(By.id("Email")).sendKeys("chtn426");
	  drv.findElement(By.id("Passwd")).sendKeys("laxmi@25");
	  drv.findElement(By.id("signIn")).click();
	  
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
