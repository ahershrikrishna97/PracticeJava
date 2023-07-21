package Googlenexon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nexon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		WebElement fra = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		driver.switchTo().frame(fra);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		Thread.sleep(1000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		
		WebElement googlesearch = driver.findElement(By.name("q"));
		googlesearch.click();
		googlesearch.sendKeys("mahindra");
		Thread.sleep(1000);

		List<WebElement> mahindraUL = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println("Size of list is "+mahindraUL.size());
		Thread.sleep(1000);
		
		 for (WebElement m : mahindraUL) 
		 {
			 System.out.println(m.getText());
			 
			 String Exp="mahindra bolero";
			 String Actualname = m.getText();
			 if(Actualname.equals(Exp))
			 {
				 Thread.sleep(500);
				 m.click();
				 break;
			 }
			 
		 }
		 Thread.sleep(500);

		 WebElement img = driver.findElement(By.xpath("(//span[@class='bmaJhd iJddsb'])[2]"));
		 
		img.click();
		
	//	driver.findElements(by.)
		
	}

}
