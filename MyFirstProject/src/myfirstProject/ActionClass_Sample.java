package myfirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Sample {

	public ActionClass_Sample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
	    options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
//		driver.findElement(By.id("email")).sendKeys("devisairam@gmail.com");
		action.sendKeys(driver.findElement(By.id("email")),"devisairam@gmail.com").perform();
		driver.findElement(By.id("pass")).sendKeys("Hrishi12#");
	    action.click(driver.findElement(By.xpath("//button[@name='login']"))).perform();
		
		
		
		
		
	    
	    
	    
	    
	    
	    
		
		

	}

}
