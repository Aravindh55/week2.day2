package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("aravindhraja.ra@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean element= driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if (element==true) {
			System.out.println("the field is enabled");
			
		}
		else {
			System.out.println("the field is disabled");
		}
		
}

}
