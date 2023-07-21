package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableMAPofIndia 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mapsofindia.com/states/");
	//	Thread.sleep(3000);
		
		List<WebElement> table = driver.findElements(By.xpath("(//table[@class='tableizer-table'])[2]//tr"));
		
		System.out.println(table.size());	
		
		
		Iterator<WebElement> it = table.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		Thread.sleep(1000);
		for(WebElement e:table)
		{
			String exp="Jammu and Kashmir Srinagar";
			String act=e.getText();
			
			System.out.println(e.getText());
			Thread.sleep(1000);

			if(act.equals(exp))
			{
				e.click();
				break;
			}
			
			
		}
		
		
		
		
	}
	
}
