package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.training.generics.ScreenShot;

import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC001 {
	private WebDriver driver; 
	private String baseUrl; 
	private LoginPOM loginPOM; 
	private static Properties properties; 
	private ScreenShot screenShot; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		System.out.println("file is loaded");
	}

	@Before
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
		System.out.println("basuri called");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void loginPassTest() {
		loginPOM.sendUserName("manzoor1");
		loginPOM.sendPassword("manzoor");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		loginPOM.clickCourseCatalogue();
		loginPOM.searchCourse("Selenium");
		loginPOM.clickSearch();
	}
	
}

