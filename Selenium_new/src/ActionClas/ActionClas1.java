package ActionClas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClas1 {
		
public static void main(String[] args) throws InterruptedException
{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement email = driver.findElement(By.id("email"));
		act.keyDown(email, Keys.SHIFT).sendKeys("krishna").build().perform();
		Thread.sleep(1000);

		act.moveToElement(email).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("pass"));
		act.keyDown(password, Keys.SHIFT).sendKeys("AHER").build().perform();
		
		Thread.sleep(1000);

		WebElement CreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		act.moveToElement(CreateAcc).click().build().perform();
		Thread.sleep(2000);

	//	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		act.sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);

		WebElement Lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		act.moveToElement(Lastname).click().build().perform();
		
		
		
		
	}

}
