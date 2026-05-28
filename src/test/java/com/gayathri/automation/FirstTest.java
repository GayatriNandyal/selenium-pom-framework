package com.gayathri.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest 
{
  @Test 
  public void openGoogle()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println(driver.getTitle());
	  System.out.println("Running on branch: feature/login-test");
	  System.out.println("This change will be pulled by the clone");
	  System.out.println("Testing Pull Request workflow");
	  driver.quit();
  }
 

}
