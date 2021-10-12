package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("input-username")).sendKeys("aravindh");
		driver.findElement(By.id("input-firstname")).sendKeys("aravindh");
		driver.findElement(By.id("input-lastname")).sendKeys("raja");
		driver.findElement(By.id("input-email")).sendKeys("aravindhraja.ra@gmail.com");
		WebElement option1 = driver.findElement(By.id("input-country"));
		Select dropDown1 = new Select(option1);
		dropDown1.selectByIndex(99);
		driver.findElement(By.id("input-password")).sendKeys("12345");
		//cannot create account because of captcha image....others done.

	}

}
