package assignmant;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import file_utility.Excel_utility;
import file_utility.Property_utility;
import java_utility.Java_utility;
import webdriver_utility.WebDriver_utility;

public class demoweb {


@Test
public void demoweb1() throws EncryptedDocumentException, IOException
{

	final Map<String, Object> chromePrefs = new HashMap<>(); 
	chromePrefs.put("credentials_enable_service", false); 
	chromePrefs.put("profile.password_manager_enabled", false);
	chromePrefs.put("profile.password_manager_leak_detection", false); // <======== This is the important one final 
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setExperimentalOption("prefs", chromePrefs);


	WebDriver driver = new ChromeDriver(chromeOptions);
	Property_utility pu=new Property_utility();
	Java_utility ju=new Java_utility();
	Excel_utility eu=new Excel_utility();
	WebDriver_utility wb=new WebDriver_utility();
	//WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
//	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//	driver.findElement(By.xpath("//input[@id='gender-male']")).submit();
//	int rint = ju.randomint();
//	String Firstname = eu.getExceldemo("demo", 1, 0)+rint;
//	String Lastname = eu.getExceldemo("demo", 1, 1)+rint;
	String Email = eu.getExceldemo("demo", 1, 2);
	String Password = eu.getExceldemo("demo", 1, 3);
//	String ConfirmPassword= eu.getExceldemo("demo", 1, 4);
	String Category = eu.getExceldemo("demo", 1, 5);
	String Product = eu.getExceldemo("demo", 1, 6);
//	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(Firstname);
//	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(Lastname);
//	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
//	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
//	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(ConfirmPassword);
//	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	
	
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	
	
	
}

	
	
	
	
	}

