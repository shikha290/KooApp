package koo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class koo2 {

	WebDriver Driver;
	@BeforeTest
	public void koo1() 
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://www.kooapp.com/");
		Driver.manage().window().maximize();
		
	}
	@Test
	public void koo2() throws InterruptedException
	{
//		for opening the home page 
		Driver.findElement(By.xpath("//*[@class='_1yA7y']")).click();
		Thread.sleep(3000);
//		Driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("8619642355");
//		Thread.sleep(3000);
//		Driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']")).click();
//		Thread.sleep(3000);
//		Driver.findElement(By.linkText("Get OTP")).click();
	}
	@Test
	public void koo3() throws InterruptedException
	{
//		For Koo feed page <!!>
		Driver.findElement(By.xpath("//*[@class='yzz8Z']")).click(); 
		Thread.sleep(5000);
//		For search Button 
		Driver.findElement(By.xpath("//*[@class='_1yLtb']")).sendKeys("Sonal purohit");
		Thread.sleep(5000);
//		For clicking on the search element 
		Driver.findElement(By.xpath("//*[@class='_1C8uK']")).click();
		Thread.sleep(5000);
//		for following the person 
		Driver.findElement(By.xpath("//*[@class='_1GX96']")).click();
		Thread.sleep(5000);
//		Sign or Login Block 
		Driver.findElement(By.xpath("//*[@class='_2dufT']")).sendKeys("8619642355");
		Thread.sleep(5000);
//		For Selecting the check box 
		Driver.findElement(By.xpath("//*[@title='reCAPTCHA']")).click();
		Thread.sleep(10000);
//		Image is going to selected by our self 
//		For selecting Get OTP
		Driver.findElement(By.xpath("//*[@class='_2-ryR']")).click();
		Thread.sleep(20000);	
//		For Verify Button 
		Driver.findElement(By.xpath("//*[@class='_2SRhs _2-ryR ']")).click();
		Thread.sleep(4000);
		
	}
	@Test
	public void koo4() throws InterruptedException 
	{
//		XPath or Locator for Explore 
		Driver.findElement(By.xpath("//*[@alt='logout']")).click();
		Thread.sleep(4000);
//		Yes or No for Logout
//		Driver.findElement(By.linkText("Yes")).click();
//		Thread.sleep(4000);
//		For Like Button 
//		Driver.findElement(By.xpath("//*[@class='1AfRO']")).click();
//		Thread.sleep(4000);
//		
	}
		
	
	@AfterTest
	public void kooEnd() throws InterruptedException
	{
		Thread.sleep(3000);
		Driver.close();
	}
}
