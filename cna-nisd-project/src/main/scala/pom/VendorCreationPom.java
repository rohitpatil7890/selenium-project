
package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorCreationPom {

	WebDriver driverw;

	@FindBy(name = "txtUser")
	public WebElement USERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement PASSWORD;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement LOGIN;

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
	public WebElement master;

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/ul/li[1]/a") 
	public WebElement vendorceation;

	@FindBy(xpath = "//*[@id=\"body_txtPartyName\"]")
	public WebElement Name;

	@FindBy(xpath = "//*[@id=\"body_txtMobile\"]")
	public WebElement mobile;

	@FindBy(xpath = "//*[@id=\"body_txtEmail\"]")
	public WebElement email;

	@FindBy(xpath = "//*[@id=\"body_txtAddress\"]")
	public WebElement address;

	@FindBy(xpath = "//*[@id=\"body_txtPinCode\"]")
	public WebElement pincode;

	@FindBy(xpath = "//*[@id=\"body_txtCity\"]")
	public WebElement city;

	@FindBy(xpath = "//*[@id=\"body_txtPANNO\"]")
	public WebElement pan;

	@FindBy(xpath = "//*[@id=\"body_txtTANNO\"]")
	public WebElement Tan;

	@FindBy(xpath = "//*[@id=\"body_txtGSTNO\"]")
	public WebElement GST;

	@FindBy(xpath = "//*[@id=\"body_txtAdhar\"]")
	public WebElement adhar;

	@FindBy(xpath = "//*[@id=\"body_txtIFSC\"]")
	public WebElement IFSC;

	@FindBy(xpath = "//*[@id=\"body_txtMICR\"]")
	public WebElement MICR;

	@FindBy(xpath = "//*[@id=\"body_txtBankName\"]")
	public WebElement Bank;

	@FindBy(xpath = "//*[@id=\"body_txtBranchName\"]")
	public WebElement Branch;

	@FindBy(id = "body_txtAccountNo") 
	public WebElement Account;

	@FindBy(xpath = "//*[@id=\"body_txtConfirmAccount\"]")
	public WebElement ConfirmAccount;

	@FindBy(xpath = "//*[@id=\"FileUploadPassbook\"]")
	public WebElement Passbook;


	@FindBy(xpath = "//*[@id=\"body_btnHide\"]")
	public WebElement ok;

	@FindBy(xpath = "//*[@id=\"body_btnSubmit\"]") 
	public WebElement Save;

	@FindBy(xpath = "//a[normalize-space()='Vendor Approval']")
	public WebElement vendorapproval;

	@FindBy(xpath = "//*[@id=\"body_grdApprovalPending_chkApproval_61\"]")
	public WebElement Tickmark;

	@FindBy(xpath = "//*[@id=\"body_btnApprove\"]") 
	public WebElement Approval; 
	
	@FindBy(xpath = "//*[@id=\"body_btnOK\"]") 
	public WebElement Approvalyes; 

	@FindBy(xpath = "//*[@id=\"body_btnRedirectPartyApproval\"]") 
	public WebElement Approvalok;
	
	@FindBy(name = "ctl00$body$btnNo") 
	public WebElement ApprovalNo;

	@FindBy(xpath = "//input[@id='btnLogout']") 
	public WebElement Iamakerlogout; 

	@FindBy(xpath = "//*[@id=\"btnYesLogout\"]") 
	public WebElement Iamakerlogoutyes;
	

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement IAChekerlogin;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement IAChekerpassword;
	
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement IAChekerlOGIN;

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/ul/li[2]/a")
	public WebElement vendoraproval;



	public VendorCreationPom(WebDriver driverwr)
	{
		driverw = driverwr;
		PageFactory.initElements(driverwr, this);
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

	public void clickOnmaster() throws InterruptedException {
		master.click();
		Thread.sleep(2000);
	}

	public void ClickOnvendorcreation() throws InterruptedException {
		vendorceation.click();
		Thread.sleep(1000);
	}

	public void vendorName(String Name1) throws InterruptedException {
		Name.sendKeys(Name1);
		Name.sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}
	public void entermobile(String Number) throws InterruptedException {
		mobile.sendKeys(Number);
		Thread.sleep(1000);
		mobile.sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}

	public void enterEmail(String email1) throws InterruptedException {
		email.sendKeys(email1);
		email.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterAddress(String address1) throws InterruptedException {
		address.sendKeys(address1);
		Thread.sleep(2000);
		address.sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}

	public void enterPinCode(String pincode1) throws InterruptedException {
		pincode.sendKeys(pincode1);
		Thread.sleep(2000);
		pincode.sendKeys(Keys.TAB);
		Thread.sleep(3000);
	}

	public void enterCity(String city1) throws InterruptedException {
		city.sendKeys(city1);
		Thread.sleep(2000);
		city.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterPan(String pan1) throws InterruptedException {
		pan.sendKeys(pan1);
		Thread.sleep(2000);
		pan.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterTan(String tan1) throws InterruptedException {
		Tan.sendKeys(tan1);
		Thread.sleep(2000);
		Tan.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterGSTno(String gst) throws InterruptedException {
		GST.sendKeys(gst);
		GST.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterAdhar(String adhar1) throws InterruptedException {
		adhar.sendKeys(adhar1);
		Thread.sleep(2000);
		adhar.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterIFSCCODE(String ifsc) throws InterruptedException {
		IFSC.sendKeys(ifsc);
		Thread.sleep(2000);
		IFSC.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterIFSCMICR(String micr) throws InterruptedException {
		MICR.sendKeys(micr);
		Thread.sleep(2000);
		MICR.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterBankName(String bank1) throws InterruptedException {
		Bank.sendKeys(bank1);
		Bank.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
	}

	public void enterBranchName(String branch) throws InterruptedException {
		Branch.sendKeys(branch);
		Thread.sleep(1000);
		Branch.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterAccountNO(String account) throws InterruptedException {
		Account.sendKeys(account);
		Thread.sleep(2000);
		Account.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

	public void enterConfirmAccountNO(String Confirmaccount) throws InterruptedException {
		ConfirmAccount.sendKeys(Confirmaccount);
		Thread.sleep(2000);
		ConfirmAccount.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void passbookupload(String passbook) throws InterruptedException {
		Thread.sleep(1000);
		Passbook.sendKeys(passbook);
		Passbook.sendKeys(Keys.TAB);
		// Thread.sleep(2000);
	}

	public void clickOnLoginBtn() throws InterruptedException {
		Thread.sleep(1000);
		Save.click();

	}

	public void Ok() throws InterruptedException {
		Thread.sleep(1000);
		ok.click();

	}

	public void vendorApproval() throws InterruptedException {
		vendorapproval.click();
		Thread.sleep(2000);
	}

	public void TickmarkApproval() throws InterruptedException {
		Tickmark.click();
		Thread.sleep(1000);
	}

	public void approval() throws InterruptedException {
		Approval.click();
		Thread.sleep(1000);
	}

	public void Approvalyes() throws InterruptedException {
		Approvalyes.click();
		Thread.sleep(5000);
		// Approvalyes.sendKeys(Keys.TAB);

	}

	public void ApprovalOk() throws InterruptedException {
		Thread.sleep(5000);
		Approvalok.click();
		Thread.sleep(1000);
	}

	public void ApprovalNo() throws InterruptedException {
		ApprovalNo.click();
		Thread.sleep(1000);
	}
//	public void ApprovalOkk() throws InterruptedException {
//		try {
//			Approvalok.click();
//		} catch (StaleElementReferenceException e) {
//			Approvalok.click();
//
//		}
//		// Thread.sleep(1000);
//	}

	public void clickk() throws InterruptedException {
		Thread.sleep(3000);
		Approvalok.click();

	}

	public void LogOutIAmaker() throws InterruptedException {

		Iamakerlogout.click();
		Thread.sleep(3000);
	}

	public void IamakerlogoutYes() throws InterruptedException {
		Iamakerlogoutyes.click();
		Thread.sleep(1000);
	}

	public void IAChekerLogin(String IAChekerLogin) throws InterruptedException {
		IAChekerlogin.sendKeys(IAChekerLogin);
		Thread.sleep(2000);
	}

	public void IAChekerPassword(String Password) throws InterruptedException {
		IAChekerpassword.sendKeys(Password);
		Thread.sleep(2000);
	}

	public void IAChekerLOGIN() throws InterruptedException {
		IAChekerlOGIN.click();
		Thread.sleep(2000);
	}

	public void VendorAproval() throws InterruptedException {
		Thread.sleep(2000);
		vendoraproval.click();
	}

	public void LogOutCAmaker() throws InterruptedException {
		Iamakerlogout.click();
		Thread.sleep(3000);
	}

	public void CamakerlogoutYes() throws InterruptedException {
		Iamakerlogoutyes.click();
		Thread.sleep(1000);
	}
}

