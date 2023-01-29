package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Superheros_register1_pom
{
	@FindBy(xpath="//button[text()='Register']")private WebElement clickragisterbutton;

	
	public Superheros_register1_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ragisterUserclick()
	{
		clickragisterbutton.click();
	}

}
