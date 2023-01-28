package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swaglab_homepagepom 
{
	@FindBy(xpath="//div[@class='peek']")private WebElement logoverify;
	//@FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement addtocartclick;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement clickcart;
	@FindBy(xpath="//button[text()='Remove']")private WebElement getbuttontext;
	@FindBy(xpath="//a[text()='Logout']")private WebElement clicklogout;
	
	
	public Swaglab_homepagepom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifylogo()
	{
		boolean s1=logoverify.isDisplayed();
		return s1;
	}
	//public void clickaddtocartbutton()
	//{
	//	addtocartclick.click();
	//}
	public void clickproductcart()
	{
		clickcart.click();
	}
	public String textremoveget()
	{
		
		String a1=getbuttontext.getText();
		return a1;
	}
	

}
