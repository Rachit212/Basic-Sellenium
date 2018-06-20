import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sellenium {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		WebElement bingsearch=driver.findElement(By.id("sb_form_q"));
		bingsearch.sendKeys("qa infotech");
		bingsearch.submit();
		
	
	}

}
