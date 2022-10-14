package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.IAMGenerateBillTypeWorkHeadcode2;


public class IAMGenerateBillTypeWorkHeadcode2Test extends BaseClass {
	
	 IAMGenerateBillTypeWorkHeadcode2 login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new  IAMGenerateBillTypeWorkHeadcode2(driver);

	}

	@BeforeMethod
	public void AplicationLogin() throws Exception {
		try {
		login.Username(CommonUtils.getExcelData(3, 0));
		login.Password(CommonUtils.getExcelData(3, 1));
		login.clickOnLOGIN();
		login.clicktransection();
		login.ClickGeneratebill();
		login.clickselectFeYear();
		Thread.sleep(2000);
		login.clicksubscheme1();
		Thread.sleep(2000);
		login.clickselectHeCode2();
		Thread.sleep(1000);
		login.clickselectBillType();
		Thread.sleep(2000);
		
		String pannumber = "";
		if (!pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
			pannumber = pannumberMap.get("PANNUMBER").toString();
		} else {
			pannumber = CommonUtils.getExcelData(57, 1);
		}
		login.Pannoenter(pannumber);
		
		
		login.sideclick();
		login.selectvendornameclick();
		Thread.sleep(1000);
		login.AAnumberclick();
		Thread.sleep(2000);
		login.WorkOrderNoclick();
		Thread.sleep(2000);
		login.Billamountclick();
		Thread.sleep(1000);
		login.Remarksend();
		Thread.sleep(1000);
		login.UploadcopySend();
		Thread.sleep(2000);
		login.okclick();
		Thread.sleep(2000);
		login.educationcesssend();
		Thread.sleep(2000);
		login.secondoryesssend();
		Thread.sleep(1000);
//		login.SecurityDepositsend();
//		Thread.sleep(1000);
//		login.StampDutysend(); 
//		Thread.sleep(1000);
		login.clickOnSave();
		Thread.sleep(2000);
		login.clickOnSaveYes();
		Thread.sleep(2000);
		login.Succesclick();
		
		login.viewSlip();
		Thread.sleep(2000);
		
		login.Approve();
		Thread.sleep(2000);
		
		login.RemarkText(CommonUtils.getExcelData(59,1));
		Thread.sleep(2000);
		login.Remarksyes();
		Thread.sleep(2000);
		login.Back();
		Thread.sleep(3000);
		login.clickontransaction();
		Thread.sleep(2000);
		login.BillTransaction(driver);
		Thread.sleep(2000);
		login.BillOutWords();
		Thread.sleep(2000);
		login.recordclick();
		login.outwardslipview();
		login.LogOutIAmaker();
		login.IamakerlogoutYes();

	}
	catch(Exception e)
	{
		
		CommonUtils.captureScreenShoot(driver, 1); 
		CommonUtils.writeExcel(18, 3, "Failed");	
	}
	

}

@Test
public void IAMGenerateBillTypeWorkHeadcode2() throws EncryptedDocumentException, IOException {
	Reporter.log("---Runing Test Script-------");
	//String expectedURL = "http://cna.demofms.com/Login.aspx";
	String expectedURL = "http://192.168.0.162:3364/Login.aspx";
	String actualURL = driver.getCurrentUrl();
	if (actualURL.equals(expectedURL))
		CommonUtils.writeExcel(18, 2, "passed");
	
	AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
	System.out.println(actualURL);
	

	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();

//driver.Close();

	}
}
