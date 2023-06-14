package waittime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testwaittime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();;
		WebDriver driver=new EdgeDriver(); 
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		//java waitime
		Thread.sleep(4000);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebElement el=driver.findElement(By.className(""));
		//Explicit
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(40));
		wt.until(ExpectedConditions.elementToBeClickable(el));
		
		

	}

}
