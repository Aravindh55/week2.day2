package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//form[@method='post']//a)[3]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("aravindh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("raja");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("aravindhraja.ra@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("aravindhraja.ra@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("shadow");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("24");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Jun");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1995");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		
		
	}

}
