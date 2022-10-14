package testpages;

import java.io.IOException;
import java.util.Random;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.IACBillTransectionInwardOutWard;

public class GenerateBillApprovalByIACheckerTypeWorkTest extends BaseClass {

	IACBillTransectionInwardOutWard login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new IACBillTransectionInwardOutWard(driver);

	}

	@Test(priority = 0)
	public void billApproveByIACheckerTypeWork() throws Exception {
		try {
			login.IACusername(CommonUtils.getExcelData(5, 2));
			login.IACPassword(CommonUtils.getExcelData(5, 3));
			login.IACLOGINclick();
			login.IACtransaction();
			login.hoverBillTransection(driver);
			login.BillInwardsclick();
			login.showrecordclick();
			login.inwerdslipclick();
			login.approveslipclick();
			login.remarksend();
			login.remarkyesclick();
			login.IACtransaction1click();
			login.hoverBillTransection1(driver);
			login.BillOutwordsclick();
			login.showrecordclick1();
			login.outwordslipclick();
			login.logoutclick();
			login.yeslogoutclick();
			String expectedUrl = "http://192.168.0.162:7777/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);

		} catch (Exception e) {
			e.printStackTrace();
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
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

	public String generateAccountNumber() {
		Random r = new Random();
		long numbers = 1000L + (long) (r.nextDouble() * 9999L);
		String accountnumber = Long.toString(numbers);
		System.out.println(accountnumber);
		return accountnumber;

		// driver.Close();

	}

}
