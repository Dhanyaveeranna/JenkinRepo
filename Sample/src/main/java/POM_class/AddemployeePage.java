package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddemployeePage {
	 WebDriver driver;
	 public AddemployeePage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 @FindBy(xpath="//span[text()='Add New Employee']")
	 private WebElement AddempEdt;
	 public WebDriver getDriver() {
		 return driver;
	 }
	 public WebElement getAddempEdt() {
		 return AddempEdt;
	 }


}
