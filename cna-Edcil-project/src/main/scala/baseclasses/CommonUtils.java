package baseclasses;

import java.io.File;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtils  extends BaseClass

{
	
	    public static String getExcelData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	    {
	        FileInputStream file = new FileInputStream("E:\\XlFile\\LOGIN_CREDENTIAL_Comman.xlsx");
	        String value = WorkbookFactory.create(file).getSheet("TDB_CREDENTIALS").getRow(rowIndex).getCell(colIndex).getStringCellValue();
	        return value;
	    }
	    
	public static void writeExcel(int rowNum, int cellNum, String inputString) throws EncryptedDocumentException, IOException 
    {
	 	String xlPath = "E:\\XlFile\\LOGIN_CREDENTIAL_Comman.xlsx";
	 	String xlSheet = "RESULT";
        FileInputStream fis = new FileInputStream(xlPath);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet(xlSheet);  
        Row row = sh.getRow(rowNum);
        Cell cell=row.createCell(cellNum);
        cell.setCellValue(inputString);
        FileOutputStream fos=new FileOutputStream(xlPath);
        wb.write(fos);
        fos.close();
    }
	
	

	// @Author Name
	// This Method is to capture ScreenShot

	// need to pass 2 Parameter 1 is Driver and 2 Tast case ID

	public static void captureScreenShoot(WebDriver driver, int ID) {

		File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Random rand = new Random();
		int rand_int1 = rand.nextInt(1000);
		try {
			FileUtils.copyFile(scrShot, new File("D:\\failed_screnshot\\failed_screnshot" + rand_int1 + ".png"));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}
		
		

	}
	
	
	public static void clickCheckBoxForVendorApproval(WebDriver driver) {  
		List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int checkBoxId = allCheckBoxes.size() - 1;
		String idFormation = "body_grdApprovalPending_chkApproval_" + checkBoxId + "";
		WebElement clickCheckbox = driver.findElement(By.id(idFormation));
		clickCheckbox.click();
		
	}
	
	

//	  public static void checkenabledCheckBoxs(WebDriver driver) { List<WebElement>
//	  checkBoxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
//	  int i = 0; for (WebElement checkBox : checkBoxList) { boolean selected =
//	  checkBox.isEnabled(); if (selected) { checkBox.click();
//	  System.out.println("check box id=====================" + i); break;
//	  
//	 } i++; } }
//	 
	
	
	public static void checkenabledCheckBox(WebDriver driver) {
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("//*[@id=\"body_grdApprovalPending\"]"));
		int i = 0;
		int checkBoxId = 0;
		String idFormation; 
		WebElement clickCheckbox ;
		for (WebElement checkBox : checkBoxList) {
			boolean selected = checkBox.isEnabled();
			if (selected) {
				checkBoxId = i;
				 checkBox.click();
				 System.out.println("check box id=====================" + i);
				 //break;

			}                                 //*[@id="body_grdApprovalPending"]/tbody/tr[1]/td[1]   ("input[type='checkbox']")
			i++;
		}
		 idFormation = "body_grdApprovalPending_chkApproval_" + checkBoxId + "";
		 clickCheckbox = driver.findElement(By.id(idFormation));
		clickCheckbox.click();
		clickCheckbox.sendKeys(Keys.TAB);
		
	}
	
	
	public static String generateAccountNumber( String generateNum) {
		
		//String generateNum =generateAccountNumber();
		Random r = new Random();
		long numbers = 100000000000L + (long) (r.nextDouble() * 99999999999L);
		String accountnumber = Long.toString(numbers);
		System.out.println(accountnumber);
		return accountnumber;
	}
	
	
	public static Map<String, StringBuilder> generatePAN(int len) {
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		pannumberMap = new HashMap<String, StringBuilder>();
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {

			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		sb = sb.append("8765D");
		pannumberMap.put("PANNUMBER",sb );
		return pannumberMap;

	}
	
	public static String generateSanctionNumber() {
		Random rand = new Random();
		int rand_int1 = rand.nextInt(10000);
		return String.valueOf(rand_int1);
	}
	
//	public static String getExcelData(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
//
//	{
//
//		FileInputStream file = new FileInputStream(".\\XLfiles\\LOGIN_CREDENTIAL.xlsx");
//
//		String value = WorkbookFactory.create(file).getSheet("CREDENTIAL").getRow(rowIndex).getCell(colIndex).getStringCellValue();
//
//		return value;
//
//	}
	
	
	
//	public static String getExcelRESULT(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
//
//	{
//
//		FileInputStream file = new FileInputStream(".\\XLfiles\\LOGIN_CREDENTIAL.xlsx");
//
//		String value = WorkbookFactory.create(file).getSheet("RESULT").getRow(rowIndex).getCell(colIndex).getStringCellValue();
//
//		return value;
//
//	}
}
