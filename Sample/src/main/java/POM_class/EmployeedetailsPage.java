package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeedetailsPage {
	 WebDriver driver;
	 public EmployeedetailsPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 @FindBy(xpath="(//input[@type='text'])[4]")
	 private WebElement empnameEdt;
	 
	 @FindBy(xpath="(//input[@type='email'])[2]")
	 private WebElement empmailEdt;
	 
	 @FindBy(xpath="(//input[@type='text'])[5]")
	 private WebElement empphoneEdt;
	 
	 @FindBy(xpath="(//input[@type='text'])[6]")
	 private WebElement empusernameEdt;
	 
	 @FindBy(xpath="(//input[@type='text'])[7]")
	 private WebElement empdesignationEdt;
	 
	 @FindBy(xpath="(//input[@type='text'])[8]")
	 private WebElement empdexperienceEdt;
	 
	 @FindBy(xpath="//select[@name='project']")
	 private WebElement ProjectnameEdt;
	 
	 @FindBy(xpath="//input[@value='Add']")
	 private WebElement AddEdt;
	 public WebDriver getDriver() {
		 return driver;
	 }
	 public WebElement getEmpnameEdt() {
		 return empnameEdt;
	 }
	 public WebElement getEmpmailEdt() {
		 return empmailEdt;
	 }
	 public WebElement getEmpphoneEdt() {
		 return empphoneEdt;
	 }
	 public WebElement getEmpusernameEdt() {
		 return empusernameEdt;
	 }
	 public WebElement getEmpdesignationEdt() {
		 return empdesignationEdt;
	 }
	 public WebElement getEmpdexperienceEdt() {
		 return empdexperienceEdt;
	 }
	 public WebElement getProjectnameEdt() {
		 return ProjectnameEdt;
	 }
	 public WebElement getAddEdt() {
		 return AddEdt;
	 }
	 public void projectname(String projectname1)
		{
			
			Select sel = new Select(ProjectnameEdt);
			sel.selectByVisibleText(projectname1);
			
			
		}
	 
	 
	 
	 





}
