package com.teledoc.testbases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.teledoc.utils.ConfigsReader;
import com.teledoc.utils.Constants;


public class BaseClass {

	public static WebDriver driver;

	/**
	 * This method will create the driver and return it
	 * 
	 * @return WebDriver driver
	 */
	public static WebDriver setUp() {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		String os = System.getProperty("os.name").toLowerCase();

		if (ConfigsReader.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			if (os.contains("mac")) {
				System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH_MAC);
				driver = new ChromeDriver();
			
			} else {
				System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH_WINDOWS);
				driver = new ChromeDriver();
			}
			
		}

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get(ConfigsReader.getProperty("url"));

		PageInitializer.initialize();

		return driver;
		
	}

	/**
	 * This method will close the browser
	 */
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
