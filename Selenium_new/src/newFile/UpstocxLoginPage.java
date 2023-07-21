package newFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstocxLoginPage
{

	@FindBy(name = "userId") private WebElement userID; 
	
	@FindBy(id = "password") private WebElement password;
	
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement SigninButton;



public UpstocxLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterUserID()
{
	userID.sendKeys("2VB5QJ");
}

public void enterpassword()
{
	password.sendKeys("Kunal@2000");
}

public void clickonSignin()
{
	SigninButton.click();
}

}

