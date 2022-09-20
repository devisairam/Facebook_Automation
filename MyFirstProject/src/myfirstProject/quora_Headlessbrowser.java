package myfirstProject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class quora_Headlessbrowser {

	public quora_Headlessbrowser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.orangehrm.com/");
//        driver.manage().window().maximize();
//        driver.close();
		
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("devisairam@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Hrishi12#");
		String value = driver.findElement(By.cssSelector("input[name='email']")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
