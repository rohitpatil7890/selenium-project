package testpages;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.VendorCreationPom;

public class VendorCreationPageTest2 extends BaseClass {
	

	VendorCreationPom login;

		@BeforeClass
	
		public void openbrowser() throws IOException


		{
			initializeBrowser();

			login = new VendorCreationPom (driver);
	}

		@BeforeMethod
		public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException

		{
			try {
			login.Username(CommonUtils.getExcelData(6, 0));
			login.Password(CommonUtils.getExcelData(6, 1));
			login.clickOnLOGIN();
			login.clickOnmaster();
			login.ClickOnvendorcreation();
			login.vendorName(CommonUtils.getExcelData(21, 2));
			login.entermobile(CommonUtils.getExcelData(22, 2));
			login.enterEmail(CommonUtils.getExcelData(23, 2));
			login.enterAddress(CommonUtils.getExcelData(24, 1));
			login.enterPinCode(CommonUtils.getExcelData(25, 1));
			login.enterCity(CommonUtils.getExcelData(26, 1));
			
			String pannumber = "";
			pannumberMap = CommonUtils.generatePAN(5);
			if (!pannumberMap.get("PANNUMBER").equals(null) && !pannumberMap.get("PANNUMBER").equals("")) {
				pannumber = pannumberMap.get("PANNUMBER").toString();
			}
			login.enterPan(pannumber);
			login.enterTan(generateTAN(5));
			login.enterGSTno(CommonUtils.getExcelData(29, 1));
			String generateNum =generateAccountNumber();
			login.enterAdhar(generateNum);
			handlePopUp();
			login.enterIFSCCODE(CommonUtils.getExcelData(31, 1));
			login.enterAccountNO(generateNum);
			login.enterConfirmAccountNO(generateNum);
			WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"FileUploadPassbook\"]"));
			fileUpload.sendKeys("E:\\DEMO PDF FILE.pdf");
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
			
/////////////////////////////////////////// Vendor Approval //////////////////////////////////////////////////////////////
			
			login.clickOnmaster();
			Thread.sleep(1000);
			login.vendorApproval();
			Thread.sleep(2000);
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			login.approval();
			Thread.sleep(1000);
			login.Approvalyes();
			login.ApprovalOk();
			login.LogOutIAmaker();
			login.IamakerlogoutYes();
			
///////////////////////////////////// IAChekerLogin VendorApproval /////////////////////////////////////////////////////////
			
			login.IAChekerLogin(CommonUtils.getExcelData(8, 0));
			login.IAChekerPassword(CommonUtils.getExcelData(8, 1));
			login.IAChekerLOGIN();
			login.clickOnmaster();
			login.VendorAproval();
			Thread.sleep(2000);
			CommonUtils.clickCheckBoxForVendorApproval(driver);
			Thread.sleep(2000);
			login.approval();
			login.Approvalyes();
			login.clickk();
			login.LogOutIAmaker();
			login.IamakerlogoutYes();
					}
			catch(Exception e)
			{
				
				CommonUtils.captureScreenShoot(driver, 1); 
				CommonUtils.writeExcel(8, 3, "Failed");	
			}
			

		}
		
		@Test
		public void VendorCreationPom() throws EncryptedDocumentException, IOException {
			Reporter.log("---Runing Test Script-------");
			//String expectedURL = "http://cna.demofms.com/Login.aspx";
			String expectedURL = "http://192.168.0.162:3364/Login.aspx";
			String actualURL = driver.getCurrentUrl();
			if (actualURL.equals(expectedURL))
				CommonUtils.writeExcel(8, 2, "passed");
			
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
		
		
		
		//Handle TAN number AAAA00001D
		
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
			List<WebElement> allCheckBoxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
			int checkBoxId =allCheckBoxes.size() -1;
			String idFormation = "body_grdApprovalPending_chkApproval_"+checkBoxId+"";
			WebElement clickCheckbox = driver.findElement(By.id(idFormation));
			clickCheckbox.click();
		}
		}



