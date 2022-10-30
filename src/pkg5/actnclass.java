package pkg5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actnclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software and drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		
		
		
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		
		Thread.sleep(2000);
		
		Select act = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		
		act.selectByValue("16");
		
      Select act1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
            
      act1.selectByValue("2");
      
      
      Select act2 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
      
		act2.selectByVisibleText("1998");
		
		
		
		
		
		
		
	}

}
