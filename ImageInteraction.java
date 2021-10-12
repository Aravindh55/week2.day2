package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageInteraction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		WebElement element = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if (element.getAttribute("onclick") == null) {
			System.out.println("the link is broken");

		} else {
			System.out.println("the link is fine");
		}
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

	}

}
