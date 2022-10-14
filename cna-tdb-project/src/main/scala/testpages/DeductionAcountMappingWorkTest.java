package testpages;



import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.DeductionAcountMappingPom;

public class DeductionAcountMappingWorkTest extends BaseClass {

	DeductionAcountMappingPom login;

	@BeforeClass

	public void openbrowser() throws IOException

	{
		initializeBrowser();
		login = new DeductionAcountMappingPom(driver);

	}

	@BeforeMethod
	public void AplicationLogin() throws EncryptedDocumentException, IOException, InterruptedException

	{
		try {
			login.Username(CommonUtils.getExcelData(6, 0));
			login.Password(CommonUtils.getExcelData(6, 1));
			login.clickOnLOGIN();
			login.clickOnmaster();
			login.DedactionAcountMapping();
			login.BillType();
			login.ContiGency();
			login.AccountPayee(CommonUtils.getExcelData(89, 1));
			// dp.AccountNumber(CommonUtils.generateAccountNumber(null));
			login.BankName(CommonUtils.getExcelData(90, 1));
			login.BranchName(CommonUtils.getExcelData(91, 1));
			login.AccountNumber(CommonUtils.generateAccountNumber(null));
			login.IFSCCode(CommonUtils.getExcelData(93, 1));
			login.MICRCode(CommonUtils.getExcelData(94, 1));
			login.BankAddress(CommonUtils.getExcelData(95, 1));
			login.BankPlace(CommonUtils.getExcelData(96, 1));
			login.District(CommonUtils.getExcelData(97, 1));
			login.DeductionmSave();
			// login.SaveNo();
			login.Deductionconsave();

			/////////////////////////////////// IAMAKERPATNA Holding Bank Account Mapping
			/////////////////////////////////// Approval/////////////////////////////
			login.clickOnmaster();
			login.DeAccountMappingApproval();
			Thread.sleep(2000);
			// dp.PendingAproval();
			// Thread.sleep(2000);
			// CommonUtils.checkenabledCheckBox(driver);
			checkenabledCheckBox(driver);
			Thread.sleep(2000);
			login.Approve();
			login.ApproveYes();
			// login.PendingAproval();
			Thread.sleep(7000);
			login.ApprovalOk();
			login.Logout();
			login.YesLogout();

//			Thread.sleep(5000);
//			s.ApprovalOk();
//			//s.clickk();
//			s.LogOutIAmaker();
//			s.IamakerlogoutYes();

			///////////////////////////////////////////// IACHECKERPATNA Holding Bank
			///////////////////////////////////////////// Account Mapping Approval
			///////////////////////////////////////////// /////////////////////////////////////

			login.Username(CommonUtils.getExcelData(8, 0));
			login.Password(CommonUtils.getExcelData(8, 1));
			login.clickOnLOGIN();
			login.clickOnmaster();
			login.AccountMappingApproval();
			Thread.sleep(2000);
			checkenabledCheckBox(driver);
			Thread.sleep(2000);
			login.Approve();
			login.ApproveYes();
			// login.PendingAproval();
			Thread.sleep(7000);
			login.ApprovalOk();
			login.Logout();
			login.YesLogout();
		} catch (Exception e) {

			CommonUtils.captureScreenShoot(driver, 1);
			CommonUtils.writeExcel(8, 2, "Failed");
		}

	}

	@Test
	public void DeductionAcountMapping() throws EncryptedDocumentException, IOException {
		Reporter.log("---Runing Test Script-------");
		// String expectedURL = "http://cna.demofms.com/Login.aspx";
		String expectedURL = "http://192.168.0.162:7777/Login.aspx";
		String actualURL = driver.getCurrentUrl();
		if (actualURL.equals(expectedURL))
			CommonUtils.writeExcel(8, 2, "passed");

		//AssertJUnit.assertEquals(actualURL, expectedURL, "actUserID and expectID are different");
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
	
	
	public static void checkenabledCheckBox(WebDriver driver) {
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int i = 0;
		for (WebElement checkBox : checkBoxList) {
			boolean selected = checkBox.isEnabled();
			if (selected) {
				 checkBox.click();

			}                                 //*[@id="body_grdApprovalPending"]/tbody/tr[1]/td[1]   ("input[type='checkbox']")
			i++;
		}
		
		
	}
}
