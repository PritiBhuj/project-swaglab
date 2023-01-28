package TestClass_1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import labraryFiles.Swaglab_baseclass;
import labraryFiles.Swaglab_utilityclass;
import module1_login_home_menu.Swaglab_homepagepom;
import module1_login_home_menu.Swaglab_menupom;
import module1_login_home_menu.swaglab_loginpom;

public class Swaglab_test extends Swaglab_baseclass
{
	
	swaglab_loginpom u1;
	Swaglab_homepagepom u2;
	Swaglab_menupom u3;
	
	int tcid1;
	int tcid2;
	
	@BeforeClass
	public void  browseropen1() throws IOException
	{
		openbowser();
		u1=new swaglab_loginpom(driver);
		u2=new Swaglab_homepagepom(driver);
		u3=new Swaglab_menupom(driver);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		u1.inputus(Swaglab_utilityclass.readdata("us"));
		u1.inputpsw(Swaglab_utilityclass.readdata("psw"));
		u1.clicklogin();
		
	}
	@Test
	public void logo()
	{
		tcid1=11;
		boolean a1=u2.verifylogo();
		Assert.assertTrue(a1,"fail:-if logo not present");
		
		
	}
	@Test
	public void addtocartverify() throws IOException
	{
		tcid2=12;
		u2.clickproductcart();
		String exptext =Swaglab_utilityclass.getdata(7, 0);
		String acttext=u2.textremoveget();
		Assert.assertEquals(exptext, acttext,"fail:if both result are not equal");
	}
	@AfterMethod
	public void logout(ITestResult d1) throws IOException
	{
		if(d1.getStatus()==ITestResult.FAILURE)
		{
			Swaglab_utilityclass.getScreenshot(driver, tcid1);
		}
		u3.clickmenubutton();
		u3.logout();
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
		
}	
	