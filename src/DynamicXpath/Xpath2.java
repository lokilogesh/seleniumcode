package DynamicXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//To Enter the URL
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		//Using last()
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("last()");
		
		//using last()-1
		driver.findElement(By.xpath("(//input[@type='text'])[last()-1]")).sendKeys("last()-1");
		
		//Using position()
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("position");
		
		//Using index
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("index");
		
		//Using following xpath axes

		driver.findElement(By.xpath("//input[@name='fullName']/following::input[@name='username']")).sendKeys("following");
		
		//Using preceding xpath axes
        driver.findElement(By.xpath("//input[@name='username']/preceding::input[@name='fullName']")).sendKeys("preceding");
		
	}

}
