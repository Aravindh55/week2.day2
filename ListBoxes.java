package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement option = driver.findElement(By.id("dropdown1"));
		Select dropDown = new Select(option);
		dropDown.selectByIndex(1);
		WebElement option2 = driver.findElement(By.name("dropdown2"));
		Select dropDown2 = new Select(option2);
		dropDown2.selectByVisibleText("Appium");
		WebElement option3 = driver.findElement(By.id("dropdown3"));
		Select dropDown3 = new Select(option3);
		dropDown3.selectByValue("3");
		WebElement option4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dropDown4 = new Select(option4);
		List<WebElement> drops = dropDown4.getOptions();
		System.out.println("the number of options is " + drops.size());
		driver.findElement(By.xpath("(//section[@class='innerblock']//select)[5]")).sendKeys("Loadrunner");
		WebElement option5 = driver.findElement(By.xpath("(//section[@class='innerblock']//select)[6]"));
		Select dropDown5 = new Select(option5);
		dropDown5.selectByIndex(1);

	}

}
