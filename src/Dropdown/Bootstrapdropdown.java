package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
       
		driver.findElement(By.cssSelector("button#btndropdown")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
		driver.findElement(By.cssSelector("button.close-dropdown")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button#btndropdown")).click();
		
		List<WebElement>options=
		driver.findElements(By.cssSelector("ul.dropdown-menu>li>label.radio-btn"));
		
		for (WebElement el : options) {
			System.out.println(el.getText());
			if(el.getText().equals("Bootstrap"))
			{
				el.click();
			}
			else if(el.getText().equals("JavaScript"))
			{
				el.click();
			}
		}
		
	}

}
