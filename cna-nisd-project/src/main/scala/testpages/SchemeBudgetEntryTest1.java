package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.SchemeBudgetEntryPom1;

public class SchemeBudgetEntryTest1 extends BaseClass {
	SchemeBudgetEntryPom1 login;

	@BeforeClass
	public void openbrowser() throws IOException {
		initializeBrowser();
		login = new SchemeBudgetEntryPom1(driver);
	}


	@Test(priority = 0)
	public void schemeBudgetEntry() throws EncryptedDocumentException, IOException, InterruptedException {
		///////////////////////////////CNA MAKER/////////////////////////////////////////
			login.Username(CommonUtils.getExcelData(2, 2));
			login.Password(CommonUtils.getExcelData(2, 3));
			login.clickOnLOGIN();
			login.clickontransaction();
			login.clickBudgetAssign();
			login.clickonScheme();
			login.clickselectFeYear();
			login.clickonSubScheme();
			login.clickonHeadCode();
			String budgetAmmount = CommonUtils.getExcelData(8, 3);
			String strBudgetAmmount = budgetAmmount.replaceAll("^\"|\"$", "");
			login.clickBudgetAmount(strBudgetAmmount, driver);
			try {
				login.clickBudgetAmount("0", driver);
			} catch (StaleElementReferenceException e) {
				login.clickBudgetAmount("0", driver);
			}
			try {
				login.clickBudgetAmount("2000", driver);
			} catch (StaleElementReferenceException e) {
				login.clickBudgetAmount("2000", driver);
			}
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('body_txtSactionedOrderNo').focus();");
			
			String sanctOrdrAmmount = CommonUtils.generateSanctionNumber();
			//String strsanctOrdrAmmount = sanctOrdrAmmount.replaceAll("^\"|\"$", "");
			
			login.clickSanctionedOrderNumber(sanctOrdrAmmount);
			//login.clickonOrderCopy(CommonUtils.getExcelData(10, 3));
			login.clickonOrderCopy();
			login.clickonok();
			login.clickonSave();
			login.clickonYes();
			login.clickonOok();

			String expectedUrl = "http://192.168.0.162:5259/BudgetAssignment.aspx";
			String actualUrl = driver.getCurrentUrl();
//			if (actualUrl.equals(expectedUrl)) {
//	            CommonUtils.writeExcel(1, 3, "passed");
			Assert.assertEquals(actualUrl, expectedUrl);
			
			// CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 3, "Failed");
		}
	
	
	@Test(priority = 1,dependsOnMethods= {"schemeBudgetEntry"})
	public void cnaMakerApprove() throws InterruptedException {		
			/////////////////////////////// CNA MAKER INBOX/////////////////////////////////////
			login.clickontransaction1();
			login.clickonBudgetApproval(driver);
			login.clickonBudgetInbox();
			login.clickonViewSlip();
			login.clickonApproveSlip();
			login.clickonApproveSlipYes();
			login.clickonApproveSlipOk();
			login.clickonApproveSlipBack();
			//////////////////// CNA MAKER OUTBOX//////////////////////////////
			login.clickontransaction2();
			login.clickonBudgetApproval(driver);
			login.clickonBudgetOutbox();
			login.clickonViewSlip1();
			login.clickonLogOut();
			login.clickonLogOutYes();
			
			String expectedUrl = "http://192.168.0.162:5259/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	
	
	@Test(priority = 2,dependsOnMethods= {"cnaMakerApprove"})
	public void cnaCheckerApprove() throws InterruptedException, EncryptedDocumentException, IOException {
		
			/////////////////// CNA CHECKER LOGIN////////////////////////////////////
			login.Username2(CommonUtils.getExcelData(3, 2));
			login.Password2(CommonUtils.getExcelData(3, 3));
			login.clickOnLOGIN();
			////////////// CNA CHECKER INBOX/////////////////////////////////
			login.clickonTransaction3();
			login.clickonSchemeBudgetApproval1(driver);
			login.clickonSchemeBudgetApprovalInbox();
			login.clickonViewSlip2();
			login.clickonApprove2();
			login.clickonYess();
			login.clickonOOk();
			///////////// CNA CHECKER OUTBOX///////////////////////////////
			login.clickonTransaction4();
			login.clickonSchemeBudgetApproval1(driver);
			login.clickonSchemeBudgetApprovalOutbox();
			login.clickonViewSlip3();
			login.clickonCheckerLogout();
			login.clickonCheckerLogoutYess();
			
			String expectedUrl = "http://192.168.0.162:5259/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
			
			@Test(priority=3,dependsOnMethods= {"cnaCheckerApprove"})
			public void cnaApprover() throws EncryptedDocumentException, InterruptedException, IOException {
		///////////////////////////CNA APPROVER////////////////////
		    login.Username(CommonUtils.getExcelData(6, 2));
		    login.Password(CommonUtils.getExcelData(6, 3));
		    login.clickOnLOGIN();
		    login.clickontransaction();
		    login.clickonSchemeBudgetApproval1(driver);
		    login.clickonSchemeBudgetApprovalInbox();
		    login.clickonViewSlip2();
		    login.clickonApprove2();
		    login.clickonYess();
		    login.clickonOOk();
			login.clickonCheckerLogout();
			login.clickonCheckerLogoutYess();
			
			String expectedUrl = "http://192.168.0.162:5259/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
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