package myfirstProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public WindowHandles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> windowsTabs=new ArrayList<>(windowHandles);
//		driver.switchTo().window(windowsTabs.get(0));

		
		Iterator<String> iterString = windowHandles.iterator();
		
		while(iterString.hasNext())
		{
		  String childWIndow = iterString.next();
		  System.out.println(childWIndow);
		  
		  driver.switchTo().window(childWIndow);
		  if(driver.getTitle().equalsIgnoreCase("Basic Web Page Title"))
		  {
			  driver.close();
		  }
		}
		
		driver.switchTo().window(parentWindow);
		driver.close();
		
	}

}
