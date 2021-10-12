package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).getText();
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		if (driver.getPageSource().contains("Duplicate Lead")) {
			System.out.println("verified title duplicate lead");

		} else {
			System.out.println("not verified");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains(text2)) {
			System.out.println("duplicate lead created");

		} else {
			System.out.println("duplicate lead not created");
		}
		driver.close();

	}

}
