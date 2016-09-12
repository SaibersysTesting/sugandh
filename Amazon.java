package seleniumdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		Actions abc = new Actions(driver);
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		abc.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"))).build().perform();
		WebElement xyz = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("amazon").build().perform();
		abc.contextClick(xyz).build().perform();

	}

}
