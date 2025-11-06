package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingChkBoxRadioBtns {
WebDriver driver;
	@Test
	public void radAndChkBox()
	{
		driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement selRadBMW=driver.findElement(By.id("bmwradio"));
		WebElement selChkBenz=driver.findElement(By.id("benzcheck"));
		WebElement selChkHonda=driver.findElement(By.id("hondacheck"));
		
		selRadBMW.click();
		if(selRadBMW.isSelected())
		{
			System.out.println("BMW Radio button is selected..");
		}
		else
		{
			System.out.println("BMW Radio button is not selected..");
		}
		selChkBenz.click();
		selChkHonda.click();
		
		if(selChkBenz.isSelected())
		{
			System.out.println("Benz checkbox is selected..");

		}
		else
		{
			System.out.println("Benz checkbox is not selected..");
		}
		if(selChkHonda.isSelected())
		{
			System.out.println("Honda checkbox is selected..");

		}
		else
		{
			System.out.println("Honda checkbox is not selected..");
		}
		driver.quit();
	}
}
