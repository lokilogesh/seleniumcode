package Multiwindows;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		
		driver.findElement(By.cssSelector("button#windowButton")).click();
		driver.findElement(By.cssSelector("button#windowButton")).click();
		driver.findElement(By.cssSelector("button#windowButton")).click();
		
		Set<String>win=driver.getWindowHandles();
		ArrayList<String>mwin=new ArrayList<String>(win);
	    driver.switchTo().window(mwin.get(1)).close();
	    Thread.sleep(4000);
	    driver.switchTo().window(mwin.get(2)).close();
	    Thread.sleep(4000);
	    driver.switchTo().window(mwin.get(3)).close();
	    Thread.sleep(4000);
	    driver.switchTo().window(mwin.get(0));
	   
	    System.out.println(driver.getWindowHandle());
	    
		

	}

}
