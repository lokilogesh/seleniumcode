package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstraptooltip {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");
		
		
		
		WebElement el=driver.findElement(By.cssSelector("button[data-toggle='tooltip']"));
		Actions act=new Actions(driver);
		act.moveToElement(el).build().perform();
		
		
		WebElement tooltip=driver.findElement(By.cssSelector("div.tooltip-inner"));
		System.out.println(tooltip.getText());
		

	}

}
