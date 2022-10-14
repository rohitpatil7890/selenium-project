package pom;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//SUB SCHEME: Research and Development Support-Multi-Disciplinary Research in Science and Technology
//HEAD CODE : 3425.60.200.68.04.11(DOMESTIC TRAVEL EXPENSES)

public class Iamakerbillgenration_headC2 {


 @FindBy(xpath = "//*[@id=\"txtUser\"]")
	 public WebElement USERNAME;
	    
    @FindBy(xpath = "//*[@id=\"txtPass\"]")
	    public WebElement PASSWORD;
	    
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
	    public WebElement LOGIN;
    
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/a")
	public WebElement transaction;
	
	@FindBy(xpath = "//a[normalize-space()='Generate Bill']")
	public WebElement generatebill;
	
	
	//@FindBy(xpath="//*[text()='2022-23']")
	//public  WebElement year;
	
	@FindBy(xpath ="//select[@id='body_ddlfinancialYear']")
	public WebElement selectFeYear;
	

	@FindBy(xpath ="//select[@id='body_ddlGroupCashBook']")
	public WebElement selectScheme;
	
	@FindBy(xpath ="//select[@id='body_ddlCashBook']")
	public WebElement selectSubScheme;
	
	@FindBy(xpath ="//select[@id='body_ddlHeadCode']")
	public WebElement selectHeadCode;
	
	
	
	
	
	
	@FindBy(xpath ="//*[@id=\"body_ddlBillType\"]")
	public WebElement BillType;
	
	@FindBy(xpath ="//*[@id=\"body_ddlSearchLabharthiBy\"]")
	public WebElement SelectTypePAN;
	

	
	@FindBy(xpath ="//input[@id='body_txtSearchLabharthiBy']")
	public WebElement ClickPAN;
	
	//input[@id='body_txtSearchLabharthiBy']
	
	
	
	@FindBy(xpath ="//*[@id=\"body_grdPartyDetails_lnkBtnPartyID_0\"]")
	public WebElement ClickOnSelectVendor;
	
	

	

	
	
	
	
	
	@FindBy(xpath ="//input[@id='body_txtTotalBill']")
	public WebElement billAmount;
	
	@FindBy(xpath ="//input[@id='body_txtBillSequence']")
	public WebElement raNo;
	
	@FindBy(xpath ="//input[@id='body_chkFullnFinal']")
	public WebElement checkboxfullandFinal;
	
	@FindBy(xpath ="//input[@id='body_txtWorks']")
	public WebElement detail;
	
	@FindBy(xpath ="//input[@id='body_txtShera']")
	public WebElement remark;
	
	@FindBy(xpath ="//input[@id='FileUploadBillCopy']")
	public WebElement uploadbillcopy;
		
	@FindBy(id ="body_grdDeduction_txtDeductionAmount_1")
	public WebElement amount;
	
	@FindBy(xpath ="//input[@id='body_btnSave']")
	public WebElement save;
	
	
	@FindBy(id ="Button3")
	public WebElement no;
	
	@FindBy(xpath ="//tbody/tr[1]/td[1]/a[1]/div[1]")  
   // public WebElement inboxslip;
	public WebElement views;
	
	@FindBy(xpath ="//*[@id=\"tblOutbox\"]/thead/tr/th[11]")  
	   // public WebElement inboxslip;
		public WebElement status;
	//*[@id="tblOutbox"]/thead/tr/th[11]
	
	@FindBy(xpath ="//input[@id='body_btnApprove']")
	public WebElement Approve;
	
	@FindBy(xpath ="//textarea[@id='body_txtApprove']")
	public WebElement Remarktext;
	
	//textarea[@id='body_txtApprove']
	
	@FindBy(xpath ="//input[@id='body_btnYes']")
	public WebElement remarkyess;
	
	@FindBy(xpath ="//input[@id='body_btnCancel']")
	public WebElement remarkno;
	
	@FindBy(xpath ="//input[@id='body_btnBack']")
	public WebElement back;
	
	
//	@FindBy(xpath ="//a[normalize-space()='Bill Transactions']")
//	public WebElement Billtransaction;
	
	@FindBy(xpath ="//a[normalize-space()='Bill Outwards']")
	public WebElement BillOutWord;

	@FindBy(id="btnLogout']") //input[@id='btnLogout']
	public WebElement Iamakerlogout;
	
	@FindBy(xpath = "//*[@id=\"btnYesLogout\"]") //*[@id="body_grdApprovalPending_chkApproval_54"]
	public WebElement Iamakerlogoutyes;
	//*[@id="btnYesLogout"]
	
	 @FindBy(xpath = "//*[@id=\"txtUser\"]")
	    public WebElement IAChekerlogin;
	 
	 @FindBy(xpath = "//*[@id=\"txtPass\"]")
	    public WebElement IAChekerpassword;
	 @FindBy(xpath = "//*[@id=\"btnLogin\"]")
	    public WebElement IAChekerlOGIN;
	 @FindBy(xpath = "//a[normalize-space()='Transaction']")
	 public WebElement IACtransaction;

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
	 public WebElement remarkk;

	 @FindBy(xpath = "//input[@id='body_btnYes']")
	 public WebElement remarkyes;

	 @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/a")  //*[@id="Form1"]/div[4]/div[3]/div/div/ul/li[1]/a
	 public WebElement IACtransaction1;
	 
	//a[normalize-space()='Transaction']

	 @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[1]/a")
	 public WebElement BillTransection1;

	 @FindBy(xpath = "//a[normalize-space()='Bill Outwards']")
	 public WebElement BillOutwords;

	 @FindBy(xpath = "//*[@id=\"tblOutbox_length\"]/label/select")
	 public WebElement showrecord1;

	 @FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	 public WebElement outwordslip;

	 @FindBy(xpath = "//input[@id='btnLogout']")
	 public WebElement logout;

	 @FindBy(xpath = "//input[@id='btnYesLogout']")
	 public WebElement yeslogout;

	
	public Iamakerbillgenration_headC2(WebDriver driver)

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
	public void clickontransaction() throws InterruptedException {
		transaction.click();
		Thread.sleep(1000);
	}
	
	public void clickgeneratebill() throws InterruptedException {
		generatebill.click();
		Thread.sleep(1000);
	}
	public void clickOnFY() throws InterruptedException {
		selectFeYear.click();
		Thread.sleep(1000);
	}
	public void clickOnScheme() throws InterruptedException {
		selectScheme.click();
		Thread.sleep(1000);
	}
	public void clickOnSubScheme() throws InterruptedException {
		selectSubScheme.click();
		Select s=new Select(selectSubScheme);
		s.selectByIndex(1);
		Thread.sleep(1000);
	}
	public void clickOnHeadCode() throws InterruptedException {
		selectHeadCode.click();
		Select s=new Select(selectHeadCode);
		s.selectByIndex(2);
		Thread.sleep(1000);
	}
	
	
	public void BillTypee() throws InterruptedException {
		BillType.click();
		Select s=new Select(BillType);
		s.selectByIndex(1);
		
		
		Thread.sleep(2000);
	
	}
	public void ClickOnTypePAN() throws InterruptedException {
		SelectTypePAN.click();
		Select s=new Select(SelectTypePAN);
		s.selectByIndex(0);
		SelectTypePAN.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}
	
	public void clickselectPAN(String pan) throws InterruptedException {
		ClickPAN.sendKeys(pan);
		ClickPAN.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}
	public void clickselectVender() throws InterruptedException {
		ClickOnSelectVendor.click();
		Thread.sleep(1000);
	}

	
	public void enterbillAmount(String billamt) throws InterruptedException {
		billAmount.sendKeys(billamt);
		
		Thread.sleep(1000);
	}
	
	public void enterraNo(String ranum) throws InterruptedException {
		raNo.sendKeys(ranum);
		Thread.sleep(1000);
	}
	
	public void enablecheckboxfullandFinal() throws InterruptedException {
		checkboxfullandFinal.isEnabled();
		Thread.sleep(1000);
	}
	
	public void enterdetail(String done) throws InterruptedException {
		detail.sendKeys(done);
		Thread.sleep(1000);
	}
	
	public void enterremark(String ok) throws InterruptedException {
		remark.sendKeys(ok);
		Thread.sleep(1000);
	}
	
	public void fileuploadbillcopy(String file1) throws InterruptedException {

		uploadbillcopy.sendKeys(file1);
		Thread.sleep(1000);
	}
	
	
	
	
//	public void fileuploadAuditcopy(String file2) {
//		uploadAuditcopy.sendKeys("E:\\Oxford Dictionary of Idioms (Judith Siefring) (z-lib.org).pdf");
//	}
//	
	public void amount(String amt) throws InterruptedException {
	amount.sendKeys(amt);
	Thread.sleep(1000);
	}

	public void Save() throws InterruptedException {
		
		
		save.click();
		Thread.sleep(1000);
}
//	
//	public void no() {
//	
//		no.clear();
//		
//	}
	
	public void viewSlip() throws InterruptedException
	{
		Thread.sleep(4000);
		views.click();
	}
	
	public void Status() throws InterruptedException
	{
		Thread.sleep(4000);
		status.click();
	}
	
	
	//*[@id="tblOutbox"]/thead/tr/th[11]
	
	public void Approve() throws InterruptedException
	{
		Thread.sleep(1000);
		Approve.click();
		Thread.sleep(1000);
	}
	
	public void RemarkText(String text) {
		
		Remarktext.sendKeys(text);
	}
	
	public void Remarksyes() throws InterruptedException
	{
		Thread.sleep(1000);
		remarkyess.click();
	}
	
	public void Remarkyess() throws InterruptedException
	{
		Thread.sleep(1000);
		remarkyess.click();
	}
	
//	public void RemarkNo()
//	{
//		
//		remarkno.click();
//	}

	public void Back()
	{
		
		back.click();
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
	
	
	public void LogOutIAmaker() throws InterruptedException
	{
		
		Iamakerlogout.click();
		Thread.sleep(1000);
	}
	
	public void IamakerlogoutYes() throws InterruptedException
	{
		Iamakerlogoutyes.click();
		Thread.sleep(1000);
	}
	
	public void IAChekerLogin(String IAChekerLogin)
	{
		
		IAChekerlogin.sendKeys(IAChekerLogin);
	}
	
	public void IAChekerPassword(String Password) {
		
		IAChekerpassword.sendKeys(Password);
	}
	
	public void IAChekerLOGIN() {
		
		IAChekerlOGIN.click();
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
		remarkk.sendKeys("Approved");
		Thread.sleep(1000);
	}

	public void remarkyesclick() throws InterruptedException {
		remarkyes.click();
		Thread.sleep(2000);
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

	public void yeslogoutclick() throws InterruptedException {
		yeslogout.click();
		Thread.sleep(1000);
	}

	
	
}




 



