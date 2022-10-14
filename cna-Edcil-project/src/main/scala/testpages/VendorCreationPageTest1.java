
package testpages;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
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
import pom.VendorCreationPom;

public class VendorCreationPageTest1 extends BaseClass {
	VendorCreationPom login;
	@BeforeClass
	public void openbrowser() throws IOException
	{
		initializeBrowser();
		login = new VendorCreationPom(driver);
	}
	@Test(priority = 0)
	public void vendorCreation() throws EncryptedDocumentException, IOException, InterruptedException
	{
		////////////////////////////////////VENDOR CREATION/////////////////////////////////////////////
			login.Username(CommonUtils.getExcelData(4, 2));
			login.Password(CommonUtils.getExcelData(4, 3));
			login.clickOnLOGIN();
			login.clickOnmaster();
			login.ClickOnvendorcreation();
			login.vendorName(CommonUtils.getExcelData(32, 3));
			login.entermobile(CommonUtils.getExcelData(33, 3));
			login.enterEmail(CommonUtils.getExcelData(34, 3));
			login.enterAddress(CommonUtils.getExcelData(35, 3));
			login.enterPinCode(CommonUtils.getExcelData(36, 3));
			login.enterCity(CommonUtils.getExcelData(37, 3));
			String pannumber = "";
			pannumberMap = CommonUtils.generatePAN(5);
			if (!pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
				pannumber = pannumberMap.get("PANNUMBER").toString();
			}
			login.enterPan(pannumber);
			login.enterTan(generateTAN(5));
			login.enterGSTno(CommonUtils.getExcelData(40, 3));
			String generateNum = generateAccountNumber();
			login.enterAdhar(generateNum);
			handlePopUp();
			login.enterIFSCCODE(CommonUtils.getExcelData(42, 3));
			login.enterAccountNO(generateNum);
			login.enterConfirmAccountNO(generateNum);
			WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"FileUploadPassbook\"]"));
			fileUpload.sendKeys(CommonUtils.getExcelData(48, 3));
			login.Ok();
			login.clickOnLoginBtn();
			handlePopUp();
			WebElement modalContainer = driver.findElement(By.className("modal-content"));
			System.out.println("modalContainer**********" + modalContainer);
			handlePopUp();
			WebElement modalAcceptButton = driver.findElement(By.xpath("//*[@id=\"body_btnModalOK\"]"));
			Thread.sleep(1000);
			modalAcceptButton.click();
			handlePopUp();
			WebElement modalOkButton = driver.findElement(By.name("ctl00$body$btnRedirect"));
			modalOkButton.click();	
//			http://192.168.0.162:8018/DeclarationReportSlip.aspx
			
			String expectedUrl = "http://192.168.0.162:8018/DeclarationReportSlip.aspx";    
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	
	@Test(priority = 1,dependsOnMethods= {"vendorCreation"})
	public void vendorApproveByCNAmaker() throws InterruptedException {
/////////////////////////////////////////// Vendor Approval //////////////////////////////////////////////////////////////
			login.clickOnmaster();
			login.vendorApproval();
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			login.approval();
			login.Approvalyes();
			login.ApprovalOk();
			login.LogOutIAmaker();
			login.IamakerlogoutYes();
			String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	@Test(priority = 2,dependsOnMethods= {"vendorApproveByCNAmaker"})
	public void vendorApproveByCNAChecker() throws InterruptedException, EncryptedDocumentException, IOException {
///////////////////////////////////// IAChekerLogin VendorApproval /////////////////////////////////////////////////////////
			login.IAChekerLogin(CommonUtils.getExcelData(5, 2));
			login.IAChekerPassword(CommonUtils.getExcelData(5, 3));
			login.IAChekerLOGIN();
			login.clickOnmaster();
			login.VendorAproval();
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			login.approval();
			login.Approvalyes();
			login.clickk();
			try {
				login.LogOutCAmaker();
			} catch (StaleElementReferenceException e) {
				login.LogOutCAmaker();
			}
			login.CamakerlogoutYes();
			String expectedUrl = "http://192.168.0.162:8018/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		
			//CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		}
	
//	
//	
//	
//	
//
//	//////////////////////IA APPROVER////////
	@Test(priority = 3,dependsOnMethods = {"vendorApproveByCNAChecker"})
	public void IaApprover() throws InterruptedException, EncryptedDocumentException, IOException {
		login.Username(CommonUtils.getExcelData(6, 2));
		login.Password(CommonUtils.getExcelData(6, 3));
		login.clickOnLOGIN();
		login.clickOnmaster();
		login.VendorAproval();
		Thread.sleep(2000);
		CommonUtils.clickCheckBoxForVendorApproval(driver);
		Thread.sleep(2000);
		login.approval();
		login.Approvalyes();
		Thread.sleep(5000);
		login.ApprovalOk();
		Thread.sleep(5000);
//		login.clickk();
		login.LogOutIAmaker();
		Thread.sleep(5000);
		login.IamakerlogoutYes();
//		try {
//			login.LogOutIAmaker();
//		}catch (StaleElementReferenceException e) {  
//			login.LogOutIAmaker();
//		}
//		login.IachekerlogoutYes();
		
		String expectedURL = "http://192.168.0.162:8018/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
		//CommonUtils.writeExcel(6, 2, "passed");
		//AssertJUnit.assertEquals(actualURL,expectedURL,"actUserID and expectID are different");
		System.out.println(actualURL);
}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void ApplicationClose() {

		Reporter.log("-----Close Application-----");
	}

	@AfterClass
	public void CloseBrowser() throws InterruptedException {

		Thread.sleep(2000);
		 driver.quit();
	}

	public void handlePopUp() throws InterruptedException {
		try {
			WebElement popupClick = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button"));
			popupClick.click();
			Thread.sleep(1000);
		} catch (ElementNotInteractableException e) {
			System.out.println("No popup");
		}
	}

	public String generateAccountNumber() {
		Random r = new Random();
		long numbers = 100000000000L + (long) (r.nextDouble() * 99999999999L);
		String accountnumber = Long.toString(numbers);
		System.out.println(accountnumber);
		return accountnumber;
	}

	/*
	 * Map<String,StringBuilder> generatePAN(int len) { String AB =
	 * "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; SecureRandom rnd = new SecureRandom();
	 * StringBuilder sb = new StringBuilder(len); for (int i = 0; i < len; i++) try
	 * { sb.append(AB.charAt(rnd.nextInt(AB.length()))); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } sb=sb.append("8765D"); pannumberMap.put("PANNUMBER",
	 * sb); return pannumberMap;
	 * 
	 * }
	 */

	// Handle TAN number AAAA00001D

	String generateTAN(int len) {
		String AB = "123456789";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(len);
		sb.append("AAAA");
		for (int i = 0; i < len; i++)
			try {
				sb.append(AB.charAt(rnd.nextInt(AB.length())));
			} catch (Exception e) {

				e.printStackTrace();
			}
		sb.append("D");
		return sb.toString();

	}

	public void clickCheckBoxForVendorApproval() {
		List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int checkBoxId = allCheckBoxes.size() - 1;
		String idFormation = "body_grdApprovalPending_chkApproval_" + checkBoxId + "";
		WebElement clickCheckbox = driver.findElement(By.id(idFormation));
		clickCheckbox.click();
	}
}
