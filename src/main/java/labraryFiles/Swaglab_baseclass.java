package labraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglab_baseclass
{
	
	 public WebDriver driver;
	public void openbowser() throws IOException
	{
		
		driver=new ChromeDriver();
		driver.get(Swaglab_utilityclass.readdata("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.navigate().back();

	}
	
	

}
