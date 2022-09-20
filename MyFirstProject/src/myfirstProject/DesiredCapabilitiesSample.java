package myfirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DesiredCapabilitiesSample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String driverPath=System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", driverPath+"\\driver\\chromedriver.exe");	
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--headless");
	    
	    WebDriver driver=new ChromeDriver(options);
	    driver.get("https://www.facebook.com/");
		
		
		

	}

}
