package testpages;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.CNALimitRecallPom;

public class CNALimitRecallTest extends BaseClass {
	
	CNALimitRecallPom login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new CNALimitRecallPom(driver);

	}

	@Test(priority = 0)
	public void LimitRecall() throws EncryptedDocumentException, IOException, InterruptedException

	{
		login.Username(CommonUtils.getExcelData(2, 2));
		login.Password(CommonUtils.getExcelData(2, 3));
		login.clickOnLOGIN();
		login.clickontransaction();
		login.clickonlimitrecall();
		login.clickonIagencyname();
		login.clickonsubscheme();
		login.clickonHeadCode();
		login.clickWithDrawAmount(CommonUtils.getExcelData(28, 3));
		login.clickremark(CommonUtils.getExcelData(29, 3));	
		login.Clickuploadfile(CommonUtils.getExcelData(30, 3));
		login.clickonok();
		login.clickonSave();
		login.clickonYes();
		login.clickonOok();
		
		String expectedUrl = "http://192.168.0.162:7777/UnspentBalance.aspx";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	
		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");
	}
		
		@Test(priority = 1,dependsOnMethods= {"LimitRecall"})
		public void LimitRecallMaker() throws EncryptedDocumentException, IOException, InterruptedException{

		login.clickontransaction();
		login.clickonlimitrcllApproval(driver);
		login.clickonlimitreclInbox();
		login.clickonViewSlip();
		login.clickonApproveSlip();
		login.clickonApproveSlipYes();
		login.clickonApproveSlipOk();
		login.clickontransaction2();
		login.clickonlimitrcllApproval2(driver);
		login.clickonlimitrecloutbox();
		login.clickonViewSlip();
		login.logoutclick();
		login.yeslogoutclick();
		String expectedUrl = "http://192.168.0.162:7777/Login.aspx";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");
		
		}
		
		@Test(priority =  2,dependsOnMethods= {"LimitRecallMaker"})
        public void limitRecallChecker() throws EncryptedDocumentException, IOException, InterruptedException {
			
        login.Username(CommonUtils.getExcelData(3, 2));
		login.Password(CommonUtils.getExcelData(3, 3));
		login.clickOnLOGIN();
		login.clickontransaction();	
		login.clickonlimitrcllApproval(driver);
		login.clickonlimitreclInbox();
		login.clickonViewSlip();
		login.clickonApproveSlip();
		login.clickonApproveSlipYes();
		login.clickonApproveSlipOk();
		login.clickontransaction2();
		login.clickonlimitrcllApproval2(driver);
		login.clickonlimitrecloutbox();
		login.clickonViewSlip();
		login.logoutclick();
		login.yeslogoutclick();
		String expectedUrl1 = "http://192.168.0.162:7777/Login.aspx";
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1);
		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");

	}

	@AfterMethod
	public void ApplicationClose() {

		Reporter.log("-----Close Application-----");

		

	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();

		

	}
}

