package dataDrivenPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenclass {
	@Test(dataProvider="OpenGmails")
	
	public void OpenGmail(String Email,String Password) throws InterruptedException{
		
		WebDriver d = new FirefoxDriver();
		
		// open gmail
		
		d.get("http://www.gmail.com");
		
		// enter gmail id
		Thread.sleep(3000);
		d.findElement(By.id("Email")).sendKeys("gmail");
		
		// click next button
		Thread.sleep(3000);
		d.findElement(By.xpath(".//*[@id='next']")).click();
		
		// enter password
		Thread.sleep(3000);
		d.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("password");

		// click signin
		Thread.sleep(3000);
		d.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		// click image button
		Thread.sleep(3000);
		d.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		// click signout
		Thread.sleep(8000);
		d.findElement(By.xpath(".//*[@id='gb_71']")).click();
	}
	

	@DataProvider(name="OpenGmailUrls")

	public void ReadExcel() throws BiffException, IOException{
		
		//create the object
		
	File f = new File("D:\\Excel\\Gmailworkbookexcel.xls");
	
	// get the workbook
	
	Workbook wb= Workbook.getWorkbook(f);
	
	// get the sheet
	Sheet s= wb.getSheet(0);
	
	// get the rows and columns
	
int r = s.getRows();
int c = s.getColumns();

System.out.println(r);
System.out.println(c);

// load the sheet data

String SData[][]= new String [r][c];

for (int i=0;i<r;i++)
{
	
	for (int j=0;j<c;j++)
	{
	// get cell values
	
	Cell v= s.getCell(j,i);
	
	
	System.out.println(v.getContents());
	
	}
}
	}
}
	
	
		
	
