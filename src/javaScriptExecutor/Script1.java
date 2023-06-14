package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		//Type cast
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//hiddenElement
		WebElement rm=driver.findElement(By.cssSelector("a.selenium-ide"));
		js.executeScript("arguments[0].click()", rm);
		
		// to navigate
		js.executeScript("window.location='https://www.selenium.dev/'");
		Thread.sleep(4000);
		//particular height
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(4000);
		//to scroll particular element
		WebElement mr=driver.findElement(By.cssSelector("a[href='/blog']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",mr);
		
		
		
	
	}

}
