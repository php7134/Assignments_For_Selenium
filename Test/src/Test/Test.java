package Test;
import java.io.IOException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class Test {

	public static void main(String[] args)throws  Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().refresh();	
		driver.manage().window().maximize();

		driver.get("https://wallethub.com/profile/test_insurance_company/");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");

		Thread.sleep(2000);

		WebElement ratings= driver.findElement(By.xpath("//*[@id=\"wh-body-inner\"]/div[2]/div[3]/span"));

		Actions action=new Actions(driver);
		action.moveToElement(ratings).perform();
        Thread.sleep (3000);
        
		driver.findElement(By.xpath("//*[@id=\"wh-body-inner\"]/div[2]/div[3]/div[1]/div/a[5]")).click();
		Thread.sleep(2000);

		//Next Page

		driver.findElement(By.xpath("//*[@id=\"reviewform\"]/div[1]/div/div/span[2]/i")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Health")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("review-content")).sendKeys("You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome job");
		Thread.sleep(2000);


		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		driver.findElement(By.className("submit")).click();
        Thread.sleep(3000);
        
		driver.get("https://wallethub.com/profile/test-insurance-company-13732055i/reviews/");
		js.executeScript("window.scrollBy(0,350)");
		
		String expectedMessage = "You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome job You are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome jobYou are doing awsome job";
		String message = driver.findElement(By.xpath("//*[@id=\"reviews\"]/div[3]/div[2]/div[1]/div[5]")).getText();
		//assert.assertTrue("Your text goes here",message.contains(expectedMessage));
		driver.quit();

	}

}
