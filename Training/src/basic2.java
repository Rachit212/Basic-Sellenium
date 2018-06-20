import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      driver.get("http://store.demoqa.com/");
      String title =  driver.getTitle();
      String current = driver.getCurrentUrl();
      String src=driver.getPageSource();

      System.out.println(title);
      System.out.println(title.length());
      if(title==current) {
    	  System.out.println("Correct Page Opened");
      }
      else {
    	  System.out.println("Wrong Page Opened");
      }
      System.out.println(src.length());

	driver.close();
	}

}
