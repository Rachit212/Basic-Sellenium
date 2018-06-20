import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class basics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.register.com/");
//		System.out.println(driver.getTitle());
//		WebElement elementClear=driver.findElement(By.id("hp-searchInput"));
//		elementClear.clear();
//		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		WebElement elementSend =driver.findElement(By.id("lst-ib"));
		elementSend.sendKeys("qa infotech");
		WebElement elementClick=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]"));
		elementClick.click();
		driver.get("https://qainfotech.com/");
		System.out.println(driver.getTitle());
		WebElement elementDisplay=driver.findElement(By.id("container-page-1631_x_system-5318423"));
		boolean status=elementDisplay.isDisplayed();
		if(status) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
			driver.get("https://www.google.com/");
WebElement elimentAttribute=driver.findElement(By.id("lst-ib"));
String att=elimentAttribute.getAttribute("id");
System.out.println(att);
	}

}
