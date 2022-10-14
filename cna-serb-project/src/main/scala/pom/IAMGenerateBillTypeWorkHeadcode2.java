package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IAMGenerateBillTypeWorkHeadcode2 {

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

	@FindBy(xpath = "//*[@id=\"body_grdPartyDetails_lnkBtnPartyID_0\"]")
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

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
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

	public IAMGenerateBillTypeWorkHeadcode2(WebDriver driver)

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

	public void clickselectBillType() {
		selectBillType.click();
		Select s = new Select(selectBillType);
		s.selectByIndex(2);

	}

	public void Pannoenter(String pan) {
		PanNo.sendKeys(pan);

	}

	public void sideclick() {
		side.click();

	}

	public void selectvendornameclick() {
		selectvendorname.click();

	}

	public void AAnumberclick() {
		AAnumber.click();
		Select s = new Select(AAnumber);
		s.selectByIndex(1);

	}

	public void WorkOrderNoclick() {
		WorkOrderNo.click();
		Select s = new Select(WorkOrderNo);
		s.selectByIndex(1);

	}

	public void Billamountclick() {
		Billamount.sendKeys("1000");
	}

	public void Remarksend() {
		Remark.sendKeys("done");
	}

	public void UploadcopySend() {
		Uploadbillcopy.sendKeys("C:\\Users\\omkar.omanwar\\Desktop\\Demo Pdf.pdf");
	}

	public void okclick() {
		ok.click();
	}

	public void educationcesssend() {
		educationcess.sendKeys("500");
	}

	public void secondoryesssend() {
		secondoryess.sendKeys("500");
	}

	public void SecurityDepositsend() {
		SecurityDeposit.sendKeys("500");
	}

	public void StampDutysend() {
		StampDuty.sendKeys("500");
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
		Thread.sleep(1000);
		remarkyess.click();
	}

	public void Remarkyess() throws InterruptedException {
		Thread.sleep(1000);
		remarkyess.click();
	}

//	public void RemarkNo()
//	{
//		
//		remarkno.click();
//	}

	public void Back() {

		back.click();
	}

	public void clickontransaction() {

		transection.click();
	}

	public void BillTransaction(WebDriver driver) {

		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Bill Transactions']"));
		action.moveToElement(ele).perform();
	}

	public void BillOutWords()

	{

		BillOutWord.click();
	}

	public void recordclick() {
		recordall.click();
		Select s = new Select(recordall);
		s.selectByIndex(4);
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
