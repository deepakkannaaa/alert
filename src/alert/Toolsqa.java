package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Instagram\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath("//a[text()='ACCEPT']")).click();
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(3000);
		Alert s=driver.switchTo().alert();
		s.accept();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//button[text()='Confirm Pop up']")).click();
		Thread.sleep(3000);	
		Alert c=driver.switchTo().alert();
		c.dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		Thread.sleep(3000);
		Alert p=driver.switchTo().alert();
	    p.sendKeys("Deepakkannaa");
		p.accept();
		Thread.sleep(2000);
		driver.quit();

		
		
		
		
		
		System.out.println("helooo");

		
		
		
		
		
		System.out.println("hi");
		
		
	}

}
