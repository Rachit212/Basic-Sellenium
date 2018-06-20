import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic4 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
WebDriver driver= new ChromeDriver();

driver.get("http://DemoQA.com");
WebElement Reg=driver.findElement(By.id("menu-item-374"));
	Reg.click();
	Thread.sleep(100);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
//	driver.quit();
	}

}
