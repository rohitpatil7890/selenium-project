




















//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//	<test thread-count="5" name="Test">
//		<classes>
//
//
//			<class name="testpages.SchemeBudgetEntryHeadCode1Test" />
//			<class name="testpages.SchemeBudgetEntryHeadCode2Test" />
//			<class name="testpages.IAcreationTest" />
//			<class name="testpages.TransferLimitToIAHeadCode1Test" />
//			<class name="testpages.TransferLimitToIAHeadCode2Test" />
//			<class name="testpages.VendorCreationPage" />
//			<class name="testpages.VendorCreationPage_2" />
//			<class name="testpages.DeductionAcountMappingTest" />
//			<class name="testpages.IAMAdministrativeApprovalCreationTest" />
//			<class name="testpages.IACheckerInboxOutboxTest" />
//			<class name="testpages.WorkCreationHeadCode1Test" />
//			<class name="testpages.WorkCreationHeadCode2Test" />
//			<class name="testpages.Iamakerbillgenationtestdata" />
//			<class name="testpages.Iamakerbillgenationtestdata_HeadC2" />
//			<class name="testpages.IAMGenerateBillTypeWorkTest" />
//			<class name="testpages.IAMGenerateBillTypeWorkHeadcode2Test" />
//			<class name="testpages.IACBillTransectionInwardOutwordTest" />
//
//
//		</classes>
//	</test> <!-- Test -->
//</suite> <!-- Suite -->
//









































package testpages;


	


	import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.VendorCreationPom;

	public class sampleTest extends BaseClass 
	{
		
		

	
		@Test
		//Vendor page details
			public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException

			{
			
		
			
			    VendorCreationPom s = new VendorCreationPom(driver);
			    s.Username(CommonUtils.getExcelData(6, 0));
				s.Password(CommonUtils.getExcelData(6, 1));
				s.clickOnLOGIN();
				s.clickOnmaster();
				s.ClickOnvendorcreation();
				s.vendorName(CommonUtils.getExcelData(21, 1));
				s.entermobile(CommonUtils.getExcelData(22, 1));
				s.enterEmail(CommonUtils.getExcelData(23, 1));
				s.enterAddress(CommonUtils.getExcelData(24, 1));
				s.enterPinCode(CommonUtils.getExcelData(25, 1));
				s.enterCity(CommonUtils.getExcelData(26, 1));
				s.enterPan(generatePAN(5));
				s.enterTan(generateTAN(5));
				s.enterGSTno(CommonUtils.getExcelData(29, 1));
				String generateNum =generateAccountNumber();
				s.enterAdhar(generateNum);
				//handlePopUp();
				
				s.enterIFSCCODE(CommonUtils.getExcelData(31, 1));
				// Handle empty popup
				s.enterAccountNO(generateNum);
				s.enterConfirmAccountNO(generateNum);
				WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"FileUploadPassbook\"]"));
				fileUpload.sendKeys("E:\\DEMO PDF FILE.pdf");
				Thread.sleep(1000);

				s.Ok();
				s.clickOnLoginBtn();
				
//				handlePopUp();
//				
//				WebElement modalContainer = driver.findElement(By.className("modal-content"));
//				System.out.println("modalContainer**********" + modalContainer);
//				Thread.sleep(1000);
//			
//				handlePopUp();
//				
//				WebElement modalAcceptButton = driver.findElement(By.xpath("//*[@id=\"body_btnModalOK\"]")); 
//				modalAcceptButton.click();
//				Thread.sleep(1000);
//				handlePopUp();
//
//				WebElement modalOkButton = driver.findElement(By.name("ctl00$body$btnRedirect"));
//				modalOkButton.click();
				Thread.sleep(1000);
				
				s.clickOnmaster();
				Thread.sleep(1000);
				s.vendorApproval();
				
				Thread.sleep(2000);
				
				CommonUtils.clickCheckBoxForVendorApproval(driver);
				
				s.approval();
				Thread.sleep(1000);
				s.Approvalyes();
				Thread.sleep(5000);
				
				s.ApprovalOk();
				//s.clickk();
				s.LogOutIAmaker();
				//login.LogOutIAmaker();
				s.IamakerlogoutYes();
				
				s.IAChekerLogin(CommonUtils.getExcelData(8, 0));
				s.IAChekerPassword(CommonUtils.getExcelData(8, 1));
				s.IAChekerLOGIN();
				
				s.clickOnmaster();
				
				s.VendorAproval();
				Thread.sleep(2000);
				
				//Maker Approval 
				CommonUtils.clickCheckBoxForVendorApproval(driver);
				Thread.sleep(2000);
	            s.approval();
				
				s.Approvalyes();
				s.clickk();
				
				s.LogOutIAmaker();
				//login.LogOutIAmaker();
				s.IamakerlogoutYes();
				//login.ApprovalOk();
				
				
				Reporter.log("---Runing Test Script-------");

				//String expectedURL = "http://cna.demofms.com/Login.aspx";
				String expectedURL = "http://192.168.0.162:3364/Login.aspx";

				String actualURL = driver.getCurrentUrl();
				
				System.out.println(actualURL);
				
				Assert.assertEquals(actualURL, expectedURL,"actUserID and expectID are differant"); 
					
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
			
			String generatePAN(int len) {
				String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				SecureRandom rnd = new SecureRandom();
				StringBuilder sb = new StringBuilder(len);
				for (int i = 0; i < len; i++)
					try {
						sb.append(AB.charAt(rnd.nextInt(AB.length())));
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				sb.append("8765D");
				return sb.toString();

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


	







































//package testpages;
//
//import java.io.IOException;
//
//import java.security.SecureRandom;
//import java.util.List;
//import java.util.Random;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.ElementNotInteractableException;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import baseclasses.BaseClass;
//import baseclasses.CommonUtils;
//import pom.VendorCreationPom;
//
//public class VendorCreationPage extends BaseClass {
//	
//	
//
//	
//
//	//public class IAMAKER1 extends BaseClass  {
//
//	VendorCreationPom login;
//
//		@BeforeClass
//	
//		public void openbrowser() throws IOException
//
//
//		{
//			initializeBrowser();
//
//			login = new VendorCreationPom (driver);
//
//		}
//
//		@BeforeMethod
//		public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException
//
//		{
//			login.Username(CommonUtils.getExcelData(6, 0));
//
//			login.Password(CommonUtils.getExcelData(6, 1));
//
//			login.clickOnLOGIN();
//
//			login.clickOnmaster();
//
//			login.ClickOnvendorcreation();
//
//			login.vendorName(CommonUtils.getExcelData(11, 1));
//
//			login.entermobile(CommonUtils.getExcelData(12, 1));
//
//			login.enterEmail(CommonUtils.getExcelData(13, 1));
//
//			login.enterAddress(CommonUtils.getExcelData(14, 1));
//
//			login.enterPinCode(CommonUtils.getExcelData(15, 1));
//
//			login.enterCity(CommonUtils.getExcelData(16, 1));
//
//
//			login.enterPan(generatePAN(5));
//
//			login.enterTan(generateTAN(5));
//
//			login.enterGSTno(CommonUtils.getExcelData(19, 1));
//			String generateNum =generateAccountNumber();
//			login.enterAdhar(generateNum);
//
//			handlePopUp();
//			
//			login.enterIFSCCODE(CommonUtils.getExcelData(21, 1));
//			// Handle empty popup
//			
//			login.enterAccountNO(generateNum);
//			login.enterConfirmAccountNO(generateNum);
//
//			
//			
//			WebElement fileUpload = driver.findElement(By.xpath("//*[@id=\"FileUploadPassbook\"]"));
//			fileUpload.sendKeys("E:\\DEMO PDF FILE.pdf");
//			Thread.sleep(1000);
//
//			login.Ok();
//			login.clickOnLoginBtn();
//			
//			handlePopUp();
//			
//			WebElement modalContainer = driver.findElement(By.className("modal-content"));
//			System.out.println("modalContainer**********" + modalContainer);
//			Thread.sleep(1000);
//		
//			handlePopUp();
//			
//			WebElement modalAcceptButton = driver.findElement(By.xpath("//*[@id=\"body_btnModalOK\"]")); 
//			modalAcceptButton.click();
//			Thread.sleep(1000);
//			handlePopUp();
//
//			WebElement modalOkButton = driver.findElement(By.name("ctl00$body$btnRedirect"));
//			modalOkButton.click();
//			Thread.sleep(1000);
//			
//			login.clickOnmaster();
//			Thread.sleep(1000);
//			login.vendorApproval();
//			
//			Thread.sleep(2000);
//			
//			CommonUtils.clickCheckBoxForVendorApproval(driver);
//			
//			login.approval();
//			
//			login.Approvalyes();
//			
//			//login.ApprovalOk();
//			login.clickk();
//			login.LogOutIAmaker();
//			//login.LogOutIAmaker();
//			login.IamakerlogoutYes();
//			
//			login.IAChekerLogin(CommonUtils.getExcelData(8, 0));
//			login.IAChekerPassword(CommonUtils.getExcelData(8, 1));
//			login.IAChekerLOGIN();
//			
//			login.clickOnmaster();
//			
//			login.VendorAproval();
//			Thread.sleep(2000);
//			
//			//Maker Approval 
//			CommonUtils.clickCheckBoxForVendorApproval(driver);
//			Thread.sleep(2000);
//            login.approval();
//			
//			login.Approvalyes();
//			login.clickk();
//			
//			login.LogOutIAmaker();
//			//login.LogOutIAmaker();
//			login.IamakerlogoutYes();
//			//login.ApprovalOk();
//		}
//		
//		@Test
//		public void verifyCNApage() throws EncryptedDocumentException, IOException {
//			Reporter.log("---Runing Test Script-------");
//
//			String expectedURL = "http://cna.demofms.com/Login.aspx";
//
//			String actualURL = driver.getCurrentUrl();
//			
//			System.out.println(actualURL);
//			
//			Assert.assertEquals(actualURL, expectedURL,"actUserID and expectID are differant"); 
//
//			}
//
//		@AfterMethod
//		public void ApplicationClose() {
//
//			Reporter.log("-----Close Application-----");
//
//	
//
//		}
//
//		@AfterClass
//		public void CloseBrowser() throws InterruptedException {
//		
//			//driver.quit();
//
//	    
//
//		}
//		
//		public void handlePopUp() throws InterruptedException {
//			try {
//				WebElement popupClick = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button")); 
//				popupClick.click();
//				Thread.sleep(1000);
//			} catch (ElementNotInteractableException e) {
//				System.out.println("No popup");
//			}
//		}
//		
//		public String generateAccountNumber() {
//			Random r = new Random();
//			long numbers = 100000000000L + (long) (r.nextDouble() * 99999999999L);
//			String accountnumber = Long.toString(numbers);
//			System.out.println(accountnumber);
//			return accountnumber;
//		}
//		
//		String generatePAN(int len) {
//			String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			SecureRandom rnd = new SecureRandom();
//			StringBuilder sb = new StringBuilder(len);
//			for (int i = 0; i < len; i++)
//				try {
//					sb.append(AB.charAt(rnd.nextInt(AB.length())));
//				} catch (Exception e) {
//					
//					e.printStackTrace();
//				}
//			sb.append("8765D");
//			return sb.toString();
//
//		}
//		
//		//Handle TAN number AAAA00001D
//		
//		String generateTAN(int len) {
//			String AB = "123456789";
//			SecureRandom rnd = new SecureRandom();
//			StringBuilder sb = new StringBuilder(len);
//			sb.append("AAAA");
//			for (int i = 0; i < len; i++)
//				try {
//					sb.append(AB.charAt(rnd.nextInt(AB.length())));
//				} catch (Exception e) {
//					
//					e.printStackTrace();
//				}
//			sb.append("D");
//			return sb.toString();
//
//		}
//		
//		
//		public void clickCheckBoxForVendorApproval() {
//			List<WebElement> allCheckBoxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
//			int checkBoxId =allCheckBoxes.size() -1;
//			String idFormation = "body_grdApprovalPending_chkApproval_"+checkBoxId+"";
//			WebElement clickCheckbox = driver.findElement(By.id(idFormation));
//			clickCheckbox.click();
//		}
//		}
//
//
//

	
	
	
	
//	Actions act1 = new Actions(driver);
//    act1.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
//    System.out.println("Scroll down perfomed");
//    Thread.sleep(3000);
// 
//    act1.sendKeys(Keys.TAB).build().perform();
//    act1.sendKeys(Keys.ARROW_RIGHT).build().perform();       //Page Up
//    System.out.println("Scroll up perfomed");
	// Thread.sleep(5000);

	// login.Back();
	// Thread.sleep(5000);