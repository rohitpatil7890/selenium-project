package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.WorkCreationHeadCode2;

public class WorkCreationHeadCode2Test extends BaseClass {
	WorkCreationHeadCode2 login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new WorkCreationHeadCode2(driver);

	}

	@BeforeMethod
	public void AplicationLogin() throws Exception
	{
		try {
		login.Username(CommonUtils.getExcelData(6, 0));

		login.Password(CommonUtils.getExcelData(6, 1));
		login.clickOnLOGIN();
		login.clickOnTransaction();
		login.clickonProjectDetails(driver);
		login.clickOnProjectDetailsCreation();
		login.clickonCashBook();
		login.clickOnScheme(CommonUtils.getExcelData(228, 1));
		login.clickOnSide();
		login.clickOnHeadCode();
		login.clickonAdminApprovalNumber();
		login.clickOnPANno();
		String pannumber = "";
		if (!pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
			pannumber = pannumberMap.get("PANNUMBER").toString();
		} else {
			pannumber = CommonUtils.getExcelData(229, 1);
		}
		
		login.FillPanNumber(pannumber);
	   // login.FillPanNumber(FillPanNumber(5));
		login.EnterContractorName(CommonUtils.getExcelData(230, 1));
		login.EnterWorkName(CommonUtils.getExcelData(231, 1));
		login.EnterWorkOrderNo(CommonUtils.getExcelData(232, 2));
		login.SelectRANumber();
		login.clickOnOrderDate();
		login.clickOnOrderDateSelect();
		login.clickOnEndOrderDate();
		login.clickOnEndOrderDateSelect();
		login.EnterTendorAmount(CommonUtils.getExcelData(233, 1));
		login.EnterTotalPaidAmount(CommonUtils.getExcelData(234, 1));
		login.EnterTotalPendingAmount();
		login.clickonOrderCopy(driver);
		login.clickOnOk();
		login.clickOnSave();
		login.clickOnSaveYes();
		login.ClickOnSaveYesok();
		////////////Project Transaction////////////
		login.clickOnTransaction1();
		login.clickonProjectTransactions(driver);   
		login.clickOnProjectInward();
		login.clickOnViewSlip();
		login.clickOnApproveSlip();
		login.clickOnApproveSlipYes();
		login.clickOnApproveSlipYesOk();
		///////Outward/////////
		login.clickOnTransaction2();
		login.clickonProjectTransactions1(driver);
		login.clickOnProjectOutward();
		login.clickOnViewSlip2(); 
		login.clickOnLogOut();
	}
		catch(Exception e)
		{
			
			CommonUtils.captureScreenShoot(driver, 1); 
			CommonUtils.writeExcel(14, 3, "Failed");	
		}
		

	}
	
	@Test
	public void WorkCreationHeadCode2() throws EncryptedDocumentException, IOException {
		Reporter.log("---Runing Test Script-------");
		//String expectedURL = "http://cna.demofms.com/Login.aspx";
		String expectedURL = "http://192.168.0.162:5230/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
			CommonUtils.writeExcel(14, 2, "passed");
		
		AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
		System.out.println(actualURL);
		
	}

	@AfterMethod
	public void ApplicationClose() {

		Reporter.log("-----Close Application-----");

//dashboard.clickLogout();

	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();



	}
	
	
	
	
	
	

	
//	String FillPanNumber(int len) {
//        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        SecureRandom rnd = new SecureRandom();
//        StringBuilder sb = new StringBuilder(len);
//        for (int i = 0; i < len; i++)
//            try {
//                sb.append(AB.charAt(rnd.nextInt(AB.length())));
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        sb.append("8765D");
//        return sb.toString();
//


   }










