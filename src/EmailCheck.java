import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sagar.tandu\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@xyz.com");
  
	}

}
