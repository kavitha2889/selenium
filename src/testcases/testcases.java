package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.loginpage;
import pageobjects.pageobjectPF;

public class testcases 
{
	public static WebDriver driver;
	@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver", "./chorme/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();

	/*
	loginpage d1 = new loginpage(driver);
	d1.userid().sendKeys("kavitha");
	d1.password().sendKeys("password");
	
	*/
	
	pageobjectPF pf = new pageobjectPF(driver);
	pf.username.sendKeys("kavitha");
	pf.password.sendKeys("password");
	
	
	
	
}

}
