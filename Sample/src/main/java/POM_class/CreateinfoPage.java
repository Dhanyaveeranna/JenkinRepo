package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateinfoPage {
	 WebDriver driver;
	 public CreateinfoPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 @FindBy(name="projectName")
	 private WebElement projectnameEdt;
	 @FindBy(name="createdBy")
	 private WebElement projectmanagerEdt;
	 @FindBy(xpath="//input[@type='submit']")
	 private WebElement AddProjectEdt;
	 @FindBy(xpath="(//select[@name='status'])[2]")
	 private WebElement StatusEdt;
	

	 public WebElement getStatusEdt() {
		return StatusEdt;
	}
	
	 public WebDriver getDriver() {
		 return driver;
	 }
	 public WebElement getProjectnameEdt() {
		 return projectnameEdt;
	 }
	 public WebElement getProjectmanagerEdt() {
		 return projectmanagerEdt;
	 }
	 public WebElement getAddProjectEdt() {
		 return AddProjectEdt;
	 }
	 public void createprojectstatus(String projectstatus)
		{
			
			Select sel = new Select(StatusEdt);
			sel.selectByVisibleText(projectstatus);
			
			
		}

}
