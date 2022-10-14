package testpages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.LimitTransferToIAPom1;

public class LimitTransferToIATest1 extends BaseClass {
	LimitTransferToIAPom1 login;

	@BeforeClass
	public void openbrowser() throws IOException {
		initializeBrowser();
		login = new LimitTransferToIAPom1(driver);
	}

	@Test(priority = 0)
	public void limitTransferToIA() throws Exception {
	    /////////////// CNA MAKER////////////////////////////////////////
	
	        login.Username(CommonUtils.getExcelData(2, 2));
	        login.Password(CommonUtils.getExcelData(2, 3));
	        login.clickOnLOGIN();
	        login.clickontransaction();
	        login.clickonLimitTransfer();
	        login.ClickOnSchemeName();
	        login.ClickOnSubScheme();
	        login.ClickOnfinancialYear();
	        login.ClickonHeadCode();
	        login.ClickOnSearchIA(CommonUtils.getExcelData(19, 3));
	        login.ClickOnSideClick();
	        WebElement limitAllAmt = driver.findElement(By.id("body_txtreamingbudgetamount"));
	        String limitAmtString = limitAllAmt.getAttribute("value");
	        int limitamout = Integer.parseInt(limitAmtString);
	        limitamout= limitamout+1;
	        System.out.println("******************************************"+limitAmtString);
	        Boolean isvalidLimit = false;
	        login.ClickOnLimitAllocated(String.valueOf(limitamout), driver,true);
	       try {
	            login.ClickOnLimitAllocated("0", driver,true);
	        } catch (StaleElementReferenceException e) {
	            login.ClickOnLimitAllocated("0", driver,true);
	        }
	        try {
	        	
	            login.ClickOnLimitAllocated(CommonUtils.getExcelData(20, 3), driver,false);
	        } catch (StaleElementReferenceException e) {
	            login.ClickOnLimitAllocated(CommonUtils.getExcelData(20, 3), driver,false);
	        }
	        login.ClickOnIALimit(CommonUtils.getExcelData(21, 3));
	        login.clickonDetails(CommonUtils.getExcelData(22,3));
	        login.clickonRemarks(CommonUtils.getExcelData(23,3));
	        Random rand = new Random();
	        int rand_int1 = rand.nextInt(2000);
	        String s = Integer.toString(rand_int1);
	        login.ClickOnSanctionedOrderNumber(s);
	        login.clickonUploadDocuments(CommonUtils.getExcelData(25, 3));
	        login.clickonFileUploadOk();
	        login.clickonSave();
	        login.clickonSaveYes();
	        login.clickonSaveYesok();
			String expectedUrl = "http://192.168.0.162:8018/DmaBudgetTransfer.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	

	@Test(priority = 1,dependsOnMethods= {"limitTransferToIA"})
	public void approveLimitByCNAMaker() throws Exception {
			///////////////////////////// CNA MAKER INBOX////////////////////////////
			login.clickontransaction1();
	        login.clickonLimitApproval(driver);
	        login.clickonLimitInbox();
	        login.clickonViewSlip();
	        login.clickonApproveSlip();
	        login.clickonApproveSlipYes();
	        login.clickonApproveSlipOk();
	        login.clickonApproveSlipBack();
	        /////////////////// CNA MAKER OUTBOX/////////////////////////
	        login.clickontransaction2();
	        login.clickonLimitApproval2(driver);
	        login.clickonLimitOutbox();
	        login.clickonViewSlip1();
	        login.clickonLogOut();
	        login.clickonLogOutYes();
			
			String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	@Test(priority = 2,dependsOnMethods= {"approveLimitByCNAMaker"})
	public void approveLimitByCNAChecker() throws Exception {

			///////////////////////// CNA CHECKER INBOX////////////////////////////////////////////////////////
			login.Username2(CommonUtils.getExcelData(3,2));
	        login.Password2(CommonUtils.getExcelData(3,3));
	        login.clickOnLOGIN();
	        login.clickonTransaction3();
	        login.clickonLimitApproval3(driver);
	        login.clickonLimitApprovalInbox();
	        login.clickonViewSlip2();
	        login.clickonApprove2();
	        login.clickonYess();
	      //  login.clickonOOk();
	/////////////////////////////CNA CHECKER OUTBOX//////////////////////////////////////////////////
	        login.clickonTransaction4();
	        login.clickonLimitApproval4(driver);
	        login.clickonLimitApprovalOutbox();
	        login.clickonViewSlip3();
	        login.clickonCheckerLogout();
	        login.clickonCheckerLogoutYess();
	        
	        String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
	}
			
			@Test(priority = 3,dependsOnMethods= {"approveLimitByCNAChecker"})
			public void approvelimitByCNAApprover() throws Exception {
        /////////////////////////CNA APPROVER//////////////////////////////////////////
    login.Username(CommonUtils.getExcelData(7, 2));
    login.Password(CommonUtils.getExcelData(7, 3));
    login.clickOnLOGIN();
    login.clickontransaction();
    login.clickonLimitApproval3(driver);
    login.clickonLimitApprovalInbox();
    login.clickonViewSlip2();
    login.clickonApprove2();
    login.clickonYess();
    login.clickonOOk();
    login.clickonCheckerLogout();
    login.clickonCheckerLogoutYess();
			
			String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);

			// CommonUtils.captureScreenShoot(driver, 1);
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

	public String handleLimitValueForBVA(String budgetAmount, WebDriver driver) {
		return budgetAmount;

	}

}


























