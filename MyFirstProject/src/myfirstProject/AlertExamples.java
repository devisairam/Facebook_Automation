package myfirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertExamples {

	public AlertExamples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("http://demo.guru99.com/test/delete_customer.php");
//				
//		Actions action=new Actions(driver);
//		action.sendKeys(driver.findElement(By.name("cusid")),"1234").perform();
//		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
//				
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().accept();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		driver.switchTo().alert().accept();
		
		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.id("alertButton")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
				
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		driver.switchTo().alert().sendKeys("Abcd");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		

	}

}
