package pom;

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

public class IAMGenerateBillTypeWork {

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement USERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement PASSWORD;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement LOGIN;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement Transection;

	@FindBy(xpath = "//a[normalize-space()='Generate Bill']")
	public WebElement GenerateBill;

	@FindBy(xpath = "//option[normalize-space()='2022-23']")
	public WebElement selectFeYear;

	@FindBy(xpath = "//select[@id='body_ddlHeadCode']")
	public WebElement selectHeCode1;

	@FindBy(xpath = "//select[@id='body_ddlHeadCode']")
	public WebElement selectHeCode2;

	@FindBy(xpath = "//select[@id='body_ddlCashBook']")
	public WebElement selectsubscheme1;

	@FindBy(xpath = "//select[@id='body_ddlCashBook']")
	public WebElement selectsubscheme2;

	@FindBy(xpath = "//select[@id='body_ddlBillType']")
	public WebElement selectBillType;

	@FindBy(xpath = "//input[@id='body_txtSearchLabharthiBy']")
	public WebElement PanNo;

	@FindBy(xpath = "//span[@id='body_lblReceiptAmt']")
	public WebElement side;

	@FindBy(id = "body_grdPartyDetails_lnkBtnPartyID_0")  
	public WebElement selectvendorname;

	@FindBy(xpath = "//select[@id='body_ddlPramaNumber']")
	public WebElement AAnumber;

	@FindBy(xpath = "//select[@id='body_ddlWorKOrder']")
	public WebElement WorkOrderNo;

	@FindBy(xpath = "//input[@id='body_txtTotalBill']")
	public WebElement Billamount;

	@FindBy(xpath = "//input[@id='body_txtShera']")
	public WebElement Remark;

	@FindBy(xpath = "//input[@id='FileUploadBillCopy']")
	public WebElement Uploadbillcopy;

	@FindBy(css = "#body_Button1")
	public WebElement ok;

	@FindBy(css = "#body_grdDeduction_txtDeductionAmount_1")
	public WebElement educationcess;

	@FindBy(css = "#body_grdDeduction_txtDeductionAmount_2")
	public WebElement secondoryess;

	@FindBy(css = "#body_grdDeduction_txtDeductionAmount_3")
	public WebElement SecurityDeposit;

	@FindBy(css = "#body_grdDeduction_txtDeductionAmount_4")
	public WebElement StampDuty;

	@FindBy(xpath = "//input[@id='body_btnSave']")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='body_btnSaveRecord']")
	public WebElement SaveYes;

	@FindBy(xpath = "//div[@id='body_upMain']//input[@id='body_btnYES']")
	public WebElement Succes;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	// public WebElement inboxslip;
	public WebElement views;

	@FindBy(xpath = "//*[@id=\"tblOutbox\"]/thead/tr/th[11]")
	// public WebElement inboxslip;
	public WebElement status;
	// *[@id="tblOutbox"]/thead/tr/th[11]

	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement Approve;

	@FindBy(xpath = "//textarea[@id='body_txtApprove']")
	public WebElement Remarktext;

	// textarea[@id='body_txtApprove']

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement remarkyess;

	@FindBy(xpath = "//input[@id='body_btnCancel']")
	public WebElement remarkno;

	@FindBy(xpath = "//input[@id='body_btnBack']")
	public WebElement back;

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/a")
	public WebElement transection;

	@FindBy(xpath = "//a[normalize-space()='Bill Transactions']")
	public WebElement Billtransaction;

	@FindBy(xpath = "//a[normalize-space()='Bill Outwards']")
	public WebElement BillOutWord;

	@FindBy(xpath = "//select[@name='tblOutbox_length']")
	public WebElement recordall;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement outwardslip;

	@FindBy(xpath = "//*[@id=\"btnLogout\"]") // *[@id="body_grdApprovalPending_chkApproval_54"]
	public WebElement Iamakerlogout;

	@FindBy(xpath = "//*[@id=\"btnYesLogout\"]") // *[@id="body_grdApprovalPending_chkApproval_54"]
	public WebElement Iamakerlogoutyes;
	// *[@id="btnYesLogout"]
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[1]/a")
	public WebElement BillTransection;
	
	@FindBy(xpath = "//a[normalize-space()='Bill Inwards']")
	public WebElement BillInwards;
	
	@FindBy(xpath = "//select[@name='tblBillApproval_length']")
	public WebElement showrecord;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement inwerdslip;
	
	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement approveslip;

	@FindBy(xpath = "//textarea[@id='body_txtApprove']")
	public WebElement remark;

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement remarkyes;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement IACtransaction1;
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[1]/a")
	public WebElement BillTransection1;
	
	@FindBy(xpath = "//a[normalize-space()='Bill Outwards']")
	public WebElement BillOutwords;
	
	@FindBy(xpath = "//*[@id=\"tblOutbox_length\"]/label/select")
	public WebElement showrecord1;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement outwordslip;
	//*[@id="btnLogout"]//*[@id="btnLogout"]//*[@id="btnLogout"]
	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;
	//*[@id="btnLogout"]
	@FindBy(xpath = "//*[@id=\"btnLogout\"]")
	public WebElement logout1;
	
	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;
	

	public IAMGenerateBillTypeWork(WebDriver driver)

	{
		PageFactory.initElements(driver, this);

	}

	public void Username(String USERNAME1) {
		USERNAME.sendKeys(USERNAME1);
	}

	public void Password(String password) {
		PASSWORD.sendKeys(password);
	}

	public void clickOnLOGIN() {
		LOGIN.click();
	}

	public void clicktransection() {
		Transection.click();
	}

	public void ClickGeneratebill() {
		GenerateBill.click();
	}

	public void clicksubscheme1() {
		selectsubscheme1.click();
		Select s = new Select(selectsubscheme1);
		s.selectByIndex(1);
	}

	public void clicksubscheme2() {
		selectsubscheme2.click();
		Select s = new Select(selectsubscheme2);
		s.selectByIndex(2);
	}

	public void clickselectFeYear() {
		selectFeYear.click();

	}

	public void clickselectHeCode1() {
		selectHeCode1.click();
		Select s = new Select(selectHeCode1);
		s.selectByIndex(1);
	}

	public void clickselectHeCode2() {
		selectHeCode2.click();
		Select s = new Select(selectHeCode2);
		s.selectByIndex(2);
	}

	public void clickselectBillType() throws InterruptedException {
		selectBillType.click();
		Select s = new Select(selectBillType);
		s.selectByIndex(2);
		Thread.sleep(1000);

	}

	public void Pannoenter(String pan) {
		PanNo.sendKeys(pan);

	}

	public void sideclick() throws InterruptedException {
		side.click();
		Thread.sleep(2000);

	}

	public void selectvendornameclick() throws InterruptedException {
		selectvendorname.click();
		Thread.sleep(2000);

	}
	

	public void AAnumberclick() throws InterruptedException {
		AAnumber.click();
		Thread.sleep(1000);
		Select s = new Select(AAnumber);
		//s.selectByVisibleText("8888");
		List<WebElement> options = s.getOptions();
		int size= options.size()-1;
		s.selectByIndex(size);
		Thread.sleep(1000);

	}

	public void WorkOrderNoclick() throws InterruptedException {
		WorkOrderNo.click();
		Select s = new Select(WorkOrderNo);
		List<WebElement> options = s.getOptions();
		int size= options.size()-1;
		s.selectByIndex(size);
		Thread.sleep(1000);

	}

	public void Billamountclick(String billamt,WebDriver driver, Boolean isvalidAmt) throws InterruptedException {
		
		Billamount.sendKeys(billamt);
		Thread.sleep(1000);
		Billamount.sendKeys(Keys.TAB);
		billamt = handleBVAForBill(billamt,driver,isvalidAmt) ;
		Thread.sleep(1000);
	}

	public void Remarksend() throws InterruptedException {
		Remark.sendKeys("done");
		Thread.sleep(1000);
	}

	public void UploadcopySend(String uploadFilePath) throws InterruptedException {
		Uploadbillcopy.sendKeys(uploadFilePath);
		Thread.sleep(1000);
	}

	public void okclick() throws InterruptedException {
		ok.click();
		Thread.sleep(1000);
	}

	public void educationcesssend() throws InterruptedException {
		educationcess.sendKeys("5");
		Thread.sleep(1000);
	}

	public void secondoryesssend() throws InterruptedException {
		secondoryess.sendKeys("5");
		Thread.sleep(1000);
	}

	public void SecurityDepositsend() {
		SecurityDeposit.sendKeys("5");
	}

	public void StampDutysend() {
		StampDuty.sendKeys("5");
	}

	public void clickOnSave() throws InterruptedException {
		Save.click();
		Thread.sleep(1000);
	}

	public void clickOnSaveYes() throws InterruptedException {
		SaveYes.click();
		Thread.sleep(1000);
	}

	public void Succesclick() throws InterruptedException {
		Succes.click();
		Thread.sleep(1000);
	}

	public void viewSlip() throws InterruptedException {
		Thread.sleep(4000);
		views.click();
	}

	public void Status() throws InterruptedException {
		Thread.sleep(4000);
		status.click();
	}

	// *[@id="tblOutbox"]/thead/tr/th[11]

	public void Approve() throws InterruptedException {
		Thread.sleep(1000);
		Approve.click();
		Thread.sleep(1000);
	}

	public void RemarkText(String text) {

		Remarktext.sendKeys(text);
	}

	public void Remarksyes() throws InterruptedException {
		remarkyess.click();
		
	}

	

//	public void RemarkNo()
//	{
//		
//		remarkno.click();
//	}

	/*
	 * public void Back() throws InterruptedException {
	 * 
	 * back.click(); Thread.sleep(1000); }
	 */

	public void clickontransaction() throws InterruptedException {

		transection.click();
		Thread.sleep(3000);
	}

	public void BillTransaction(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Bill Transactions']"));
		action.moveToElement(ele).perform();
		Thread.sleep(1000);
	}

	public void BillOutWords()

	{

		BillOutWord.click();
	}

	public void recordclick() throws InterruptedException {
		recordall.click();
		Select s = new Select(recordall);
		s.selectByIndex(4);
		Thread.sleep(1000);
	}

	public void outwardslipview() throws InterruptedException

	{

		outwardslip.click();
		Thread.sleep(3000);
	}

	public void LogOutIAmaker() throws InterruptedException {

		Iamakerlogout.click();
		Thread.sleep(1000);
	}

	public void IamakerlogoutYes() throws InterruptedException {
		Iamakerlogoutyes.click();
		Thread.sleep(1000);
	}
	
	public void hoverBillTransection(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(BillTransection).perform();
	}
	
	public void BillInwardsclick() throws InterruptedException {
		BillInwards.click();
		Thread.sleep(1000);
	}
	
	public void showrecordclick() throws InterruptedException {
		showrecord.click();
		Select s = new Select(showrecord);
		s.selectByIndex(4);
		Thread.sleep(2000);
	}
	
	public void inwerdslipclick() throws InterruptedException {
		inwerdslip.click();
		Thread.sleep(2000);
	}
	
	public void approveslipclick() throws InterruptedException {
		approveslip.click();
		Thread.sleep(2000);
	}

	public void remarksend() throws InterruptedException {
		remark.sendKeys("Approved");
		Thread.sleep(1000);
	}

	public void remarkyesclick() throws InterruptedException {
		remarkyes.click();
	}
	
	public void IACtransaction1click() throws InterruptedException {
		IACtransaction1.click();
		Thread.sleep(2000);
	}
	
	public void hoverBillTransection1(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(BillTransection1).perform();
	}
	
	public void BillOutwordsclick() throws InterruptedException {
		BillOutwords.click();
		Thread.sleep(2000);
	}
	
	public void showrecordclick1() throws InterruptedException {
		showrecord1.click();
		Select s = new Select(showrecord1);
		s.selectByIndex(4);
		Thread.sleep(2000);
	}
	
	public void outwordslipclick() throws InterruptedException {
		outwordslip.click();
		Thread.sleep(2000);
	}
	
	public void logoutclick() throws InterruptedException {
		logout.click();
		Thread.sleep(2000);
	}
	
	
	public void logoutclick1() throws InterruptedException {
		logout1.click();
		Thread.sleep(2000);
	}
	
	
	public void yeslogoutclick() throws InterruptedException {
		yeslogout.click();
		Thread.sleep(1000);
	}
	
	
	
	public String handleBVAForBill(String budgetAmount, WebDriver driver, Boolean isvalidLimit) throws InterruptedException {
		Thread.sleep(2000);
		if (isvalidLimit) {
			WebElement alertBoxOk = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button")); 
			alertBoxOk.click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('body_txtTotalBill').focus();");
		}
		

		return budgetAmount;
	}

//	public void scroolby() {
//	
//
//	 WebDriver driver = null;
//	WebElement scroll = driver.findElement(By.xpath("//div[@id='gvLocationHorizontalRail']"));
//	  JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(250,0)", "");
//	    
//	}
}
