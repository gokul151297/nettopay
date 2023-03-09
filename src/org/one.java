package org;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class one {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gokul\\eclipse-workspace\\newone\\d\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		TakesScreenshot sc= (TakesScreenshot)driver;
	File source=	sc.getScreenshotAs(OutputType.FILE);
	
	File destination =new File("D://snap//sample.png");
	
	FileHandler.copy(source, destination);
		
		driver.close();
		driver.navigate().back();
		driver.getTitle();
		
	}
}
