package testpages;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

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
import pom.IAMAdministrativeApprovalCreationPom;

public class AdministrativeApprovalCreationTest extends BaseClass {
	IAMAdministrativeApprovalCreationPom login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new IAMAdministrativeApprovalCreationPom(driver);

	}

	@Test(priority = 0)
	public void aaCreation() throws EncryptedDocumentException, IOException, InterruptedException {


		login.Username(CommonUtils.getExcelData(4, 2));
		login.Password(CommonUtils.getExcelData(4, 3));
		login.clickOnLOGIN();
		login.clickontransaction();
		login.hoverAAfiledetail(driver);
		login.AAcreationclick();
		login.schemeselect();
		login.headcodesend();
		login.headcodesideclick();
		login.SNheadcodeclick();
		login.financialyear();
		login.workname(CommonUtils.getExcelData(62, 3));
		login.GDdatesselect();
		login.GDdateselect();
		login.GDnumberenter(CommonUtils.getExcelData(63, 3));
		login.approvaldatesselect();
		login.approvaldateselect();
		String generateNum = generateAccountNumber(mapAANumber);


		login.AAnoenter(generateNum);

		//AA Ammount BVA

		/*
		 * String budgetAmmount = CommonUtils.getExcelData(8, 3); String
		 * strBudgetAmmount = budgetAmmount.replaceAll("^\"|\"$", "");
		 * login.AAamountenter(strBudgetAmmount, driver);
		 */
		try {
			login.AAamountenter("0", driver);
		} catch (StaleElementReferenceException e) {
			login.AAamountenter("0", driver);
		}
		try {
			login.AAamountenter("2000", driver);
		} catch (StaleElementReferenceException e) {
			login.AAamountenter("2000", driver);
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('body_txtPramaTotal').focus();");

		//login.AAamountenter(CommonUtils.getExcelData(65, 3));


		login.AAcopyupload(CommonUtils.getExcelData(66, 3));
		login.popupclick();
		login.saveclick();
		login.alertclick();
		login.successclick();

		String expectedUrl = "http://192.168.0.162:8018/adminapprovalno.ASPX";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		if (actualUrl.equals(expectedUrl))
			System.out.println(actualUrl);


		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");

	}

	@Test(priority = 1, dependsOnMethods = { "aaCreation" })
	public void aaApproveByIAMaker() throws EncryptedDocumentException, IOException, InterruptedException {

		login.clickontransaction();
		login.hoverAAfileapprovel1(driver);
		login.AAfileinboxclick();

		login.searchAANumberInbox(mapAANumber);
		login.inboxslipview();
		login.approveslipclick();
		login.remarksend();
		login.remarkyesclick();
		login.okclick();
		login.againtransactionclick();
		login.hoverAAfileapprovelrepeat(driver);
		login.AAfileoutboxclick();

		login.searchAANumberoutbox(mapAANumber);
		login.showrecordclick();
		login.outboxslipview();
		login.logoutclick();
		login.yeslogoutclick();
		String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		if (actualUrl.equals(expectedUrl))
			System.out.println(actualUrl);

		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");

	}

	@Test(priority = 2,dependsOnMethods = { "aaApproveByIAMaker" })
	public void aaApproveByIAchecker() throws EncryptedDocumentException, IOException, InterruptedException {


		login.Username(CommonUtils.getExcelData(5, 2));
		login.Password(CommonUtils.getExcelData(5, 3));
		login.clickOnLOGIN();
		login.clickontransaction();
		login.hoverAAfileapprovel1(driver);
		login.AAfileinboxclick();
		login.searchAANumberInbox(mapAANumber);
		//login.showrecordclick();
		login.inboxslipview();
		Thread.sleep(3000);
		login.approveslipclick();
		login.remarksend();
		login.remarkyesclick();
		login.okclick();
		login.againtransactionclick();
		login.hoverAAfileapprovel1(driver);
		login.AAfileoutboxclick1();
		login.searchAANumberoutbox(mapAANumber);
		login.showrecordclick();
		login.outboxslipview();
		login.logoutclick();
		login.yeslogoutclick();
		String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(expectedUrl))
			Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println(actualUrl);


		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");

	}



	//????/////////////////IAAPPROVER//////////////
	@Test(priority = 3,dependsOnMethods = {"aaApproveByIAchecker"})
	public void IaApprover() throws EncryptedDocumentException, IOException, InterruptedException{

		login.Username(CommonUtils.getExcelData(6, 2));
		login.Password(CommonUtils.getExcelData(6, 3));
		login.clickOnLOGIN();
		login.clickontransaction();
		login.hoverAAfileapprovel1(driver);
		login.AAfileinboxclick();
		login.searchAANumberInbox(mapAANumber);
		//			login.showrecordclick();
		login.inboxslipview();
		login.approveslipclick();
		login.remarksend();
		login.remarkyesclick();
		login.okclick();
		login.againtransactionclick();
		login.hoverAAfileapprovel1(driver);
		login.AAfileoutboxclick1();
		login.searchAANumberoutbox(mapAANumber);
		//			login.showrecordclick1();
		login.outboxslipview();
		login.logoutclick();
		login.yeslogoutclick();

		String expectedURL = "http://192.168.0.162:8018/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
			//CommonUtils.writeExcel(6, 2, "passed");
			//AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
			System.out.println(actualURL);
		//			driver.quit();
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




	public String generateAccountNumber(Map<String, String> mapAANumber) {
		Random r = new Random();
		long numbers = 1000L + (long) (r.nextDouble() * 9999L);
		String accountnumber = Long.toString(numbers);
		System.out.println(accountnumber);
		mapAANumber.put("aaNumber", accountnumber);
		return accountnumber;






	}

}
