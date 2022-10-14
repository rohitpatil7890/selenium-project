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

	public void clickIacreation() throws InterruptedException {
		Iacreation.click();
		Thread.sleep(1000);
	
	}

	public void enterIaname(String name) throws InterruptedException {
		Ianame.sendKeys(name);
		Thread.sleep(1000);
	}

	public void enterIfsc(String code) throws InterruptedException {
		ifsccode.sendKeys(code);
		ifsccode.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterbankaccountno(String accountno) throws InterruptedException {
		bankaccountno.sendKeys(accountno);
		bankaccountno.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void enterconfirmaccountno(String confirmno) throws InterruptedException {
		confirmaccountno.sendKeys(confirmno);
		confirmaccountno.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void clicksubmit() throws InterruptedException {
		submit.click();
		Thread.sleep(1000);
	}

	public void clickyes() throws InterruptedException {
		IAyes.click();
		Thread.sleep(1000);
	}

	public void clickok() throws InterruptedException {
		ok.click();
		Thread.sleep(1000);
	}

	public void clicklogout() throws InterruptedException {
		logout.click();
		Thread.sleep(1000);
	}

	public void clickyeslogout() throws InterruptedException {
		yeslogout.click();
		Thread.sleep(1000);
	}

	public void Username1(String USERNAME2) throws InterruptedException {
		USERNAME.sendKeys(USERNAME2);
		Thread.sleep(1000);
	}

	public void Password1(String password) throws InterruptedException {
		PASSWORD.sendKeys(password);
		Thread.sleep(1000);
	}

	public void clickOnLOGIN1() throws InterruptedException {
		LOGIN.click();
		Thread.sleep(1000);
	}

	public void clicksetup1() throws InterruptedException {
		setup.click();
		Thread.sleep(1000);
	}

	public void clickIaapproval() throws InterruptedException {
		Iaapproval.click();
		Thread.sleep(1000);
	}

	public void clickapprove() throws InterruptedException {
		approve.click();
		Thread.sleep(1000);
	}

	public void clickbtnapprove() throws InterruptedException {
		btnapprove.click();
		Thread.sleep(1000);
	}

	public void clickokapprove() throws InterruptedException {
		okapprove.click();
		Thread.sleep(1000);
	}

	public void clicksucces() throws InterruptedException {
		succes.click();
		Thread.sleep(1000);
	}

	public void clicklogout1() throws InterruptedException {
		logout.click();
		Thread.sleep(1000);
	}

	public void clickyeslogout1() throws InterruptedException {
		yeslogout.click();
		Thread.sleep(1000);
	}

}
