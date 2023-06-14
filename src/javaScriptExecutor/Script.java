package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		//Typecast
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//login
		js.executeScript("document.getElementById('email').value='triotend@gmail.com'");
		js.executeScript("document.getElementById('password').value='triotend'");
		
		WebElement signin=driver.findElement(By.cssSelector("button.btn"));
		
		js.executeScript("arguments[0].click()", signin);
		
		Thread.sleep(12000);
		
		//clicking on hidden Element
		WebElement exp=driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-child(16)"));
		js.executeScript("arguments[0].click()", exp);
		

	}

}
