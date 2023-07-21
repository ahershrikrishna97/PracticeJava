package ActionClas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassStudy
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.moveToElement(rightclick).contextClick().build().perform();
		Thread.sleep(2000);
		
		for(int i=1;i<=4;i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.moveToElement(doubleclick).doubleClick().build().perform();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
	
	}
}
