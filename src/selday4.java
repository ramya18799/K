import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class selday4 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Greens-12\\Desktop\\eclipse\\MONI\\selday3\\Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		String gt = driver.getTitle();
		
		System.out.println(gt);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement username = driver.findElement(By.name("identifier"));
		username.sendKeys("akinom2395@gmail.com");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		loginbutton.click();
		
		
	
		
			
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
