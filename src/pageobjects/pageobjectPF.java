package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.testcases;

public class pageobjectPF extends testcases
	
{
public pageobjectPF(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}



@FindBy(id="login1")
public  WebElement username;

@FindBy(id="password")
public  WebElement password;





}
