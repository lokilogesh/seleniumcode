package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//To Enter the URL
		driver.get("http://triotend.com/tts/site/login");

		//BY ID
		driver.findElement(By.id("email")).sendKeys("BY ID");
		Thread.sleep(4000);
		
		//By class name
		driver.findElement(By.className("form-password")).sendKeys("By class name");
		Thread.sleep(4000);
		
		//By Tagname
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		
		//By Name
		driver.findElement(By.name("username")).sendKeys("By name");
		Thread.sleep(4000);
		
		//By link text
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(4000);
		
	    //By cssSelector
		driver.findElement(By.cssSelector("#form-username")).sendKeys("css");
		Thread.sleep(4000);
		
		//By xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button")).click();
		Thread.sleep(4000);
		
		//BY partial link 
	    driver.findElement(By.partialLinkText("Admin")).click();
		
	}

}
