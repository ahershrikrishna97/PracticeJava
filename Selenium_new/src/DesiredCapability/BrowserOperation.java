package DesiredCapability;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class BrowserOperation {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(3);
		
		File dest=new File("C:\\Users\\Sai\\eclipse-workspace\\Selenium_new\\ScreenShot\\"+Random+".png");
		
		FileHandler.copy(src, dest);
		Thread.sleep(1000);

		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);

		//Vertical horizontal scrolling
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random1 = RandomString.make(4);
		File dest1=new File("C:\\Users\\Sai\\eclipse-workspace\\Selenium_new\\ScreenShot\\"+random1+".jpeg");
		
		FileHandler.copy(src1, dest1);
		Thread.sleep(1000);

		WebElement welcome = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(true)",welcome);
		
		System.out.println(welcome.getText());
		
	}

}
