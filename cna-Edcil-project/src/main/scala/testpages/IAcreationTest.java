package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.IAcreationPom;

public class IAcreationTest extends BaseClass {

	IAcreationPom login;

	@BeforeClass
	public void openbrowser() throws Exception
	{
		initializeBrowser();
		login = new IAcreationPom(driver);
	}
	@Test(priority = 0)
	public void iaCreationByCNAMaker() throws EncryptedDocumentException, IOException, InterruptedException{
		////////////////////////CNA MAKER//////////////////////////
			login.Username(CommonUtils.getExcelData(2, 2));
			login.Password(CommonUtils.getExcelData(2, 3));
			login.clickOnLOGIN();
			login.clicksetup();
			login.clickIacreation();
			login.enterIaname(CommonUtils.getExcelData(13, 3));
			login.enterIfsc(CommonUtils.getExcelData(14, 3));
			String accNum = CommonUtils.generateAccountNumber(null);
			login.enterbankaccountno(accNum);
			// login.enterconfirmaccountno(CommonUtils.getExcelData(282, 1));
			login.enterconfirmaccountno(accNum);
			login.clicksubmit();
			login.clickyes();
			login.clickok();
			login.clicklogout();
			login.clickyeslogout();
			String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	@Test(priority = 1,dependsOnMethods= {"iaCreationByCNAMaker"})
	public void IAApproveByCNAChecker() throws EncryptedDocumentException, IOException, InterruptedException
	{
		////////////////////////CNA MAKER APPROVAL
			login.Username1(CommonUtils.getExcelData(3, 2));
			login.Password1(CommonUtils.getExcelData(3, 3));
			login.clickOnLOGIN1();
			login.clicksetup();
			login.clickIaapproval();
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			login.clickbtnapprove();
			login.clickokapprove();
			login.clicksucces();
			login.clicklogout1();
			login.clickyeslogout1();
			String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	@AfterMethod
	public void ApplicationClose() {
		Reporter.log("-----Close Application-----");
		// dashboard.clickLogout();
	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();

	}

}
