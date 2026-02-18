package webdriver_utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_utility {
	
	
	public void waitforpagetoload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void switchToAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void waitforelementPresent(WebDriver driver,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchTabonurl(WebDriver driver ,String partialurl)
	{
		Set<String> cid = driver.getWindowHandles();
		Iterator<String> iterator = cid.iterator();
		while(iterator.hasNext())
		{
			String wid =iterator.next();
			driver.switchTo().window(wid);
			@Nullable
			String url = driver.getCurrentUrl();
			if(url.contains(partialurl))
			{
				break;
			}
			
		}
	}
	public void switchTabontitle(WebDriver driver ,String partialtitle)
	{
		Set<String> cid = driver.getWindowHandles();
		Iterator<String> iterator = cid.iterator();
		while(iterator.hasNext())
		{
			String wid =iterator.next();
			driver.switchTo().window(wid);
			@Nullable
			String title = driver.getTitle();
			if(title.contains(partialtitle))
			{
				break;
			}
			
		}
	}
	public void switchToFrame(WebDriver driver,String name)
	{
		
		driver.switchTo().frame(name);
	}
	

}
