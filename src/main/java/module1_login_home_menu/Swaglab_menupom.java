package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglab_menupom
{
	@FindBy(xpath="//div[@class='bm-burger-button']")private WebElement clickmenu;
	@FindBy(xpath="//a[text()='Logout']")private WebElement clicklogout;

    public Swaglab_menupom(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
	public void clickmenubutton()
	{
		clickmenu.click();
	}
	public void logout()
	{
		clicklogout.click();
	}
}
