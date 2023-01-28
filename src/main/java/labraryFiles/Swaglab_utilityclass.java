package labraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Swaglab_utilityclass
{
	//this method is use to get test data from excel sheet 
	//need to pass to parameter  1 rowindex,2.cellindex
	//@author name=priti
	
	public static String getdata(int rowindex,int cellindex) throws IOException
	{
		FileInputStream d=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\updateselenium\\Testdataexcel\\New excelsheet.xlsx");
		
		Sheet sh=WorkbookFactory.create(d).getSheet("Sheet5");
		String value=sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
	}
	//thid method is use to capture the screenshot of faild test case we need to pass two
	//parameter 1.webdriver object,2.tcid
	//@authore priti
	
	public static void getScreenshot(WebDriver driver,int tcid1) throws IOException
	{
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\HP\\eclipse-workspace\\updateselenium\\failtestcaseScreenshot\\abc"+tcid1+"");
		FileHandler.copy(f1, f2);
	}
	public static String readdata(String key) throws IOException
	{
		FileInputStream d=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\updateselenium\\swag.properties");
      Properties p1=new Properties();
    		  p1.load(d);
    		 String value= p1.getProperty(key);
    		  return value;
		
	}
	
	
	
	

	

}
