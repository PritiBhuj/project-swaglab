package TestClass_1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import labraryFiles.Facebook_baseClass;
import labraryFiles.Facebook_utilityclass;
import module1_login_home_menu.Fb_homepage;
import module1_login_home_menu.Fb_loginpage;
import module1_login_home_menu.Fb_menupage;

public class Facebook_TestClass extends Facebook_baseClass
{
	Fb_loginpage f1;
	Fb_homepage f2;
	Fb_menupage f3;
	int tcid1;
	int tcid2;
	@BeforeClass
	public void openbrowser() throws IOException
	{
		openbrow1();
		f1=new Fb_loginpage(driver);
		f2=new Fb_homepage(driver);
		f3=new Fb_menupage(driver);
		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		f1.username(Facebook_utilityclass.readdata("us"));
		f1.password(Facebook_utilityclass.readdata("psw"));
		f1.login();
		
	}
	@Test
	public void verifylogo()
	{
		tcid1=100;
		boolean w1=f2.logo();
		Assert.assertTrue(w1,"pass:if result is true");
		
	}
	@Test
	public void verifyserchbox()
	{
		tcid2=101;
		boolean w2=f2.verifysearchboxtab();
		Assert.assertTrue(w2,"pass:if result is true");

	}
	@AfterMethod
	public void clickmenu(ITestResult e1) throws IOException
	{
		if(e1.getStatus()==ITestResult.FAILURE)
		{
			Facebook_utilityclass.Screenshotfailtestcase(driver, tcid1);
		}
		f3.menu();
		f3.logout();
	}
	@AfterClass
      public void logout()
	{
		driver.close();
	}
	

}
