package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Aravindh");
		driver.findElement(By.id("lastNameField")).sendKeys("raja");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("aravindh");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("raja");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("06/24/1995");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("engineering");
		driver.findElement(By.id("createContactForm_description")).sendKeys("creatingcontact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aravindhraja.ra@gmail.com");
		driver.findElement(By.id("createContactForm_generalCountryGeoId")).sendKeys("India");
		WebElement option1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(option1);
		dropDown.selectByVisibleText("TAMILNADU");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("the page title is "+ driver.getTitle());
		
		

	}

}
