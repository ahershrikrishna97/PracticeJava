package Googlenexon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Thread.sleep(3000);

		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Thread.sleep(3000);

		Actions act=new Actions(driver);
		
		act.moveToElement(img1).clickAndHold().release(dest).build().perform();
		Thread.sleep(500);
		act.moveToElement(img2).clickAndHold().release(dest).build().perform();
		Thread.sleep(500);
		act.moveToElement(img3).clickAndHold().release(dest).build().perform();
		Thread.sleep(500);
		act.moveToElement(img4).clickAndHold().release(dest).build().perform();

		
		
		
		
	}

}
