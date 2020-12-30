package sampleproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class browser {
	@Test
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("learing eample");
	}
	
	@Test
	public void internet()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishnamoorthy\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("learing eample");
	}

}
