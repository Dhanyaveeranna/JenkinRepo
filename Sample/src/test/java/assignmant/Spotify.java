package assignmant;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spotify {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://open.spotify.com/");
//		driver.manage().window().maximize();
//		WebElement login = driver.findElement(By.xpath("//span[text()='Log in']"));
//		login.click();
//		Thread.sleep(2000);
//		WebElement user = driver.findElement(By.xpath("//a[text()='Continue with phone number']"));
//		user.click();
//		WebElement phone = driver.findElement(By.id("phoneNumber"));
//	WebElement username = driver.findElement(By.id("username"));
//     	phone.sendKeys("8088879912");
//     	WebElement continues = driver.findElement(By.xpath("//span[text()='Continue']"));
//     	continues.click();
//     	WebElement artist = driver.findElement(By.xpath("(//div[@class='Areas__HeaderArea-sc-8gfrea-3 TJKQw'])[8]"));
//     	artist.click();
		
		
		driver.get("https://open.spotify.com/search");
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream("./src/main/resources/testdata/spotifysea.xlsx");
          Workbook wb=WorkbookFactory.create(fis);
          Sheet sh = wb.getSheet("Sheet1");
          Row row=sh.getRow(1);
          Cell cell=row.getCell(0);
          String data=cell.getStringCellValue();
         WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
         search.sendKeys(data);
         search.click();
         Thread.sleep(2000);
         WebElement singer = driver.findElement(By.xpath("(//span[@class='CardTitle__LineClamp-sc-1h38un4-0 RBShQ'])[1]"));
         Actions act=new Actions(driver);
         act.scrollToElement(singer);
         singer.click();
        WebElement track = driver.findElement(By.xpath("//div[@class='m9t_KhZ6MI0XQj9b']//a[position()<=5 and position()>0]"));
          System.out.println(track);
          
		
		
//     	
		
     	
	}
}
