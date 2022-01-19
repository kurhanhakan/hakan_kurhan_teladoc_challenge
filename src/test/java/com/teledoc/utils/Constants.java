package com.teledoc.utils;

public class Constants {

	public static final String CHROME_DRIVER_PATH_WINDOWS = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
	
	public static final String CHROME_DRIVER_PATH_MAC = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
	
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/configuration.properties";

	public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/html-report/HRMS.html";

	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshot/";

	public static final int IMPLICIT_WAIT_TIME = 15;
	
	public static final int EXPLICIT_WAIT_TIME = 30;
	
	
	
}