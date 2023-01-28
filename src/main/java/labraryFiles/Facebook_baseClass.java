package labraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_baseClass
{
	public WebDriver driver;
	public void openbrow1() throws IOException
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
	driver=new ChromeDriver(op);
	driver.get(Facebook_utilityclass.readdata("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}

}
