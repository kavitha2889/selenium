package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testcases.testcases;

public class loginpage extends testcases
{
public loginpage(WebDriver driver)
{
	this.driver=driver;
	
}
By username = By.id("login1");
public WebElement userid()
{
	return driver.findElement(username);
}
By password = By.id("password");
public WebElement password()
{
	return driver.findElement(password);
}
}
