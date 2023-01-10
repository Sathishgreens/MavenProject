package org.launch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitSample {
	static WebDriver driver;
	@BeforeClass
	public static void tc5() {
		//System.out.println("@Before Class");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	@Before
	public void tc3() {
		//System.out.println("@Before");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void tc1() {
		//System.out.println("@Test1");
		driver.findElement(By.id("email")).sendKeys("123456");
		WebElement findElement = driver.findElement(By.id("pass"));
		findElement.sendKeys("12345");
		String attribute = findElement.getAttribute("id");
		System.out.println(attribute);
		Assert.assertEquals("Expected", attribute, "pass");
	}
	@After
	public void tc4() throws IOException {
		//System.out.println("@After");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		
		
		File folder = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\FrameWork");
		
		File[] listFiles = folder.listFiles();
		List l = new ArrayList();
		for(File a:listFiles) {
			l.add(a);
		}
		
		for(int i=1;i<=10;i++) {
			File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\FrameWork\\testcase"+i+".png");
			if(!l.contains(file)) {
				FileUtils.copyFile(screenshotAs, file);
				break;
			}			
		}
		
		
		
		
	}
	@AfterClass
	public static void tc2() {
		//System.out.println("@AfterClass");
		driver.quit();
	}

}
