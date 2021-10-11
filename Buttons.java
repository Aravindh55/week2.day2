package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("home")).click();
		//driver.close();
		//driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		System.out.println("the position is: "+driver.findElement(By.id("position")).getLocation());
		WebElement element = driver.findElement(By.id("color"));
		String color = element.getCssValue("color");
		System.out.println("the color is "+color);
		System.out.println("the size is "+driver.findElement(By.id("size")).getSize());
		
		
		
		
		
		
	}

}
