package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IAcreationPom {

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement USERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement PASSWORD;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement LOGIN;

	@FindBy(xpath = "//a[normalize-space()='Setup']")
	public WebElement setup;

	@FindBy(xpath = "//a[normalize-space()='IA Creation']")
	public WebElement Iacreation;

	@FindBy(xpath = "//input[@id='body_txtIAName']")
	public WebElement Ianame;

	@FindBy(xpath = "//input[@id='body_txtIFSC']")
	public WebElement ifsccode;

	@FindBy(xpath = "//input[@id='body_txtAccountNo']")
	public WebElement bankaccountno;

	@FindBy(xpath = "//input[@id='body_txtConfirmAccount']")
	public WebElement confirmaccountno;

	@FindBy(xpath = "//*[@id=\"body_btnSubmit\"]")
	public WebElement submit;

	@FindBy(xpath = "//input[@id='body_btnModalOK']")
	public WebElement IAyes;

	@FindBy(xpath = "//input[@id='body_Button1']")
	public WebElement ok;

	@FindBy(xpath = "//*[@id=\"btnLogout\"]")  
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement USERNAME1;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement PASSWORD1;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement LOGIN1;

	@FindBy(xpath = "//a[normalize-space()='Setup']")
	public WebElement setup1;

	@FindBy(xpath = "//a[normalize-space()='IA Approval']")
	public WebElement Iaapproval;

	@FindBy(xpath = "(//input[@id='body_grdApprovalPending_chkApproval_16'])[1]") // change
	public WebElement approve;

	@FindBy(xpath = " //input[@id='body_btnApprove']")
	public WebElement btnapprove;

	@FindBy(xpath = " //input[@id='body_btnOK']")
	public WebElement okapprove;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout1;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout1;

	@FindBy(xpath = "//input[@id='body_btnRedirectPartyApproval']")
	public WebElement succes;

	public IAcreationPom(WebDriver driver)

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

	public void clicksetup() {
		setup.click();
	}

	public void clickIacreation() {
		Iacreation.click();
	}

	public void enterIaname(String name) {
		Ianame.sendKeys(name);
	}

	public void enterIfsc(String code) {
		ifsccode.sendKeys(code);
		ifsccode.sendKeys(Keys.TAB);
	}

	public void enterbankaccountno(String accountno) {
		bankaccountno.sendKeys(accountno);
		bankaccountno.sendKeys(Keys.TAB);
	}

	public void enterconfirmaccountno(String confirmno) {
		confirmaccountno.sendKeys(confirmno);
		confirmaccountno.sendKeys(Keys.TAB);
	}

	public void clicksubmit() {
		submit.click();
	}

	public void clickyes() {
		IAyes.click();
	}

	public void clickok() {
		ok.click();
	}

	public void clicklogout() {
		logout.click();
	}

	public void clickyeslogout() {
		yeslogout.click();
	}

	public void Username1(String USERNAME2) {
		USERNAME.sendKeys(USERNAME2);
	}

	public void Password1(String password) {
		PASSWORD.sendKeys(password);
	}

	public void clickOnLOGIN1() {
		LOGIN.click();
	}

	public void clicksetup1() {
		setup.click();
	}

	public void clickIaapproval() {
		Iaapproval.click();
	}

	public void clickapprove() {
		approve.click();
	}

	public void clickbtnapprove() {
		btnapprove.click();
	}

	public void clickokapprove() {
		okapprove.click();
	}

	public void clicksucces() {
		succes.click();
	}

	public void clicklogout1() {
		logout.click();
	}

	public void clickyeslogout1() {
		yeslogout.click();
	}

}
