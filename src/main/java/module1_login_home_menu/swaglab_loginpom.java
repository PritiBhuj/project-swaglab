package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglab_loginpom
{
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement usname;
	@FindBy(xpath="//input[@id='password']")private WebElement psw;
	@FindBy(xpath="//input[@id='login-button']")private WebElement login;
	
	public swaglab_loginpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void inputus(String username)
	{
		usname.sendKeys(username);
	}
	public void inputpsw(String password)
	{
		psw.sendKeys(password);
	}
	public void clicklogin()
	{
		login.click();
	}

}
