package testpages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.IAMGenerateBillTypeWork;
public class GenerateBillTypeWorkTest extends BaseClass {
	
	 IAMGenerateBillTypeWork login;

	@BeforeClass
	public void openbrowser() throws IOException

	{
		initializeBrowser();

		login = new  IAMGenerateBillTypeWork(driver);

	}
	

	@Test(priority = 0)
	public void createBillGenerationTypeWork() throws Exception {
	//	try {
		login.Username(CommonUtils.getExcelData(4, 2));
		login.Password(CommonUtils.getExcelData(4, 3));
		login.clickOnLOGIN();
		login.clicktransection();
		login.ClickGeneratebill();
		login.clickselectFeYear();
		Thread.sleep(2000);
		login.clicksubscheme1();
		Thread.sleep(2000);
		login.clickselectHeCode1();
		Thread.sleep(1000);
		login.clickselectBillType();
		Thread.sleep(2000);
		
		String pannumber = "";
		if (pannumberMap!= null && !pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
			pannumber = pannumberMap.get("PANNUMBER").toString();
		} else {
			pannumber = "DPAPS3524D";
		}
		
		login.Pannoenter(pannumber);
		login.sideclick();
		login.selectvendornameclick();
		Thread.sleep(1000);
		login.AAnumberclick();
		Thread.sleep(2000);
		login.WorkOrderNoclick();
		Thread.sleep(2000);
		
		//Bill Amount handling 
		WebElement totalRemainingBalance = driver.findElement(By.id("body_txtTotalPendingAmount")); 
		String remainBalStr = totalRemainingBalance.getAttribute("value");
		int remainBalInt = Integer.parseInt(remainBalStr);
		remainBalInt= remainBalInt+1;
		System.out.println("******************************************"+remainBalInt);
		login.Billamountclick(String.valueOf(remainBalInt),driver,true);
		
		try {
			login.Billamountclick(CommonUtils.getExcelData(80,3), driver,false);
		} catch (StaleElementReferenceException e) {
			login.Billamountclick(CommonUtils.getExcelData(80,3), driver,false);
		}
		
		//login.Billamountclick();
		Thread.sleep(1000);
		login.Remarksend();
		Thread.sleep(1000);
		login.UploadcopySend(CommonUtils.getExcelData(84,3));
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
		
		//http://192.168.0.162:3364/BillApproval.aspx
		
		String expectedUrl = "http://192.168.0.162:3364/BillApproval.aspx";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	//} catch (Exception e) {
		//e.printStackTrace();
		// CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");
//	}
}
	
	@Test(priority = 1, dependsOnMethods= "createBillGenerationTypeWork")
	public void billApproveByIAMaker() throws InterruptedException, EncryptedDocumentException, IOException {
	//	try {
		login.viewSlip();
		Thread.sleep(2000);
		
		login.Approve();
		Thread.sleep(2000);
		
		login.RemarkText(CommonUtils.getExcelData(83,2));
		Thread.sleep(2000);
		login.Remarksyes();
		Thread.sleep(10000);
		//login.Back();
		//Thread.sleep(3000);
		
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
		
		String expectedUrl = "http://192.168.0.162:3364/Login.aspx";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	//} catch (Exception e) {
		//e.printStackTrace();
		CommonUtils.captureScreenShoot(driver, 1);
		// CommonUtils.writeExcel(1, 2, "Failed");
	//}
}
	
	@Test(priority = 2, dependsOnMethods= "billApproveByIAMaker")
	public void billApproveByIACheckerTypeWork() throws Exception {
		//try {
			login.Username(CommonUtils.getExcelData(5, 2));
			login.Password(CommonUtils.getExcelData(5, 3));
			login.clickOnLOGIN();
			login.clicktransection();
			login.hoverBillTransection(driver);
			login.BillInwardsclick();
			login.showrecordclick();
			login.inwerdslipclick();
			login.approveslipclick();
			login.remarksend();
			login.remarkyesclick();
			Thread.sleep(10000);
			login.IACtransaction1click();
			login.hoverBillTransection1(driver);
			login.BillOutwordsclick();
			login.showrecordclick1();
			login.outwordslipclick();
			login.logoutclick();
			login.yeslogoutclick();
			String expectedUrl = "http://192.168.0.162:3364/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);

//		} catch (Exception e) {
	//		e.printStackTrace();
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
//		}
	}
	





	@AfterClass
	public void CloseBrowser() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();



	}
}
