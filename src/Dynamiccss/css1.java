package Dynamiccss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class css1 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//To Enter the URL
		driver.get("http://triotend.com/tts/site/login");
		
		//Tag and ID
		driver.findElement(By.cssSelector("input#email")).sendKeys("tag and ID");		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag and Class
		driver.findElement(By.cssSelector("input.form-username")).sendKeys("tag and class");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag and Attribute 
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("tag and attrubute");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag, Class, and Attribute
		driver.findElement(By.cssSelector("input.form-username[placeholder='Username']")).sendKeys("tag class attribute");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//Tag, ID, and Attribute
		driver.findElement(By.cssSelector("input#email[placeholder='Username']")).sendKeys("tag id attribute");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//starts with
		driver.findElement(By.cssSelector("input[placeholder^='Us']")).sendKeys("startswith");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//ends with
		driver.findElement(By.cssSelector("input[placeholder$='me']")).sendKeys("ends with");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		//contains
		driver.findElement(By.cssSelector("input[placeholder*='name']")).sendKeys("contains");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#email")).clear();
		Thread.sleep(4000);
		
		
		
		
		
	}

}
