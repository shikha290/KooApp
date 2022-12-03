package koo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class koo2 {

	WebDriver Driver;
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;
	@BeforeTest
	public void koo1() 
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://www.kooapp.com/");
		Driver.manage().window().maximize();
		
		
	}
	@Test
	public void koo2() throws InterruptedException
	{
		test = extent.createTest("navigating to the koo Feed Home Page");
//		for opening the home page 
		Driver.findElement(By.xpath("//*[@class='_1yA7y']")).click();
		test.pass("user is able to open the home page");
	}

	@Test
	public void koo3() throws InterruptedException
	{
		test = extent.createTest("navigating to the koo Feed Page");
//		For Koo feed page <!!>
		Driver.findElement(By.xpath("//*[@class='yzz8Z']")).click(); 
		test.pass("user is able to click and navigate to Koo Feed Page");
		Thread.sleep(5000);
	}
		@Test
		public void koo4() throws InterruptedException {
		test = extent.createTest("navigating to the koo Search bar");	
//		For search Button 
		Driver.findElement(By.xpath("//*[@class='_1yLtb']")).sendKeys("Shikha ramdev");
		test.pass("user is able to click and search user");
		Thread.sleep(5000);
		}	
//		@Test
		public void koo5() throws InterruptedException {
		test = extent.createTest("navigating to the koo search elemet");
//		For clicking on the search element 
		Driver.findElement(By.xpath("//*[@class='_1C8uK']")).click();
		test.pass("user is able to click and search the Element");
		Thread.sleep(5000);
		}
		@Test 
		public void koo6() throws InterruptedException {
		test = extent.createTest("navigating to the koo Following the person ");
//		For following the person 
		Driver.findElement(By.xpath("//*[@class='_1GX96']")).click();
		test.pass("user is able to click the following button");
		Thread.sleep(5000);
		}
		@Test 
		public void koo7() throws InterruptedException {
		test = extent.createTest("navigating to the koo For the Login Block");
//		Sign or Login Block 
		Driver.findElement(By.xpath("//*[@class='_2dufT']")).sendKeys("8619642355");
		test.pass("user is able to SignIn ");
		Thread.sleep(5000);
		}
		@Test 
		public void koo8() throws InterruptedException {
		test = extent.createTest("navigating to the Koo Login Check box");
//		For Selecting the check box 
		Driver.findElement(By.xpath("//*[@title='reCAPTCHA']")).click();
		test.pass("user is able to click and navigate to the Check box");
		Thread.sleep(10000);
		}
		@Test 
		public void koo9() throws InterruptedException {
		test = extent.createTest("navigating to the koo for Getting OTP");
//		Image is going to selected by our self 
//		For selecting Get OTP
		Driver.findElement(By.xpath("//*[@class='_2-ryR']")).click();
		test.pass("user is able to get the otp");
		Thread.sleep(20000);	
		}
//		@Test
//		public void koo11() throws InterruptedException 
//		{
//		test = extent.createTest("navigating to the koo Logout");
////		XPath or Locator for Logout 
////		Driver.findElement(By.xpath("//*[@alt='logout']")).click();
//		Driver.findElement(By.xpath("*//div[contains(text(),'Log out')]"));
//		test.pass("user is able to click and navigate to the Logout");
//		Thread.sleep(4000);
//		}
		
	
	@AfterTest
	public void kooEnd() throws InterruptedException
	{
		Thread.sleep(3000);
		Driver.close();
		extent.flush();
		Thread.sleep(3000);
	}
}
