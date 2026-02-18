package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_link {
	
	WebDriver driver;
	 public Dashboard_link (WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 @FindBy(xpath="//a[text()='Projects']")
	 private WebElement Projectslink;
	 @FindBy(xpath="//a[text()='Employees']")
	 private WebElement Employesslink;
	 public WebElement getEmployesslink() {
		return Employesslink;
	}
	 public WebDriver getDriver() {
		 return driver;
	 }
	 public WebElement getProjectslink() {
		 return Projectslink;
	 }

}
