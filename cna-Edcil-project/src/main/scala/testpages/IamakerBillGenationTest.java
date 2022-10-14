package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.Iamakerbillgenration;

public class IamakerBillGenationTest extends BaseClass {

	// public class IAMAKER1 extends BaseClass {

	Iamakerbillgenration IGB;

	@BeforeClass

	public void openbrowser() throws IOException

	{
		initializeBrowser();

		IGB = new Iamakerbillgenration(driver);

	}

	
	@BeforeMethod
	public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException

	{
		try {
			IGB.Username(CommonUtils.getExcelData(4, 2));

			IGB.Password(CommonUtils.getExcelData(4, 3));
			IGB.clickOnLOGIN();
			IGB.clickontransaction();
			IGB.clickgeneratebill();
			IGB.clickOnFY();
			IGB.clickOnScheme();
			IGB.clickOnSubScheme();
			IGB.clickOnHeadCode();
			IGB.BillTypee();
			IGB.ClickOnTypePAN();

			String pannumber = "";
			if (pannumberMap != null && !pannumberMap.get("PANNUMBER").equals(null)
					&& !pannumberMap.get("PANNUMBER").equals("")) {
				pannumber = pannumberMap.get("PANNUMBER").toString();
			} else {
				pannumber = "DPAPS3524D";
			}

			IGB.clickselectPAN(pannumber);
			IGB.clickselectVender();
			//Bill Amount handling 
			
			WebElement totalRemainingBalance = driver.findElement(By.id("body_txtTotalPendingAmount")); 
			String remainBalStr = totalRemainingBalance.getAttribute("value");
			int remainBalInt = Integer.parseInt(remainBalStr);
			remainBalInt= remainBalInt+1;
			System.out.println("******************************************"+remainBalInt);
			IGB.enterbillAmount(String.valueOf(remainBalInt),driver,true);
			
			try {
				IGB.enterbillAmount(remainBalStr, driver,false);
			} catch (StaleElementReferenceException e) {
				IGB.enterbillAmount(remainBalStr, driver,false);
			}
			
			
			IGB.enterdetail(CommonUtils.getExcelData(82, 3));
			IGB.enterremark(CommonUtils.getExcelData(83, 3));
			IGB.fileuploadbillcopy(CommonUtils.getExcelData(84, 3));

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
			IGB.RemarkText(CommonUtils.getExcelData(86, 3));
			IGB.Remarksyes();
			Thread.sleep(5000);
			// login.RemarkNo();

			/////////////////////// IAMaekerLogin BillOutWords For Approval/////////////////////// ///////////////////

			// IGB.clickontransaction();
			IGB.clickontransaction();
			Thread.sleep(3000);
			IGB.BillTransaction(driver);
			Thread.sleep(3000);
			IGB.BillOutWords();

			IGB.viewSlip();

			// IGB.Status();
			Thread.sleep(3000);
			IGB.LogOutIAmaker();
			Thread.sleep(3000);
			IGB.IamakerlogoutYes();

			//////////////////////////////// IAChekerLogin For INBOX Approval//////////////////////////////// ///////////////////////////////////////////

			IGB.IAChekerLogin(CommonUtils.getExcelData(5, 2));
			IGB.IAChekerPassword(CommonUtils.getExcelData(5, 3));
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

			//////////////////////////////// IAChekerLogin For OUTBOX Approval//////////////////////////////// ///////////////////////////////////////////

			IGB.IACtransaction1click();
			IGB.hoverBillTransection1(driver);
			IGB.logoutclick();
			IGB.yeslogoutclick();
		} catch (Exception e) {

			CommonUtils.captureScreenShoot(driver, 1);
			CommonUtils.writeExcel(13, 2, "Failed");

		}

	}

	@Test
	public void Iamakerbillgenration() throws EncryptedDocumentException, IOException {
		Reporter.log("---Runing Test Script-------");
		// String expectedURL = "http://cna.demofms.com/Login.aspx";
		String expectedURL = "http://192.168.0.162:5259/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
			CommonUtils.writeExcel(13, 2, "passed");

//		AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
//		System.out.println(actualURL);

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
