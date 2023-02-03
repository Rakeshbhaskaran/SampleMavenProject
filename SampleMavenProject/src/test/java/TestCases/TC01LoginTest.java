package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TC01LoginTest extends BaseTest{
	
	@Test
	public void login() {
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		driver.findElement(By.id("Email")).sendKeys("rakm@test.com");
		driver.findElement(By.id("Password")).sendKeys("6362606708");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
