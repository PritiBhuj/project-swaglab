package module1_login_home_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Superheros_register2_pom
{
	@FindBy(xpath="//input[@name='firstName']")private WebElement enter1stname;
	@FindBy(xpath="//input[@name='lastName']")private WebElement enterlastname;
	@FindBy(xpath="//input[@name='email']")private WebElement Entermail;
	@FindBy(xpath="//input[@name='mobile']")private WebElement Entermobileno;
	@FindBy(xpath="//input[@name='password']")private WebElement enterpsw;
	@FindBy(xpath="//input[@name='rePassword']")private WebElement enterrepsw;
	@FindBy(xpath="//button[text()='CREATE AN ACCOUNT ']")private WebElement clickcreateAc;
	
	
	public Superheros_register2_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void username(String us)
	{
		enter1stname.sendKeys(us);
	}
	public void userLastname(String lastname)
	{
		enterlastname.sendKeys(lastname);
	}
	public void usermailid(String mail)
	{
		Entermail.sendKeys(mail);
	}
	public void usermobileno(String mobileno)
	{
		Entermobileno.sendKeys(mobileno);
	}
	public void userpsw(String psw)
	{
		enterpsw.sendKeys(psw);
	}
	public void userRepsw(String reEnterpsw)
	{
		enterrepsw.sendKeys(reEnterpsw);
	}
	public void clickoncreateAcbutton()
	{
		clickcreateAc.click();
	}
	

}
