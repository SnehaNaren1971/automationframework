package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_017 {
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
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	// Open Posts > Add New Posts > Publish
	@Test
	public void allposthrashtTest() {
		loginPOM.clickLoginBtn();
		//driver.findElement(By.className("sign-in")).click();
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("");
		loginPOM.LoginWithAccount();    //clickOnSubmit();//clickOnLoginWithAccount();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Posts')]")).click();;
		driver.findElement(By.xpath("//a[@href='post-new.php']")).click();
		//driver.findElement(By.xpath("//input[@id='title-prompt-text']")).sendKeys("PostSN1");
		driver.findElement(By.name("post_title")).sendKeys("TestPost11");
		driver.findElement(By.name("content")).sendKeys("TestPost");
		driver.findElement(By.xpath("//input[@id='publish']")).click();
		screenShot.captureScreenShot("");
	}

}
