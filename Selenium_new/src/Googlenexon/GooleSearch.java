package Googlenexon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GooleSearch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	Thread.sleep(1000);
	
	
	WebElement search = driver.findElement(By.name("q"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(search).click().sendKeys("Java").build().perform();
	
	List<WebElement> searList = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	
	System.out.println("Size of list is "+searList.size());
	
	Thread.sleep(1000);

	for (WebElement s : searList)
	{
	System.out.println(s.getText());
		
	}
	Thread.sleep(1000);

	for(int i=1;i<=10;i++)
	{
		Thread.sleep(1000);
	act.keyDown(Keys.ARROW_DOWN).build().perform();;
	}
	
	
	
}
	
	
	
}
