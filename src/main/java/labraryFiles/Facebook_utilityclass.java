package labraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Facebook_utilityclass
{
	
	public static String getdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\updateselenium\\Testdataexcel");
	   Sheet s=WorkbookFactory.create(fs).getSheet("Sheet5");
	   String s1=s.getRow(rowindex).getCell(cellindex).getStringCellValue();
	   return s1;
	 }
	public static void Screenshotfailtestcase(WebDriver driver,int tcid1) throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\HP\\eclipse-workspace\\updateselenium\\failtestcaseScreenshot"+tcid1+".jpg");
	    FileHandler.copy(f, f1);
	}
	public static String readdata(String key) throws IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\updateselenium\\facebook.properties");
          Properties p1=new Properties();
          p1.load(fs);
          String a=p1.getProperty(key);
          return a;
		
	}

}
