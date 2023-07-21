package newFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstocxTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		UpstocxLoginPage login=new UpstocxLoginPage(driver);
		
		login.enterUserID();
		login.enterpassword();
		login.clickonSignin();
		
	}

}
