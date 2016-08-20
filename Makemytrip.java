package seleniumdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		// open the URL
		driver.get("http://makemytrip.com");
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		// click on round trip
		driver.findElement(By.xpath(".//*[@id='round_trip_button1']/span")).click();
		Thread.sleep(3000);

		// enter start date
		driver.findElement(By.id("start_date_sec")).click();

		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[3]/td[6]/a")).click();
		Thread.sleep(3000);
		// enter return date
		driver.findElement(By.xpath(".//*[@id='return_date_sec']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[5]/a")).click();
		int i = 0;
		while (i<5) {
			driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
			i++;
		}
		while(i<3){
			driver.findElement(By.xpath(".//*[@id='child_count']/a[2]")).click();
			i++;
		}
		driver.findElement(By.xpath(".//*[@id='class_selector']")).click();
		driver.findElement(By.xpath("//option[@class='business_class']")).click();
	}

}
