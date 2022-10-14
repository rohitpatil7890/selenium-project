package testpages;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
	public void LimitReclLogin() throws EncryptedDocumentException, IOException, InterruptedException

	{
		login.Username(CommonUtils.getExcelData(2, 2));

		login.Password(CommonUtils.getExcelData(2, 3));
		Thread.sleep(500);

		login.clickOnLOGIN();
		Thread.sleep(500);

		login.clickontransaction();
		Thread.sleep(1000);

		login.clickonlimitrecall();
		Thread.sleep(1000);
		login.clickonIagencyname();
		Thread.sleep(1000);

		login.clickonsubscheme();
		Thread.sleep(1000);

		login.clickonHeadCode();
		Thread.sleep(1000);

		login.clickWithDrawAmount(CommonUtils.getExcelData(28, 3));
		Thread.sleep(1500);

		login.clickremark(CommonUtils.getExcelData(29, 3));
		Thread.sleep(1500);

		login.Clickuploadfile(CommonUtils.getExcelData(30, 3));
		Thread.sleep(1500);

		Thread.sleep(2000);


		login.clickonok();
		Thread.sleep(2000);

		login.clickonSave();
		Thread.sleep(2000);

		login.clickonYes();
		Thread.sleep(2000);

		login.clickonOok();
		Thread.sleep(1500);
		

	}	
	@Test(priority = 1, dependsOnMethods = {"LimitReclLogin"})

	public void aaApproveByCNAMaker()throws EncryptedDocumentException, IOException, InterruptedException {


		login.clickontransaction();
		Thread.sleep(1000);

		login.clickonlimitrcllApproval(driver);
		Thread.sleep(1000);

		login.clickonlimitreclInbox();
		Thread.sleep(1000);

		login.clickonViewSlip();
		Thread.sleep(2000);

		login.clickonApproveSlip();
		Thread.sleep(2000);

		login.clickonApproveSlipYes();
		Thread.sleep(5000);

		login.clickonApproveSlipOk();
		Thread.sleep(2000);

		login.clickontransactionchek();
		Thread.sleep(1000);

		login.clickonlimitrcllApproval2(driver);
		Thread.sleep(1000);

		login.clickonlimitrecloutbox();
		Thread.sleep(1000);

		login.clickonViewSlip();

		login.logoutclick();
		Thread.sleep(1000);
		login.yeslogoutclick();

		String expectedURL = "http://192.168.0.162:8018/Login.aspx";

		String actualURL = driver.getCurrentUrl();// CommanUtils.getExcelData(0, 2);
		if (actualURL.equals(expectedURL))
			System.out.println(expectedURL);
	}


	@Test(priority = 2,dependsOnMethods = { "aaApproveByCNAMaker" })
	public void aaApproveByCNAchecker() throws EncryptedDocumentException, IOException, InterruptedException {

//
//	public void aaApproveByCNAchecker() throws EncryptedDocumentException, IOException, InterruptedException {
		login.Username(CommonUtils.getExcelData(3, 2));

		login.Password(CommonUtils.getExcelData(3, 3));
		Thread.sleep(500);

		login.clickOnLOGIN();
		Thread.sleep(500);

		login.clickontransaction();
		Thread.sleep(1000);

		login.clickonlimitrcllApproval(driver);
		Thread.sleep(1000);

		login.clickonlimitreclInbox();
		Thread.sleep(2000);

		login.clickonViewSlip();
		Thread.sleep(1500);

		login.clickonApproveSlip();
		Thread.sleep(2000);

		login.clickonApproveSlipYes();
		Thread.sleep(20000);
		
//		login.clickonApproveSlipOk();
//		Thread.sleep(2000);

		login.clickontransactionchek();
		Thread.sleep(4000);

		login.clickonlimitrcllApproval2(driver);
		Thread.sleep(1000);

		login.clickonlimitrecloutbox();
		Thread.sleep(1000);

		login.clickonViewSlip();

		login.logoutclick();
		Thread.sleep(1000);
		login.yeslogoutclick();

		String expectedURL = "http://192.168.0.162:8018/Login.aspx";

		String actualURL = driver.getCurrentUrl();// CommanUtils.getExcelData(0, 2);
		if (actualURL.equals(expectedURL))
			System.out.println(expectedURL);

	}

	@Test(priority = 3,dependsOnMethods = { "aaApproveByCNAchecker" })
	public void aaApproveByCNAApprover() throws EncryptedDocumentException, IOException, InterruptedException {

		login.Username(CommonUtils.getExcelData(7, 2));
		login.Password(CommonUtils.getExcelData(7, 3));
		Thread.sleep(1000);

		login.clickOnLOGIN();
		Thread.sleep(1000);

		login.clickontransaction();
		Thread.sleep(1000);

		login.clickonlimitrcllApproval(driver);
		Thread.sleep(1000);

		login.clickonlimitreclInbox();
		Thread.sleep(1000);

		login.clickonViewSlip();
		Thread.sleep(1000);

		login.clickonApproveSlip();
		Thread.sleep(1000);

		login.clickonApproveSlipYes();
		Thread.sleep(5000);
		
		login.clickonApproveSlipOk();
		Thread.sleep(2000);

		login.clickontransactionchek();
		Thread.sleep(4000);

		login.clickonlimitrcllApproval2(driver);
		Thread.sleep(1000);

		login.clickonlimitrecloutbox();
		Thread.sleep(1000);

		login.clickonViewSlip();

		login.logoutclick();
		Thread.sleep(1000);
		login.yeslogoutclick();


		String expectedURL = "http://192.168.0.162:8018/Login.aspx";

		String actualURL = driver.getCurrentUrl();// CommanUtils.getExcelData(0, 2);
		if (actualURL.equals(expectedURL))
			System.out.println(expectedURL);

	}


	@AfterMethod
	public void ApplicationClose() {

		Reporter.log("-----Close Application-----");

		// dashboard.clickLogout();

	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(15000);
		driver.quit();

		// driver.Close();

	}
}







