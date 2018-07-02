package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.DisplayAction;
import org.openqa.selenium.*;
public class First {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().refresh();	

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
        Thread.sleep(3000);


		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Please enter email or phone')");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
		
	
        Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();
		js.executeScript("alert('Please enter password')");
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).click();

		driver.findElement(By.id("loginbutton")).click();

		System.out.println("Hello World");
		driver.quit();
	}

}
