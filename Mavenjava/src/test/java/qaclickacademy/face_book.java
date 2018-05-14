package qaclickacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class face_book {
	
	
	@Test
	public void face_book_login()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/RAHMAN/Downloads/chromedriver.dmg");
		
		WebDriver driver = new ChromeDriver(); 
		
		String currentWindow = driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Arahman8907");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Welcome1324");
		
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		if(driver.findElement(By.xpath("//*[@class='_4rbf _53ij']")).isDisplayed());
		{
			System.out.println(driver.findElement(By.xpath("//*[@class='_4rbf _53ij']")).getText());
		}
		
		driver.quit();
	}
	
	
	
	

}
