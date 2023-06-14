package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basictooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_tooltip");

		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		driver.switchTo().frame(frm);
		
		WebElement tp=driver.findElement(By.cssSelector("div.tooltip"));
		
		Actions act=new Actions(driver);
		act.moveToElement(tp).build().perform();
		
		WebElement tptxt=driver.findElement(By.cssSelector("span.tooltiptext"));
		
		System.out.println(tptxt.getText());
		
		
		

	}

}
