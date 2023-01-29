package TestClass_1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import labraryFiles.Superheros_UtilityClass;
import labraryFiles.Superheros_baseclass;
import module1_login_home_menu.Superheros_login_pom;
import module1_login_home_menu.Superheros_register1_pom;
import module1_login_home_menu.Superheros_register2_pom;

public class Superheros_signupmodule_Test extends Superheros_baseclass
{
	
	Superheros_login_pom l1;
	Superheros_register1_pom l2;
	Superheros_register2_pom l3;
	
	@BeforeClass
	public void openbrowser()
	{
		openbrowserr();
		l1=new Superheros_login_pom(driver);
		l2=new Superheros_register1_pom(driver);
		l3=new Superheros_register2_pom(driver);
	}
	@Test
	public void ragisterpage() throws InterruptedException, EncryptedDocumentException, IOException
	{
		l1.profilebuttonclick();
		Thread.sleep(500);
		l1.clickonlogin();
		Thread.sleep(500);
		l2.ragisterUserclick();
		Thread.sleep(500);
		l3.username(Superheros_UtilityClass.getdata(10, 0));
		Thread.sleep(500);
		l3.userLastname(Superheros_UtilityClass.getdata(10, 1));
		Thread.sleep(500);

		l3.usermailid(Superheros_UtilityClass.getdata(10, 2));
		Thread.sleep(500);

		l3.usermobileno(Superheros_UtilityClass.getdata(10, 3));
		Thread.sleep(500);

		l3.userpsw(Superheros_UtilityClass.getdata(10, 4));
		Thread.sleep(500);

		l3.userRepsw(Superheros_UtilityClass.getdata(10, 5));
		Thread.sleep(500);

		l3.clickoncreateAcbutton();

	}
	@AfterClass
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(500);
		driver.close();
	}
	
	

	
}
