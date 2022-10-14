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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.CommonUtils;
import pom.HoldingAccountMappingWorkPom;

public class HoldingAccountMappingWorkTest extends BaseClass {

	HoldingAccountMappingWorkPom login;

	@BeforeClass

	public void openbrowser() throws IOException

	{
		initializeBrowser();
		login = new HoldingAccountMappingWorkPom(driver);

	}

	@Test(priority = 0)
	public void createHoldAccountMappingForWork() throws EncryptedDocumentException, IOException, InterruptedException {

		//try {
			login.Username(CommonUtils.getExcelData(4, 2));
			login.Password(CommonUtils.getExcelData(4, 3));
			login.clickOnLOGIN();
		    login.clickOnmaster();
			login.DedactionAcountMapping();
			login.BillType();
			login.ContiGency();
			login.AccountPayee(CommonUtils.getExcelData(51, 3));
			login.BankName(CommonUtils.getExcelData(52, 3));
			login.BranchName(CommonUtils.getExcelData(53, 3));
			login.AccountNumber(CommonUtils.generateAccountNumber(null));
			login.IFSCCode(CommonUtils.getExcelData(55, 3));
			login.MICRCode(CommonUtils.getExcelData(56, 3));
			login.BankAddress(CommonUtils.getExcelData(57, 3));
			login.BankPlace(CommonUtils.getExcelData(58, 3));
			login.District(CommonUtils.getExcelData(59, 3));
			login.DeductionmSave();
			login.Deductionconsave();

			String expectedUrl = "http://192.168.0.162:5230/DeductiondeclartaionMuttiplereportSlip.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		//} catch (Exception e) {
		//	e.printStackTrace();
			// CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
	
	}

	@Test(priority = 1, dependsOnMethods= {"createHoldAccountMappingForWork"})
	public void holdAccountMappingApproveByIAMaker()
			throws EncryptedDocumentException, IOException, InterruptedException {

		//try {
			/////////////////////////////////// IAMAKERPATNA Holding Bank Account Mapping
			/////////////////////////////////// Approval/////////////////////////////
			login.clickOnmaster();
			login.DeAccountMappingApproval();
			Thread.sleep(2000);

			checkenabledCheckBox(driver);
			Thread.sleep(2000);
			login.Approve();
			login.ApproveYes();
			login.ApprovalOk();
			login.Logout();
			login.YesLogout();
			String expectedUrl = "http://192.168.0.162:5230/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);

//		} catch (Exception e) {
		//	e.printStackTrace();
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		//}
	}

	@Test(priority = 2, dependsOnMethods= {"holdAccountMappingApproveByIAMaker"})
	public void holdAccountMappingApproveByIAChecker()
			throws EncryptedDocumentException, IOException, InterruptedException {

		//try {

			///////////////////////////////////////////// IACHECKERPATNA Holding Bank
			///////////////////////////////////////////// Account Mapping Approval

			login.Username(CommonUtils.getExcelData(5, 2));
			login.Password(CommonUtils.getExcelData(5, 3));
			login.clickOnLOGIN();
			login.clickOnmaster();
			login.AccountMappingApproval();
			Thread.sleep(2000);
			checkenabledCheckBox(driver);
			Thread.sleep(2000);
			login.Approve();
			login.ApproveYes();
			Thread.sleep(7000);
			login.ApprovalOk();
			login.Logout();
			login.YesLogout();
			String expectedUrl = "http://192.168.0.162:5230/Login.aspx";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);

		//} catch (Exception e) {
		//	e.printStackTrace();
			CommonUtils.captureScreenShoot(driver, 1);
			// CommonUtils.writeExcel(1, 2, "Failed");
		//}
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

			} 
			i++;
		}

	}
}
