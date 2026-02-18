package ninja_hrm;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import POM_class.AddemployeePage;
import POM_class.Create_project;
import POM_class.CreateinfoPage;
import POM_class.Dashboard_link;
import POM_class.EmployeedetailsPage;
import POM_class.SignPage;
import file_utility.Excel_utility;
import file_utility.Property_utility;
import java_utility.Java_utility;
import webdriver_utility.WebDriver_utility;

public class project_ninza {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
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
		
		wb.waitforpagetoload(driver);
		
		String Url=pu.getpropertyfile("url");
		String Browser=pu.getpropertyfile("browser");
		
		String Username=pu.getpropertyfile("username");
		String Password=pu.getpropertyfile("password");
		
		SignPage sp=new SignPage(driver);
		sp.Signup(Username, Password, Url);
		//wb.switchToAlert(driver);
		
		
		
		
		Dashboard_link dl=new Dashboard_link(driver);
		dl.getProjectslink().click();
		
		Create_project cp=new Create_project(driver);
		cp.getCreateEdt().click();
		wb.switchTabontitle(driver, "Create Project");
		 int rint = ju.randomint();
		
		
		String projectname = eu.getExcel("project", 1, 0)+rint;
		String projectmanager = eu.getExcel("project", 1, 1)+rint;
		String projectstatus = eu.getExcel("project", 1, 2);
		//System.out.println(projectstatus);
		
		
		
		
		CreateinfoPage cip=new CreateinfoPage(driver);
		cip.getProjectnameEdt().sendKeys(projectname);
		cip.getProjectmanagerEdt().sendKeys(projectmanager);
		cip.createprojectstatus(projectstatus);
		
		
		cip.getAddProjectEdt().click();		
		
		
		
		
		Thread.sleep(10000);
		//add emp
		dl.getEmployesslink().click();
		AddemployeePage aep=new AddemployeePage(driver);
		aep.getAddempEdt().click();
		//add emp details
		wb.switchTabontitle(driver, "Add Employee");
		
		
		
		Thread.sleep(2000);
		String empname = eu.getExcelemp("emp", 1, 0);
		String empmail = eu.getExcelemp("emp", 1, 1);
		String empphone = eu.getExcelemp("emp", 1, 2);
		String empusername = eu.getExcelemp("emp", 1, 3);
		String empdesignation = eu.getExcelemp("emp", 1, 4);
		String empexperience = eu.getExcelemp("emp", 1, 5);
		//String projectname1 = eu.getExcel("project", 1, 0);
		
		
		EmployeedetailsPage edp=new EmployeedetailsPage(driver);
		edp.getEmpnameEdt().sendKeys(empname);
		edp.getEmpmailEdt().sendKeys(empmail);
		edp.getEmpphoneEdt().sendKeys(empphone);
		edp.getEmpusernameEdt().sendKeys(empusername);
		edp.getEmpdesignationEdt().sendKeys(empdesignation);
		edp.getEmpdexperienceEdt().sendKeys(empexperience);
		edp.projectname(projectname);
		Thread.sleep(2000);
		edp.getAddEdt().click();
		}
	
}
