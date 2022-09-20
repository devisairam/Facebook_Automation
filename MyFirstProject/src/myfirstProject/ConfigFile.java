package myfirstProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigFile {

	public ConfigFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		try {
			FileInputStream fp=new FileInputStream("E:\\Devi\\Mine\\MyFirstProject\\src\\myfirstProject\\config.properties");
			Properties prop=new Properties();
			prop.load(fp);
			
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
			driver.manage().window().maximize();			

			driver.findElement(By.cssSelector("input[name='email']")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.cssSelector("input#pass")).sendKeys(prop.getProperty("password"));
			String value = driver.findElement(By.cssSelector("input[name='email']")).getAttribute("value");
				
			driver.findElement(By.cssSelector("button[name='login']")).click();
			
			FileOutputStream output=new FileOutputStream("E:\\Devi\\Mine\\MyFirstProject\\src\\myfirstProject\\config.properties");
			prop.setProperty("text", "1234");
			prop.store(output, "hi");
			
			driver.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
