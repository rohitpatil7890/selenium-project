package pom;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkCreationHeadCode1 {

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement USERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement PASSWORD;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement LOGIN;

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/a")
	public WebElement Transaction;

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[5]/a")
	public WebElement ProjectDetails;

	@FindBy(xpath = " //a[normalize-space()='Project Details Creation']")
	public WebElement ProjectDetailsCreation;

	@FindBy(xpath = " //*[@id=\"body_ddlCashBook\"]")
	public WebElement CashBook;

	@FindBy(id = "body_txtHeadtype") 
	public WebElement Scheme;

	@FindBy(xpath = "//th[normalize-space()='Scheme']")
	public WebElement SideClick;

	@FindBy(xpath = "//*[@id=\"body_grdHeadType_btnHeadCode_0\"] ")
	public WebElement HeadCode;

	@FindBy(xpath = "//select[@id='body_ddlAdminApprovalNo'] ")
	public WebElement AdminApprovalNumber;

	@FindBy(id = "body_ddlDocumentType")
	public WebElement PANno;

	@FindBy(xpath = "//input[@id='body_txtDocumentDetails'] ")
	public WebElement PanNumber;

	@FindBy(xpath = "//*[@id=\"body_txtContratorDetails\"]")
	public WebElement ContractorName;

	@FindBy(xpath = "//*[@id=\"body_txtWorkName\"]")
	public WebElement WorkName;

	@FindBy(xpath = "//*[@id=\"body_txtWorkordNo\"]")
	public WebElement WorkOrderNo;

	@FindBy(xpath = "//*[@id=\"body_ddlLastBillSequence\"]")
	public WebElement RANumber;

	@FindBy(xpath = "//*[@id=\"body_txtWorkOrdDate\"]")
	public WebElement OrderDate;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")
	public WebElement OrderDateSelect;

	@FindBy(xpath = "//input[@id='body_txtWorkOrderEndDate']")
	public WebElement OrderEndDate;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")
	public WebElement OrderEndDateSelect;

	@FindBy(xpath = "//*[@id=\"body_txtNivalTotal\"]")
	public WebElement TendorAmount;

	@FindBy(xpath = "//*[@id=\"body_txtNetPayment\"]")
	public WebElement TotalPaidAmount;

	@FindBy(xpath = "//*[@id=\"body_txtVajavatAmount\"]")
	public WebElement TotalPendingAmount;

	@FindBy(xpath = "//*[@id='FileUpload']")
	public WebElement WorkOrderCopy;

	@FindBy(xpath = "//*[@id=\"Button1\"]")
	public WebElement Ok;

	@FindBy(xpath = "//input[@id='body_btnSave']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement SaveYes;

	@FindBy(xpath = "//*[@id=\"body_btnRedirect\"]")
	public WebElement SaveYesOk;

	////////// Project Transaction//////////
	///// Inward///////
	@FindBy(xpath = "	//a[normalize-space()='Transaction']")
	public WebElement Transaction1;

	@FindBy(xpath = "//a[normalize-space()='Project Transactions']")
	public WebElement ProjectTransactions;

	@FindBy(xpath = "//a[normalize-space()='Project Inward']")
	public WebElement ProjectInward;

	@FindBy(xpath = " //tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement ViewSlip;

	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement ApproveSlip;

	@FindBy(xpath = "//*[@id=\"body_btnYes\"]")
	public WebElement ApproveSlipYes;

	@FindBy(xpath = "	  //*[@id=\"body_btnRedirect\"]")
	public WebElement ApproveSlipYesOk;

	////////// Outward//////////
	@FindBy(xpath = "	//a[normalize-space()='Transaction']")
	public WebElement Transaction2;

	@FindBy(xpath = "//a[normalize-space()='Project Transactions']")
	public WebElement ProjectTransactions2;

	@FindBy(xpath = "//a[normalize-space()='Project Outward']")
	public WebElement ProjectOutward;

	@FindBy(xpath = " //tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement ViewSlip2;

	@FindBy(xpath = " //*[@id=\"btnLogout\"]")
	public WebElement LogOut;

	@FindBy(name ="ctl00$btnYesLogout")
	public WebElement LogOutYes;
	public WorkCreationHeadCode1(WebDriver driver)

	{
		PageFactory.initElements(driver, this);

	}

	public void Username(String USERNAME1) throws InterruptedException {
		USERNAME.sendKeys(USERNAME1);
		Thread.sleep(1000);
	}

	public void Password(String password) throws InterruptedException {
		PASSWORD.sendKeys(password);
		Thread.sleep(1000);
	}

	public void clickOnLOGIN() throws InterruptedException {
		LOGIN.click();
		Thread.sleep(1000);
	}

	public void clickOnTransaction() throws InterruptedException {
		Transaction.click();
		Thread.sleep(1000);
	}

	public void clickonProjectDetails(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[5]/a"));
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
	}

	public void clickOnProjectDetailsCreation() throws Exception {
		ProjectDetailsCreation.click();
		Thread.sleep(1000);
	}

	public void clickonCashBook() throws InterruptedException {
		CashBook.click();
		Select s = new Select(CashBook);
		s.selectByIndex(1);
		Thread.sleep(2000);
		CashBook.sendKeys(Keys.TAB);

	}

	public void clickOnScheme(String Scheme1) throws InterruptedException {
		Scheme.sendKeys("34");
		Thread.sleep(1000);
	}

	public void clickOnSide() throws InterruptedException {
		SideClick.click();
		Thread.sleep(1000);
	}

	public void clickOnHeadCode() throws InterruptedException {
		HeadCode.click();
		Thread.sleep(1000);
	}

	public void clickonAdminApprovalNumber() throws InterruptedException {
		AdminApprovalNumber.click();
		Select s = new Select(AdminApprovalNumber);
		
		// s.selectByIndex(31); Thread.sleep(1000);
		//*[@id="body_ddlAdminApprovalNo"]/option[32]
		 
		List<WebElement> options = s.getOptions();
		int size= options.size()-1;
		s.selectByIndex(size);
		Thread.sleep(1000);
		
	}

	public void clickOnPANno() throws InterruptedException {
		PANno.click();
		Select s = new Select(PANno);
		s.selectByIndex(0);
		Thread.sleep(1000);
	}

	public void FillPanNumber(String PAN) throws InterruptedException {
		PanNumber.sendKeys(PAN);
		PanNumber.sendKeys(Keys.TAB);
		Thread.sleep(2000);

	}

	public void EnterContractorName(String Name) throws InterruptedException {
		ContractorName.sendKeys(Name);

		Thread.sleep(3000);
	}

	public void EnterWorkName(String WorkName1) throws InterruptedException {
		WorkName.sendKeys(WorkName1);
		Thread.sleep(2000);
	}

	public void EnterWorkOrderNo(String WorkOrder) throws InterruptedException {
		WorkOrderNo.sendKeys(WorkOrder);
		Thread.sleep(2000);
	}

	public void SelectRANumber() throws InterruptedException {
		RANumber.click();
		Select s = new Select(RANumber);
		s.selectByIndex(1);
		Thread.sleep(2000);
	}

	public void clickOnOrderDate() throws InterruptedException {
		OrderDate.click();
		Thread.sleep(1000);
	}

	public void clickOnOrderDateSelect() throws InterruptedException {
		OrderDateSelect.click();
		Thread.sleep(1000);
	}

	public void clickOnEndOrderDate() throws InterruptedException {
		OrderEndDate.click();
		Thread.sleep(1000);
	}

	public void clickOnEndOrderDateSelect() throws InterruptedException {
		OrderEndDateSelect.click();
		Thread.sleep(1000);
	}

	public void EnterTendorAmount(String aaAmount,WebDriver driver, Boolean isvalidAmt) throws InterruptedException {
		TendorAmount.sendKeys(aaAmount);
		Thread.sleep(2000);
		TendorAmount.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		aaAmount = handleBVAForBill(aaAmount,driver,isvalidAmt) ;
		Thread.sleep(2000);
	}

	public void EnterTotalPaidAmount(String PaidAmount) throws InterruptedException {
		TotalPaidAmount.sendKeys(PaidAmount);
		TotalPaidAmount.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void EnterTotalPendingAmount() throws InterruptedException {
		TotalPendingAmount.click();
		Thread.sleep(2000);
	}

	public void clickonOrderCopy(WebDriver driver, String file) throws InterruptedException, AWTException {
		WebElement chooseFile = driver.findElement(By.cssSelector("#FileUpload"));
		chooseFile.sendKeys(file);

	}

	public void clickOnOk() throws InterruptedException {
		Ok.click();

	}

	public void clickOnSave() throws InterruptedException {
		Save.click();
		Thread.sleep(1000);
	}

	public void clickOnSaveYes() throws InterruptedException {
		SaveYes.click();
		Thread.sleep(1000);
	}

	public void ClickOnSaveYesok() throws InterruptedException {
		SaveYesOk.click();
		Thread.sleep(1000);
	}

//			public static void setClipboardData(String string) {
//				//StringSelection is a class that can be used for copy and paste operations.
//				   StringSelection stringSelection = new StringSelection(string);
//				   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//				}
//			
//			public static void uploadFile(String fileLocation) {
//		        try {
//		        	//Setting clipboard with file location
//		            setClipboardData(fileLocation);
//		            //native key strokes for CTRL, V and ENTER keys
//		            Robot robot = new Robot();
//			
//		            robot.keyPress(KeyEvent.VK_CONTROL);
//		            robot.keyPress(KeyEvent.VK_V);
//		            robot.keyRelease(KeyEvent.VK_V);
//		            robot.keyRelease(KeyEvent.VK_CONTROL);
//		            robot.keyPress(KeyEvent.VK_ENTER);
//		            robot.keyRelease(KeyEvent.VK_ENTER);
//		        } catch (Exception exp) {
//		        	exp.printStackTrace();

	////////////// Project Transaction/////////////////
	///// Inward//////
	public void clickOnTransaction1() throws InterruptedException {
		Transaction1.click();
		Thread.sleep(5000);
	}

	public void clickonProjectTransactions(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Project Transactions']"));
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
	}

	public void clickOnProjectInward() throws Exception {
		ProjectInward.click();
		Thread.sleep(1000);
	}

	public void clickOnViewSlip() throws Exception {
		ViewSlip.click();
		Thread.sleep(1000);
	}

	public void clickOnApproveSlip() throws Exception {
		ApproveSlip.click();
		Thread.sleep(1000);
	}

	public void clickOnApproveSlipYes() throws Exception {
		ApproveSlipYes.click();
		Thread.sleep(1000);
	}

	public void clickOnApproveSlipYesOk() throws Exception {
		ApproveSlipYesOk.click();
		Thread.sleep(1000);
	}

	//////////// outward///////////
	public void clickOnTransaction2() throws InterruptedException {
		Transaction2.click();
		Thread.sleep(1000);
	}

	public void clickonProjectTransactions1(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Project Transactions']"));
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
	}

	public void clickOnProjectOutward() throws Exception {
		ProjectOutward.click();
		Thread.sleep(1000);
	}

	public void clickOnViewSlip2() throws Exception {
		ViewSlip2.click();
		Thread.sleep(1000);
	}

	public void clickOnLogOut() throws Exception {
		LogOut.click();
		Thread.sleep(1000);
	}

	public void clickOnLogOutYes() throws Exception {
		LogOutYes.click();
	}

	
	public String handleBVAForBill(String aaAmount, WebDriver driver, Boolean isvalidLimit) throws InterruptedException {
		Thread.sleep(2000);
		if (isvalidLimit) {
			WebElement alertBoxOk = driver.findElement(By.xpath("//*[@id=\"Button1\"]")); 
			alertBoxOk.click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('body_txtNivalTotal').focus();");
		}
		

		return aaAmount;
	}

}
