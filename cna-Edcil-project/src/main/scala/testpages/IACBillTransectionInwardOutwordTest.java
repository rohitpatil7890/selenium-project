package testpages;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.IACBillTransectionInwardOutWard;


public class IACBillTransectionInwardOutwordTest extends BaseClass {
	
IACBillTransectionInwardOutWard login;
	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new IACBillTransectionInwardOutWard(driver);

	}

	@BeforeMethod
	public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException

	{
		try {
		login.IACusername(CommonUtils.getExcelData(8, 0));
		login.IACPassword(CommonUtils.getExcelData(8, 1));
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
	}
		catch(Exception e)
		{
			
			CommonUtils.captureScreenShoot(driver, 1); 
			CommonUtils.writeExcel(17, 2, "Failed");	
		}
		

	}
	
	@Test
	public void IACBillTransectionInwardOutWard() throws EncryptedDocumentException, IOException {
		Reporter.log("---Runing Test Script-------");
		//String expectedURL = "http://cna.demofms.com/Login.aspx";
		String expectedURL = "http://192.168.0.162:7777/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
			CommonUtils.writeExcel(17, 2, "passed");
		
		//AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
		System.out.println(actualURL);
		
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
	







