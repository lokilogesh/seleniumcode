package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousemovement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		WebElement menu=driver.findElement(By.cssSelector("ul.navbar-nav>li:nth-child(2)"));
		WebElement submenu=driver.findElement(By.cssSelector("div.dropdown-menu>a:nth-child(4)"));
		Actions act=new Actions(driver);
		act.moveToElement(menu).click().build().perform();
		Thread.sleep(4000);
		act.moveToElement(submenu).click().build().perform();
		
		
		
		

	}

}
