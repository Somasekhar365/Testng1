package testng1;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Baseclass {
   
    public static WebDriver driver;
	@BeforeSuite
	public void suitebefore() {
		// TODO Auto-generated method stub
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(formatter.format(ts));   
	
		
		//timestamp
	}
	
	
	@AfterSuite
	public void suiteafter() {
		// TODO Auto-generated method stub
		Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        System.out.println(formatter.format(ts));   
		//timestamp
	}
	
	@BeforeTest
	public void testbefore() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\crash course\\testng1\\src\\main\\resources\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    /* driver.get("https://adactinhotelapp.com");
	 	driver.findElement(By.id("username")).sendKeys("somu1999");
	 	driver.findElement(By.id("password")).sendKeys("$ekhar");
	 	driver.findElement(By.id("login")).click();*/
	 	//driver.get("https://adactinhotelapp.com");
		//script for chrome browser and step
		//max screen
		
		
	}
	
	
	@BeforeClass
	public void classbefore() {
		// TODO Auto-generated method stub
		driver.get("https://adactinhotelapp.com");
	driver.findElement(By.id("username")).sendKeys("somu1999");
	driver.findElement(By.id("password")).sendKeys("$ekhar");
	driver.findElement(By.id("login")).click();
		///Login application
		//username and password
		//login button
		
	}
	
	@AfterTest
	
	public void testafter() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	
}
