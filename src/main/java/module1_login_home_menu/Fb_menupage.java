package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_menupage
{
	@FindBy(xpath="//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'][1]")
	private WebElement menu;
	@FindBy(xpath="//span[text()='Log Out']")
private WebElement logout;
	
	public Fb_menupage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void menu()
	{
		menu.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	

}
