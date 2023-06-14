package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		WebElement frm=driver.findElement(By.cssSelector("iframe#iframeResult"));
		driver.switchTo().frame(frm);
		
		WebElement drp=driver.findElement(By.cssSelector("select#cars"));

		Select mdrp=new Select(drp);
		
		List<WebElement>options=mdrp.getOptions();
		for (WebElement el : options) 
		{
			System.out.println(el.getText());
			
		}
		
		mdrp.selectByIndex(2);
		Thread.sleep(4000);
		mdrp.selectByValue("audi");
		Thread.sleep(4000);
		mdrp.selectByVisibleText("Volvo");
		Thread.sleep(4000);
		
		System.out.println("<-----print all selected values----->");
		List<WebElement>soptions=mdrp.getAllSelectedOptions();
		for (WebElement el : soptions) 
		{
			System.out.println(el.getText());
			
		}
		
		//mdrp.deselectAll();
		mdrp.deselectByIndex(2);
		Thread.sleep(4000);
		mdrp.deselectByValue("audi");
		Thread.sleep(4000);
		mdrp.deselectByVisibleText("Volvo");
		
	}

}
