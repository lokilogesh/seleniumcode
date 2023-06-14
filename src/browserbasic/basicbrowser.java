package browserbasic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//To Enter the URL
		driver.get("http://triotend.com/tts/site/login");
		Thread.sleep(4000);
		
		//To navigate
		driver.navigate().to("http://triotend.com");
		Thread.sleep(4000);
		
		//backward
		driver.navigate().back();
		Thread.sleep(4000);
		
		//forward
		driver.navigate().forward();
		Thread.sleep(4000);
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(4000);
		
		//maxmize
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//resize
		Dimension d=new Dimension(475, 1030);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		
		//close
		 driver.close();
		//driver.quit();
		
		
		
		

	}

}
