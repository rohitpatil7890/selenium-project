package testpages;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.WorkCreationHeadCode1;

public class WorkCreation1Test extends BaseClass {

	WorkCreationHeadCode1 login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new WorkCreationHeadCode1(driver);

	}

	@Test(priority = 0)
	public void projectDetailsCreation() throws Exception

	{
		

			login.Username(CommonUtils.getExcelData(4, 2));

			login.Password(CommonUtils.getExcelData(4, 3));
			login.clickOnLOGIN();
			login.clickOnTransaction();
			login.clickonProjectDetails(driver);
			login.clickOnProjectDetailsCreation();
			login.clickonCashBook();
			login.clickOnScheme("");
			login.clickOnSide();
			login.clickOnHeadCode();
			login.clickonAdminApprovalNumber();
			login.clickOnPANno();

			String pannumber = "";
			if (pannumberMap!= null && !pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
				pannumber = pannumberMap.get("PANNUMBER").toString();
			} else {
				pannumber ="DPAPS3524D";
			}

			login.FillPanNumber(pannumber);
			// login.FillPanNumber(FillPanNumber(5));
			//login.EnterContractorName(CommonUtils.getExcelData(230, 1));
			login.EnterWorkName(CommonUtils.getExcelData(71, 3));

			Random rand = new Random();
			int rand_int1 = rand.nextInt(1000);
			String s = Integer.toString(rand_int1);
			login.EnterWorkOrderNo(s);

			login.SelectRANumber();
			login.clickOnOrderDate();
			login.clickOnOrderDateSelect();
			login.clickOnEndOrderDate();
			login.clickOnEndOrderDateSelect();
			
			//Tender amount BVA
			
			//Bill Amount handling 
			WebElement totalRemainingBalance = driver.findElement(By.id("body_grdAdminApprovalDetails_lblBalanceAAAmount_0")); 
			String remainBalStr = totalRemainingBalance.getText();
			remainBalStr = remainBalStr.substring(0, remainBalStr.length()-3);
			int remainBalInt = Integer.parseInt(remainBalStr);
			remainBalInt= remainBalInt+1;
			System.out.println("******************************************"+remainBalInt);
			login.EnterTendorAmount(String.valueOf(remainBalInt),driver,true);
			
			login.EnterTendorAmount("0",driver,true);
			
			try {
				login.EnterTendorAmount(CommonUtils.getExcelData(73,3), driver,false);
			} catch (StaleElementReferenceException e) {
				login.EnterTendorAmount(CommonUtils.getExcelData(73,3), driver,false);
			}
			//login.EnterTendorAmount(CommonUtils.getExcelData(73, 3));
			
			
			login.EnterTotalPaidAmount(CommonUtils.getExcelData(74, 3));
			//login.EnterTotalPendingAmount();
			login.clickonOrderCopy(driver,CommonUtils.getExcelData(76, 3));
			login.clickOnOk();
			login.clickOnSave();
			login.clickOnSaveYes();
			login.ClickOnSaveYesok();
			
			
			 String expectedUrl = "http://192.168.0.162:7777/WORKDETAILS.ASPX";    
			 String actualUrl = driver.getCurrentUrl();
			 Assert.assertEquals(actualUrl, expectedUrl);
	
			//CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		
	}
	
	@Test(priority = 1, dependsOnMethods= {"projectDetailsCreation"})
	public void projectApprovalByIAMaker() throws Exception

	{
		
			////////////IA MAKER Project Transaction////////////
			login.clickOnTransaction1();
			login.clickonProjectTransactions(driver);
			login.clickOnProjectInward();
			login.clickOnViewSlip();
			login.clickOnApproveSlip();
			login.clickOnApproveSlipYes();
			login.clickOnApproveSlipYesOk();
			/////// Outward/////////
			login.clickOnTransaction2();
			login.clickonProjectTransactions1(driver);
			login.clickOnProjectOutward();
			login.clickOnViewSlip2();
			login.clickOnLogOut();
			login.clickOnLogOutYes();
			
			String expectedUrl = "http://192.168.0.162:7777/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
		
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
	
	}
	
	@Test(priority = 2, dependsOnMethods= {"projectDetailsCreation"})
	public void projectApprovalByIAChecker() throws Exception

	{
		
			///////////IA CHECKER//////////.
			login.Username(CommonUtils.getExcelData(5, 2));
			login.Password(CommonUtils.getExcelData(5, 3));
			login.clickOnLOGIN();
			login.clickOnTransaction1();
			login.clickonProjectTransactions(driver);
			login.clickOnProjectInward();
			login.clickOnViewSlip();
			login.clickOnApproveSlip();
			login.clickOnApproveSlipYes();
			login.clickOnApproveSlipYesOk();
			/////// Outward/////////
			login.clickOnTransaction2();
			login.clickonProjectTransactions1(driver);
			login.clickOnProjectOutward();
			login.clickOnViewSlip2();
			login.clickOnLogOut();
			login.clickOnLogOutYes();
			
			String expectedUrl = "http://192.168.0.162:7777/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
		
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		
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
