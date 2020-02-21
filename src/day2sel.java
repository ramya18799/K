import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class day2sel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-12\\Desktop\\eclipse\\MONI\\SELDAY2\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		String i= driver.getTitle();
		
		System.out.println(i);
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
WebElement User = driver.findElement(By.name("pass"));
		
		User.sendKeys("monika");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
