package labraryFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Superheros_baseclass 
{
	public WebDriver driver;
    public void openbrowserr()
    {
		driver=new ChromeDriver();
        driver.get("https://www.planetsuperheroes.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
    }

}
