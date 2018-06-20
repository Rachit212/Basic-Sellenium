import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div/p/a")).click();
        driver.close();
	}

}
