
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
import pom.SchemeBudgetEntryPom2;

public class SchemeBudgetEntryTest2 extends BaseClass {
	SchemeBudgetEntryPom2 login;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		initializeBrowser();
		login = new SchemeBudgetEntryPom2(driver);
	}
	@BeforeMethod
	public void schemeBudgetEntry2() throws EncryptedDocumentException, IOException, InterruptedException
	{	
		////////////CNA MAKER ////////////////////////////////////////////
		try {
			login.Username(CommonUtils.getExcelData(1, 0));
			login.Password(CommonUtils.getExcelData(1, 1));
			login.clickOnLOGIN();
			login.clickontransaction();
			login.clickBudgetAssign();
			login.clickonScheme();
			login.clickselectFeYear();
			login.clickonSubScheme();
			login.clickonHeadCode();
			String budgetAmmount = CommonUtils.getExcelData(206, 1);
			String sanctOrdrAmmount = CommonUtils.getExcelData(207, 1);
			String strBudgetAmmount = budgetAmmount.replaceAll("^\"|\"$", "");
			String strsanctOrdrAmmount = sanctOrdrAmmount.replaceAll("^\"|\"$", "");
			login.clickBudgetAmount(strBudgetAmmount);
		    login.clickSanctionedOrderNumber(strsanctOrdrAmmount);
			//login.clickonOrderCopy();
		    login.clickonOrderCopy(CommonUtils.getExcelData(208, 1));
			login.clickonok();
			login.clickonSave();
			login.clickonYes();
			login.clickonOok();
			/////////////CNA MAKER INBOX/////////////////////////////////////
			login.clickontransaction1();
			login.clickonBudgetApproval(driver);
			login.clickonBudgetInbox();
			login.clickonViewSlip();
			login.clickonApproveSlip();
			login.clickonApproveSlipYes();
			login.clickonApproveSlipOk();
			login.clickonApproveSlipBack();
			////////////////////CNA MAKER OUTBOX//////////////////////////////
			login.clickontransaction2();
			login.clickonBudgetApproval(driver);
			login.clickonBudgetOutbox();
			login.clickonViewSlip1();
			login.clickonLogOut();
			login.clickonLogOutYes();
			///////////////////CNA CHECKER///////////////////////////////////
			login.Username2(CommonUtils.getExcelData(2, 0));
			login.Password2(CommonUtils.getExcelData(2, 1));
			login.clickOnLOGIN();
			//////////////CNA CHECKER INBOX/////////////////////////////////
			login.clickonTransaction3();
			login.clickonSchemeBudgetApproval1(driver);
			login.clickonSchemeBudgetApprovalInbox();
			login.clickonViewSlip2();
			login.clickonApprove2();
			login.clickonYess();
			login.clickonOOk();
			/////////////CNA CHECKER OUTBOX///////////////////////////////
			login.clickonTransaction4();
			login.clickonSchemeBudgetApproval1(driver);
			login.clickonSchemeBudgetApprovalOutbox();
			login.clickonViewSlip3();
			login.clickonCheckerLogout();
			login.clickonCheckerLogoutYess();
	}catch(Exception e)
	{
		
		CommonUtils.captureScreenShoot(driver, 1); 
		CommonUtils.writeExcel(2, 2, "Failed");	
	}
	

}

@Test
public void SchemeBudgetEntryResult2() throws EncryptedDocumentException, IOException {
	Reporter.log("---Runing Test Script-------");
	//String expectedURL = "http://cna.demofms.com/Login.aspx";
	String expectedURL = "http://192.168.0.162:3364/Login.aspx";
	String actualURL = driver.getCurrentUrl();
	if (actualURL.equals(expectedURL))
		CommonUtils.writeExcel(2, 2, "passed");
	
	//AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
	System.out.println(actualURL);
	
	}
	@AfterMethod
	public void ApplicationClose() {
		Reporter.log("-----Close Application-----");
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}
}


