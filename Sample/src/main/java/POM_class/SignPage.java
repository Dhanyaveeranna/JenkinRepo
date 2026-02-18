package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage {
	 WebDriver driver;
	 public SignPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 @FindBy(name="username")
	 private WebElement usernameEdt;
	 @FindBy(name="password")
	 private WebElement passwordEdt;
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement SubmitEdt;
	 public WebDriver getDriver() {
		 return driver;
	 }
	 public WebElement getUsernameEdt() {
		 return usernameEdt;
	 }
	 public WebElement getPasswordEdt() {
		 return passwordEdt;
	 }
	 public WebElement getSubmitEdt() {
		 return SubmitEdt;
	 }
	 public void Signup(String username,String password,String URL)
	 {
		 driver.get(URL);
			driver.manage().window().maximize();
			usernameEdt.sendKeys(username);
			passwordEdt.sendKeys(password);
			SubmitEdt.click();
		 
	 }
	 
	 
	 
	 

}
