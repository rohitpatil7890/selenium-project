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
	public void iaCreationByCNAMaker() throws EncryptedDocumentException, IOException, InterruptedException

	{
		
			login.Username(CommonUtils.getExcelData(2, 2));

			login.Password(CommonUtils.getExcelData(2, 3));

			login.clickOnLOGIN();

			login.clicksetup();

			login.clickIacreation();
			Thread.sleep(1000);

			login.enterIaname(CommonUtils.getExcelData(13, 3));
			Thread.sleep(1000);

			login.enterIfsc(CommonUtils.getExcelData(14, 3));
			Thread.sleep(1000);

			String accNum = CommonUtils.generateAccountNumber(null);
			login.enterbankaccountno(accNum);
			Thread.sleep(1000);

			// login.enterconfirmaccountno(CommonUtils.getExcelData(282, 1));
			login.enterconfirmaccountno(accNum);
			Thread.sleep(1000);

			login.clicksubmit();
			Thread.sleep(1000);

			login.clickyes();
			Thread.sleep(5000);
			login.clickok();
			Thread.sleep(1000);

			login.clicklogout();

			login.clickyeslogout();

			String expectedUrl = "http://192.168.0.162:3364/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		
	}

	@Test(priority = 1,dependsOnMethods={"iaCreationByCNAMaker"})
	public void IAApproveByCNAChecker() throws EncryptedDocumentException, IOException, InterruptedException

	{
			login.Username1(CommonUtils.getExcelData(3, 2));
			login.Password1(CommonUtils.getExcelData(3, 3));
			login.clickOnLOGIN1();
			Thread.sleep(1000);
			login.clicksetup();
			login.clickIaapproval();
			Thread.sleep(1000);
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			Thread.sleep(1000);
			login.clickbtnapprove();
			Thread.sleep(4000);
			login.clickokapprove();
			Thread.sleep(1000);
			login.clicksucces();
			Thread.sleep(1000);
			login.clicklogout1();
			Thread.sleep(1000);
			login.clickyeslogout1();
			Thread.sleep(1000);
			String expectedUrl = "http://192.168.0.162:3364/Login.aspx";
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

		// driver.Close();

	}

}
