package testScenarios;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class CaptureScreenshots {

	WebDriver driver;
	@Test
	public void screenShotExp() throws IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//it will take the screenshot and saves it in object and from the object we
		// will copy the screenshot to the actual file
		Files.copy(f, new File("C:\\Users\\HP\\Downloads\\screenshots\\googleScreenshot.jpeg"));
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a"));
		File f1=w1.getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("C:\\Users\\HP\\Downloads\\screenshots\\googlePartialScreenshot.jpeg"));

		driver.quit();
	}
}
