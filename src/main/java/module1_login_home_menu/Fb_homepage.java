package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_homepage
{
	@FindBy(xpath="//a[@role='link'][1]")
private WebElement logo;
	
	@FindBy(xpath="//input[@aria-label='Search Facebook']")private WebElement verifysearchbox;
	
	
	public Fb_homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean logo()
	{
		boolean b1=logo.isDisplayed();
		return b1;
		
		//if(b1==true)
		//{
		//	System.out.println("logo present");
		//}
		//else
		//{
			//System.out.println("not available");
		//}
	}
	public boolean verifysearchboxtab()
	{
		boolean b2=verifysearchbox.isDisplayed();
				return b2;
		
	}
	
	

}
