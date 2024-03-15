package week10day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesforceEdit {
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Qeagle@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement findElement=driver.findElement(By.xpath("//span[text()='Accounts'][1]"));
		driver.executeScript("arguments[0].click();", findElement);
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("kishorkumar",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='kishorkumar']")).click();
		driver.findElement(By.xpath("//span[text()='Show more actions']/preceding-sibling::lightning-primitive-icon")).click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).clear();
		driver.findElement(By.xpath("//input[@name=='Name']")).sendKeys("king kishor");
		driver.close();
		
			
	}

}
