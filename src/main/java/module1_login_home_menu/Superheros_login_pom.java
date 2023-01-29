package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Superheros_login_pom 
{
	@FindBy(xpath="(//div[contains(@class,'d-flex flex-column')])[2]")private WebElement clickprofilebutton ;
	@FindBy(xpath="//button[text()='LOGIN/SIGNUP']")private WebElement loginclick;
	
	public Superheros_login_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void profilebuttonclick()
	{
		clickprofilebutton.click();
		
	}
	public void clickonlogin()
	{
		loginclick.click();
	}
	
	

}
