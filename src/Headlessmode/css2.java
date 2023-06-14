package Headlessmode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(opt);
		
		
		//To Enter the URL
		driver.get("http://triotend.com/tts/site/login");
		
		
		Activitycapture cap=new Activitycapture();
		EventFiringWebDriver eve=new EventFiringWebDriver(driver);
		eve.register(cap);
		driver=eve;
		
		
		
		//Login script
		driver.findElement(By.cssSelector("input#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button.btn")).click();		
		
		//Direct Child 
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		
		//nth child
        driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(9)")).click();
        
        //subchild
        driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(10)")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        
        driver.findElement(By.cssSelector("ul.treeview-menu>li:nth-child(2)")).click();
        
        
	}

}
