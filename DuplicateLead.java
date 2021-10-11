package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("aravindhraja.ra@gmail.com");
		driver.findElement(By.linkText("Find Leads")).click();
		String text = driver.findElement(By.xpath("//a[text()='avd']")).getText();
		driver.findElement(By.xpath("//a[text()='avd']")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		if (driver.getPageSource().contains("Duplicate Lead")) {
			System.out.println("verified duplicate lead");

		} else {
			System.out.println("not verified");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(text)) {
			System.out.println("same name");
			
		}
		else {
			System.out.println("different same");
		}
		driver.close();
		

	}
	

}
