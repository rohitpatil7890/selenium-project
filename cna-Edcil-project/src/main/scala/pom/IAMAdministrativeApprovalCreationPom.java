package pom;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IAMAdministrativeApprovalCreationPom {

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement USERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement PASSWORD;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement LOGIN;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement transaction;

	@FindBy(xpath = "//body/form[@id='Form1']/div[@class='page-header']/div[@class='page-header-menu']/div[@class='container']/div[@class='hor-menu']/ul[@class='nav navbar-nav']/li[@class='menu-dropdown classic-menu-dropdown open']/ul[@class='dropdown-menu']/li[3]/a[1]")
	public WebElement AAfiledetails;

	@FindBy(xpath = "//a[normalize-space()='Administrative Approval Creation']")
	public WebElement AAcreation;

	@FindBy(xpath = "//select[@id='body_ddlCashBook'][1]")
	public WebElement scheme;

	@FindBy(xpath = "//input[@id='body_txtHeadtype']")
	public WebElement headcode;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[5]/div[2]/div[1]/div[7]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/th[3]")
	public WebElement HCside;

	@FindBy(xpath = "//a[@id='body_grdHeadType_btnHeadCode_0']")
	public WebElement SNheadcode;

	@FindBy(xpath = "//*[@id=\"body_ddlfinancialYear\"]")
	public WebElement FYOsanctionedwork;

	@FindBy(xpath = "//textarea[@id='body_txtCity']")
	public WebElement typeofwork;

	@FindBy(xpath = "//*[@id=\"body_txtGovtDecisionDate\"]")
	public WebElement GDdates;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")
	public WebElement GDdate;

	@FindBy(xpath = "//input[@id='body_txtGovtDecision']")
	public WebElement GDnumber;

	@FindBy(xpath = "//*[@id=\"body_txtPrashaskiyeDate\"]")
	public WebElement AAdates;

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]")
	public WebElement AAdate;

	@FindBy(xpath = "//*[@id=\"body_txtAdminApproNo\"]")
	public WebElement AAno;

	@FindBy(id = "body_txtPramaTotal")
	public WebElement AAamount;

	@FindBy(xpath = "//input[@id='FileUpload']")
	public WebElement AAcopy;

	@FindBy(id = "Button1")
	public WebElement popupok;

	@FindBy(xpath = "//input[@id='body_btnSave']")
	public WebElement save;

	@FindBy(id = "body_btnYes")
	public WebElement alert;

	@FindBy(id = "body_btnRedirect")
	public WebElement success;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement repeattransaction;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[4]/div[3]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]")
	public WebElement AAfileapproval;
	
	@FindBy(xpath = "//a[normalize-space()='Administrative Approval File Approval']")
	public WebElement AAfileapproval1;

	@FindBy(xpath = "//a[normalize-space()='Administrative Approval File Details Inbox']")
	public WebElement AAfileinbox;
	
	
	
	@FindBy(xpath = "//*[@id=\"tblAdminApprovalNoInBox_filter\"]/label/input")
	public WebElement searchBox;
	
	

	
	//*[@id="tblAdminApprovalNoInBox_filter"]/label/input
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a/div")
	public WebElement inboxslip;
	// public WebElement views;

	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement approveslip;

	@FindBy(xpath = "//textarea[@id='body_txtApprove']")
	public WebElement remark;

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement remarkyes;

	@FindBy(xpath = "//input[@id='body_btnRedirect']")
	public WebElement ok;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement againtransaction;

	@FindBy(xpath = "/html[1]/body[1]/form[1]/div[4]/div[3]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[6]/a[1]")
	public WebElement AAfileapprovalrepeat;

	@FindBy(xpath = " //*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[6]/ul/li[2]/a")
	public WebElement AAfileoutbox;
	
	//*[@id="tblAdminApprovalNoOutBox_filter"]/label/input
	
	@FindBy(xpath = "//*[@id=\"tblAdminApprovalNoOutBox_filter\"]/label/input")
	public WebElement searchoutBox;
	
	
	@FindBy(xpath = " //a[normalize-space()='Administrative Approval File Details Outbox']")
	public WebElement AAfileoutbox1;
	
	@FindBy(xpath = "//select[@name='tblAdminApprovalNoOutBox_length']")
	public WebElement showrecord;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement outboxslip;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;

	
	
	// Log In IACHECKER//---------

	//a[normalize-space()='Administrative Approval File Details Inbox']
	

	private WebDriver driver;

	public IAMAdministrativeApprovalCreationPom(WebDriver driver)

	{
		this.driver = driver;
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

	public void clickontransaction() throws InterruptedException {
		transaction.click();
		Thread.sleep(1000);
	}

	public void hoverAAfiledetail(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(AAfiledetails).perform();
	}

	public void AAcreationclick() {
		AAcreation.click();
	}

	public void schemeselect() {
		scheme.click();
		Select s = new Select(scheme);
		s.selectByIndex(1);
	}

	public void headcodesend() throws InterruptedException {
		headcode.sendKeys("34");
		Thread.sleep(1000);
	}

	public void headcodesideclick() throws InterruptedException {
		HCside.click();
		Thread.sleep(2000);
	}

	public void SNheadcodeclick() throws InterruptedException {
		SNheadcode.click();
		Thread.sleep(1000);
	}

	public void financialyear() {
		FYOsanctionedwork.click();
		Select s = new Select(FYOsanctionedwork);
		s.selectByIndex(0);
	}

	public void workname(String work) throws InterruptedException {
		typeofwork.sendKeys(work);
		Thread.sleep(1000);
	}

	public void GDdatesselect() {
		GDdates.click();
	}

	public void GDdateselect() {
		GDdate.click();
	}

	public void GDnumberenter(String number) throws InterruptedException {
		GDnumber.sendKeys(number);
		Thread.sleep(1000);
	}

	public void approvaldatesselect() {
		AAdates.click();
	}

	public void approvaldateselect() {
		AAdate.click();
	}

	public void AAnoenter(String num) throws InterruptedException {

		AAno.sendKeys(num);
		Thread.sleep(1000);
		AAno.sendKeys(Keys.TAB);
	}

	public void AAamountenter(String ammount, WebDriver driver) throws InterruptedException {
		AAamount.sendKeys(ammount);
		AAamount.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		ammount = handleBoundaryValue(ammount, driver);
		Thread.sleep(2000);
	}

	private String handleBoundaryValue(String ammount, WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void AAcopyupload(String file) throws InterruptedException {
		AAcopy.sendKeys(file);
		Thread.sleep(1000);
	}

	public void popupclick() {
		popupok.click();
	}

	public void saveclick() {
		save.click();
	}

	public void alertclick() {
		alert.click();
	}

	public void successclick() {
		success.click();
	}

	public void repeattransectionclick() throws InterruptedException {
		repeattransaction.click();
		Thread.sleep(1000);
	}

	public void hoverAAfileapprovel(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(AAfileapproval).perform();
	}
	
	public void hoverAAfileapprovel1(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(AAfileapproval1).perform();
	}

	public void AAfileinboxclick() throws InterruptedException {
		AAfileinbox.click();
		Thread.sleep(2000);
	}

	public void inboxslipview() {
		inboxslip.click();
	}

	public void approveslipclick() throws InterruptedException {
		approveslip.click();
		Thread.sleep(1000);
	}

	public void remarksend() {
		remark.sendKeys("Approved");
	}

	public void remarkyesclick() {
		remarkyes.click();
	}

	public void okclick() {
		ok.click();
	}

	public void againtransactionclick() throws InterruptedException {
		againtransaction.click();
		Thread.sleep(1000);
	}

	public void hoverAAfileapprovelrepeat(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(AAfileapprovalrepeat).perform();
		Thread.sleep(1000);
	}

	public void AAfileoutboxclick() throws InterruptedException {
		AAfileoutbox.click();
		Thread.sleep(1000);
	}

	public void AAfileoutboxclick1() throws InterruptedException {
		AAfileoutbox1.click();
		Thread.sleep(1000);
	}
	public void showrecordclick() throws InterruptedException {
		showrecord.click();
		Select s = new Select(showrecord);
		s.selectByIndex(3);
		Thread.sleep(1000);
	}

	public void outboxslipview() throws InterruptedException {
		outboxslip.click();
		Thread.sleep(1000);
	}

	public void logoutclick() throws InterruptedException {
		logout.click();
		Thread.sleep(1000);
	}

	public void yeslogoutclick() throws InterruptedException {
		yeslogout.click();
		Thread.sleep(1000);
		
	}
	
	
	public void searchAANumberInbox(Map<String, String> mapAANumber) throws InterruptedException {
		searchBox.sendKeys(mapAANumber.get("aaNumber"));
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	

	public void searchAANumberoutbox(Map<String, String> mapAANumber) throws InterruptedException {
		searchoutBox.sendKeys(mapAANumber.get("aaNumber"));
		Thread.sleep(2000);
		searchoutBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	//// Log In IACHECKER//---------

}
