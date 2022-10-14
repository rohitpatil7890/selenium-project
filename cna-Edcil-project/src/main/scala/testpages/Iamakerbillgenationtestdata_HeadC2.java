package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.Iamakerbillgenration_headC2;

public class Iamakerbillgenationtestdata_HeadC2 extends BaseClass {
	
	

	

	//public class IAMAKER1 extends BaseClass  {

	Iamakerbillgenration_headC2 IGB;

		@BeforeClass
	
		public void openbrowser() throws IOException


		{
			initializeBrowser();

			IGB = new Iamakerbillgenration_headC2 (driver);

		}

		@BeforeMethod
		public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException

		{
			try {
			IGB.Username(CommonUtils.getExcelData(6, 0));

			IGB.Password(CommonUtils.getExcelData(6, 1));
			IGB.clickOnLOGIN();
			IGB.clickontransaction();
			IGB.clickgeneratebill();
			IGB.clickOnFY();
			IGB.clickOnScheme();
			IGB.clickOnSubScheme();
			IGB.clickOnHeadCode();   
			IGB.BillTypee();
			IGB.ClickOnTypePAN();
			String pannumber="";
			if(!pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
			 pannumber = pannumberMap.get("PANNUMBER").toString();
			}else {
				pannumber = CommonUtils.getExcelData(62, 1);
			}
			IGB.clickselectPAN(pannumber);
			IGB.clickselectVender();
			IGB.enterbillAmount(CommonUtils.getExcelData(63, 1));
			IGB.enterdetail(CommonUtils.getExcelData(65, 1));
			IGB.enterremark(CommonUtils.getExcelData(66, 1));
			IGB.fileuploadbillcopy(CommonUtils.getExcelData(67, 1));

			WebElement modalAcceptButton = driver.findElement(By.name("ctl00$body$Button1"));
			modalAcceptButton.click();
			Thread.sleep(2000);
			IGB.Save();
			WebElement modalOkButton = driver.findElement(By.id("body_btnSaveRecord"));
			modalOkButton.click();
			Thread.sleep(2000);
			WebElement modalOkButtonn = driver.findElement(By.id("body_btnYES"));
			modalOkButtonn.click();
			Thread.sleep(2000);
			WebElement modalOk = driver.findElement(By.id("Form1"));
			modalOk.click();

			// login.Status(); 

			Thread.sleep(2000);
			IGB.viewSlip();
			Thread.sleep(2000);
			IGB.Approve();
			Thread.sleep(2000);
			IGB.RemarkText(CommonUtils.getExcelData(69, 1));
			IGB.Remarksyes();
			Thread.sleep(5000);
			// login.RemarkNo();


			
	/////////////////////// IAMaekerLogin BillOutWords For Approval /////////////////////////////////////////////////////////
			
			//IGB.clickontransaction();
			IGB.clickontransaction();
			Thread.sleep(3000);
			IGB.BillTransaction(driver);
			Thread.sleep(3000);
			IGB.BillOutWords();
			
			IGB.viewSlip();
			
			//IGB.Status();
			Thread.sleep(3000);
			IGB.LogOutIAmaker();
			Thread.sleep(3000);
			IGB.IamakerlogoutYes();
			
	//////////////////////////////// IAChekerLogin For INBOX Approval	///////////////////////////////////////////
			
			IGB.IAChekerLogin(CommonUtils.getExcelData(8, 0));
			IGB.IAChekerPassword(CommonUtils.getExcelData(8, 1));
			IGB.IAChekerLOGIN();
			IGB.clickontransaction();
			Thread.sleep(5000);
			IGB.BillTransaction(driver);
			IGB.BillInwardsclick();
			IGB.showrecordclick();
			IGB.inwerdslipclick();
			IGB.approveslipclick();
			IGB.remarksend();
			IGB.remarkyesclick();
			
			
	////////////////////////////////IAChekerLogin For OUTBOX Approval	///////////////////////////////////////////
			
//			IGB.clickontransaction();
//			Thread.sleep(5000);
//			IGB.BillTransaction(driver);
			//IGB.clickontransaction();
			
			IGB.IACtransaction1click();
			IGB.hoverBillTransection1(driver);
			IGB.BillOutwordsclick();
			IGB.showrecordclick1();
			IGB.outwordslipclick();
			
			IGB.logoutclick();
			IGB.yeslogoutclick();
		}
		catch(Exception e)
		{
			
			CommonUtils.captureScreenShoot(driver, 1); 
			CommonUtils.writeExcel(16, 3, "Failed");	
		}
		

	}
	
	@Test
	public void Iamakerbillgenration_headC2() throws EncryptedDocumentException, IOException {
		Reporter.log("---Runing Test Script-------");
		//String expectedURL = "http://cna.demofms.com/Login.aspx";
		String expectedURL = "http://192.168.0.162:5259/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
			CommonUtils.writeExcel(16, 2, "passed");
		
		AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
		System.out.println(actualURL);
		
		}

		@AfterMethod
		public void ApplicationClose() {

			Reporter.log("-----Close Application-----");

	

		}

		@AfterClass
		public void CloseBrowser() throws InterruptedException {
		
			Thread.sleep(2000);
			driver.quit();
	    

		}
}




