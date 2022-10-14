package testpages;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.IACheckerInboxOutboxPom;

/**
 * 
 *AA Approve by IA Checker.
 *@version 1.0
 *
 */

public class AAprovalByIACheckerTest extends BaseClass{
	
IACheckerInboxOutboxPom login;
	@BeforeClass
	public void openbrowser() throws IOException, InterruptedException

	{
		initializeBrowser();

		login = new IACheckerInboxOutboxPom(driver);

	}
	
	@Test(priority = 0)
	public void aaApproveByIAChecker() throws EncryptedDocumentException, IOException, InterruptedException {
		try {
	
		login.IACusername(CommonUtils.getExcelData(5, 2));
		login.IACPassword(CommonUtils.getExcelData(5, 3));
		login.IACLOGINclick();
		login.IACtransaction();
		login.hoverAAfileapprovelIAC(driver);
		login.AAfileinboxclick();
		login.showrecordclick();
		login.inboxslipclick();
		login.approveslipclick();
		login.remarksend();
		login.remarkyesclick();
		login.okclick();
		login.againtransactionclick();
		login.hoverAAfileapprovelrepeat(driver);
		login.AAfileoutboxclick();
		login.showrecordclick1();
		login.outboxslipview();
		login.logoutclick();
		login.yeslogoutclick();
		String expectedUrl = "http://192.168.0.162:3364/Login.aspx";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	} catch (Exception e) {
		e.printStackTrace();
		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");
	}
}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	
	}
		public String generateAccountNumber() 
		{
            Random r = new Random();
            long numbers = 1000L + (long) (r.nextDouble() * 9999L);
            String accountnumber = Long.toString(numbers);
            System.out.println(accountnumber);
            return accountnumber;

		// driver.Close();

	}
		
}
	




