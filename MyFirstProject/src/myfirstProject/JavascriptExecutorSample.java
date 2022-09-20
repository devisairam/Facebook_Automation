package myfirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorSample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.facebook.com/");
		WebElement txtUserName= driver.findElement(By.id("email"));
		WebElement txtPassword= driver.findElement(By.id("pass"));
		WebElement btnLogin= driver.findElement(By.xpath("//button[@name='login']"));
//		js.executeScript("arguments[0].value='devisairam@gmail.com'", txtUserName);
//		js.executeScript("arguments[0].value='Hrishi12#'", txtPassword);
//		js.executeScript("arguments[0].click()", btnLogin);
//		js.executeScript("alert('hi')");
		
		js.executeScript("document.getElementById('email').value='abcd'", txtUserName);
		js.executeScript("document.getElementById('pass').value='abcd'", txtPassword);
		
	}

}
