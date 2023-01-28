package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_loginpage
{
    
	@FindBy(xpath="//input[@id='email']")
private WebElement UN;
	@FindBy(xpath="//input[@type='password']")
private WebElement Psw;
	@FindBy(xpath="//button[text()='Log in']")
private WebElement login;
	
	public Fb_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String us)
	{
		UN.sendKeys(us);
	}
	public void password(String passw)
	{
		Psw.sendKeys(passw);
	}
	public void login()
	{
		login.click();
	}

	
}
