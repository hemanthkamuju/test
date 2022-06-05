package assesment.MindtreeAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.nobroker.in/");
		driver.findElement(By.xpath("//div[@class='nb__19hcF']")).click();
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8500453560");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kmjhemanth");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kmjhemanth@gmail.com");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}

