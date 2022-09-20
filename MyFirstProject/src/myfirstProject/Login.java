package myfirstProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.out.println(System.getProperty("user.dir"));
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-infobars-");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("devisairam@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Hrishi12#");
//		WebDriverWait wait=new WebDriverWait(driver, 2000);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']")));
//		driver.findElement(By.xpath("//button[@name='login']")).click();

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("devisairam@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Hrishi12#");
		String value = driver.findElement(By.cssSelector("input[name='email']")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.quit();

	}

}
