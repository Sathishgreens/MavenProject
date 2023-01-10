package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		//Set the property of browser
		WebDriverManager.edgedriver().setup();
		
		//Initialize the WebDriver
		WebDriver driver = new EdgeDriver();
		
		//LaunchURL
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		
		
	}

}
