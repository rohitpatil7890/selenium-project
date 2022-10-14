
package testpages;

import java.io.IOException;
import java.security.SecureRandom;
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
		//try {
			login.Username(CommonUtils.getExcelData(4, 2));
			login.Password(CommonUtils.getExcelData(4, 3));
			Thread.sleep(1000);
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
			// Handle empty popup
			login.enterAccountNO(generateNum);
			login.enterConfirmAccountNO(generateNum);
			WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"FileUploadPassbook\"]"));
			fileUpload.sendKeys(CommonUtils.getExcelData(48, 3));
			Thread.sleep(1000);
			login.Ok();
			login.clickOnLoginBtn();
			handlePopUp();
			WebElement modalContainer = driver.findElement(By.className("modal-content"));
			System.out.println("modalContainer**********" + modalContainer);
			Thread.sleep(1000);
			handlePopUp();
			WebElement modalAcceptButton = driver.findElement(By.xpath("//*[@id=\"body_btnModalOK\"]"));
			modalAcceptButton.click();
			Thread.sleep(1000);
			handlePopUp();
			WebElement modalOkButton = driver.findElement(By.name("ctl00$body$btnRedirect"));
			modalOkButton.click();
			Thread.sleep(1000);
				
			String expectedUrl = "http://192.168.0.162:5230/DeclarationReportSlip.aspx";    
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		//} catch (Exception e) {
			//e.printStackTrace();
			//CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		
	}	
	
	@Test(priority = 1, dependsOnMethods= {"vendorCreation"})
	public void vendorApproveByCNAmaker() throws InterruptedException {
	//	try {
/////////////////////////////////////////// Vendor Approval //////////////////////////////////////////////////////////////

			login.clickOnmaster();
			Thread.sleep(1000);
			login.vendorApproval();
			Thread.sleep(2000);
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			login.approval();
			Thread.sleep(1000);
			login.Approvalyes();
			// Thread.sleep(5000);
			login.ApprovalOk();
			// s.clickk();
			login.LogOutIAmaker();
			login.IamakerlogoutYes();
			String expectedUrl = "http://192.168.0.162:5230/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
		//} catch (Exception e) {
			//e.printStackTrace();
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		
	}
	
	@Test(priority = 2, dependsOnMethods= {"vendorApproveByCNAmaker"})
	public void vendorApproveByCNAChecker() throws InterruptedException, EncryptedDocumentException, IOException {
		//try {
///////////////////////////////////// IAChekerLogin VendorApproval /////////////////////////////////////////////////////////

			login.IAChekerLogin(CommonUtils.getExcelData(5, 2));
			login.IAChekerPassword(CommonUtils.getExcelData(5, 3));
			Thread.sleep(2000);
			login.IAChekerLOGIN();
			login.clickOnmaster();
			login.VendorAproval();
			Thread.sleep(2000);
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			Thread.sleep(2000);
			login.approval();
			login.Approvalyes();
			login.clickk();
			try {
				login.LogOutCAmaker();
			} catch (StaleElementReferenceException e) {
				login.LogOutCAmaker();
			}

			login.CamakerlogoutYes();

			String expectedUrl = "http://192.168.0.162:5230/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
//		} catch (Exception e) {
//			e.printStackTrace();
			//CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		

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

	
}
