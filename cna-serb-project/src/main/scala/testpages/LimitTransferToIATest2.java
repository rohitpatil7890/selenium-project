package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.LimitTransferToIAPom2;



public class LimitTransferToIATest2 extends BaseClass {
	LimitTransferToIAPom2 login;

	@BeforeClass
	public void openbrowser() throws IOException
	{
		initializeBrowser();
		login = new LimitTransferToIAPom2(driver);
	}

	@BeforeMethod
	public void AplicationLogin() throws Exception
	{
		///////////////CNA MAKER/////////////////////////////////////////
		try {
		login.Username(CommonUtils.getExcelData(1, 0));
		login.Password(CommonUtils.getExcelData(1, 1));
		login.clickOnLOGIN();
		login.clickontransaction();
		login.clickonLimitTransfer();
		login.ClickOnSchemeName();
		login.ClickOnSubScheme();
		login.ClickOnfinancialYear();
		login.ClickonHeadCode();
		login.ClickOnSearchIA(CommonUtils.getExcelData(216, 1));
		login.ClickOnSideClick();
		login.ClickOnLimitAllocated(CommonUtils.getExcelData(217, 1));
		login.ClickOnIALimit(CommonUtils.getExcelData(218, 1));
		login.clickonDetails(CommonUtils.getExcelData(219, 1));
		login.clickonRemarks(CommonUtils.getExcelData(220, 1));
		login.ClickOnSanctionedOrderNumber(CommonUtils.getExcelData(221, 1));
		login.clickonUploadDocuments(CommonUtils.getExcelData(222, 1));    
		login.clickonFileUploadOk();
		login.clickonSave();
		login.clickonSaveYes();
		login.clickonSaveYesok();
	///////////////CNA MAKER INBOX/////////////////////
		login.clickontransaction1();
		login.clickonLimitApproval(driver);
		login.clickonLimitInbox();
		login.clickonViewSlip();
		login.clickonApproveSlip();
		login.clickonApproveSlipYes();
		login.clickonApproveSlipOk();
		login.clickonApproveSlipBack();
	///////////////////CNA MAKER OUTBOX/////////////////////////
		login.clickontransaction2();
		login.clickonLimitApproval2(driver);
		login.clickonLimitOutbox();
		login.clickonViewSlip1();
		login.clickonLogOut();
		login.clickonLogOutYes();
/////////////////////////CNA CHECKER INBOX////////////////////////////////////////////////////////		
		login.Username2(CommonUtils.getExcelData(2, 0));
		login.Password2(CommonUtils.getExcelData(2, 1));
		login.clickOnLOGIN();
		login.clickonTransaction3();
		login.clickonLimitApproval3(driver);
		login.clickonLimitApprovalInbox();
		login.clickonViewSlip2();
		login.clickonApprove2();
		login.clickonYess();
		login.clickonOOk();
/////////////////////////////CNA CHECKER OUTBOX/////////////////////////////////////////////////////////////////////			
		login.clickonTransaction4();
		login.clickonLimitApproval4(driver);
		login.clickonLimitApprovalOutbox();
		login.clickonViewSlip3();
		login.clickonCheckerLogout();
		login.clickonCheckerLogoutYess();
	}catch(Exception e)
	{
		
		CommonUtils.captureScreenShoot(driver, 1); 
		CommonUtils.writeExcel(5, 2, "Failed");	
	}
	

}

@Test
public void TransferLimitTOiaHeadCode2() throws EncryptedDocumentException, IOException {
	Reporter.log("---Runing Test Script-------");
	//String expectedURL = "http://cna.demofms.com/Login.aspx";
	String expectedURL = "http://192.168.0.162:3364/Login.aspx";
	String actualURL = driver.getCurrentUrl();
	if (actualURL.equals(expectedURL))
		CommonUtils.writeExcel(5, 2, "passed");
	
	//AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
	//System.out.println(actualURL);
	
	}
	
	

	@AfterMethod
	public void ApplicationClose() {
		Reporter.log("-----Close Application-----");
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
	//	driver.quit();
	}

	
	
	


}



