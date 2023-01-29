package labraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Superheros_UtilityClass
{
	public static String getdata(int rowindex, int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("E:\\Veloictty pritii\\Velocityy\\exceljarfile\\New excelsheet.xlsx");
		Sheet s1=WorkbookFactory.create(f1).getSheet("Sheet5");
		String a1=s1.getRow(rowindex).getCell(colindex).getStringCellValue();
		return a1;
	}
	public static void getScreenshotFailTC(WebDriver driver,int tcid) throws IOException
	{
		
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\HP\\Documents\\Screenshot prog\\sg"+tcid+".jpg");
		FileHandler.copy(f1, f2);
	}
	public static void shop(WebDriver driver, WebElement element)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(element).perform();
	}

}
