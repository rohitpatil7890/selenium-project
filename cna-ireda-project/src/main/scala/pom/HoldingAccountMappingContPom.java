package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class HoldingAccountMappingContPom {

	 @FindBy(xpath = "//*[@id=\"txtUser\"]")
		 public WebElement USERNAME;
		    
	    @FindBy(xpath = "//*[@id=\"txtPass\"]")
		    public WebElement PASSWORD;
		    
	    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
		    public WebElement LOGIN;
	    
		@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
		public WebElement master;
		
		@FindBy(linkText = "Holding Account Mapping")
		public WebElement DedactionacountMap;
		
		
		//linkText("Deduction Account Mapping "));
		@FindBy(xpath = "//*[@id=\"body_ddlBillType\"]")  //*[@id="body_ddlBillType"]
		public WebElement select;
		
		
		@FindBy(xpath = "//*[@id=\"body_ddlBillType\"]/option[2]")//*[@id="body_ddlBillType"]/option[2]  //option[@value='3']
		public WebElement contigenc;
		
	
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgAccountPayEnglish_3\"]")  //*[@id="body_grdDeductionDetails_txtgAccountPayEnglish_5"]
		public WebElement accountpayee;
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgBankName_3\"]")
		public WebElement bankname;
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgBranchName_3\"]")
		public WebElement branchname;
		
		
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgAccountNumber_3\"]")
		public WebElement accountnumber;
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgIFSC_3\"]")
		public WebElement ifsccode;
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgMICR_3\"]")
		public WebElement micrcode;
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgBankAddress_3\"]")
		public WebElement bankAddress;
		
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgBankplace_3\"]")
		public WebElement bankplace;
	
		@FindBy(xpath = "//*[@id=\"body_grdDeductionDetails_txtgDistrict_3\"]")
		public WebElement district;
		
		@FindBy(xpath = "//*[@id=\"body_btnDeduction\"]")
		public WebElement deductionmsave;
		
		@FindBy(xpath = "//*[@id=\"Button4\"]")
		public WebElement saveno;
		
		@FindBy(xpath = "//*[@id=\"body_btnYes\"]")
		public WebElement deductionconsave;
		@FindBy(xpath = "//*[@id=\"body_btnApprove\"]")
		public WebElement approve;
		
	
		
		@FindBy(xpath = "//*[@id=\"body_btnOK\"]")
		public WebElement approveyes;
		
		@FindBy(xpath = "//*[@id=\"body_btnDeductionApprovalOk\"]")    //*[@id="body_btnDeductionApprovalOk"]
		public WebElement Approvalok;
		//*[@id="body_btnOK"]
		@FindBy(xpath = "//input[@id='btnLogout']")
		public WebElement logout;
		
		@FindBy(xpath = "//input[@id='btnYesLogout']")
		public WebElement yeslogout;
		
		@FindBy(xpath = "//a[normalize-space()='Holding Account Mapping Approval']")  //a[normalize-space()='Holding Account Mapping Approval']
		public WebElement Accountmappingapproval;
		
		@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/ul/li[3]/a")
		public WebElement DeAccountmappingapproval;
		
		@FindBy(name = "ctl00$body$grdApprovalPending$ctl13$chkApproval")
		public WebElement pendingaproval;
		
		
				public HoldingAccountMappingContPom(WebDriver driver)

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
		
		
		public void clickOnmaster() throws InterruptedException {
			master.click();
			Thread.sleep(2000);

		}
		
		public void DedactionAcountMapping() throws InterruptedException {
			
			DedactionacountMap.click();
			Thread.sleep(2000);

		}
		
		public void BillType() throws InterruptedException {
			select.click();
			Thread.sleep(2000);

		}
		
		public void ContiGency() throws InterruptedException {
			contigenc.click();
			Thread.sleep(2000);

		}
		
		public void AccountPayee(String accountp) throws InterruptedException {
			accountpayee.sendKeys(accountp);
			Thread.sleep(4000);

		}
		public void BankName(String name) throws InterruptedException {
			bankname.sendKeys(name);
			Thread.sleep(1000);
		}
		
		public void BranchName(String bname) throws InterruptedException {
			branchname.sendKeys(bname);
			Thread.sleep(1000);
		}
		
		public void AccountNumber(String accountn) throws InterruptedException {
			accountnumber.sendKeys(accountn);
			Thread.sleep(2000);
			

		}
	

		public void IFSCCode(String bname) throws InterruptedException {
			ifsccode.sendKeys(bname);
			Thread.sleep(4000);
			ifsccode.sendKeys(Keys.TAB);
		}
		
		public void MICRCode(String mname) throws InterruptedException {
			micrcode.sendKeys(mname);

		}
		
		
		public void BankAddress(String mname) throws InterruptedException {
			bankAddress.sendKeys(mname);

		}
		
		public void BankPlace(String dname) throws InterruptedException {
			bankplace.sendKeys(dname);

		}
		
		public void District(String dname) throws InterruptedException {
			district.sendKeys(dname);
			
		}
		
		public void DeductionmSave() throws InterruptedException {
			deductionmsave.click();

			Thread.sleep(2000);
		}
		
		public void SaveNo() throws InterruptedException {
			saveno.click();

			Thread.sleep(2000);
		}
		
		
		
		public void Deductionconsave() throws InterruptedException {
			deductionconsave.click();

			Thread.sleep(2000);	
		}
		public void Approve() throws InterruptedException {
			approve.click();

			Thread.sleep(2000);	
		}
		
		public void ApproveYes() throws InterruptedException {
			approveyes.click();

			Thread.sleep(2000);	
		}
		
		public void ApprovalOk() throws InterruptedException {
			
			Approvalok.click();
			Thread.sleep(1000);
		}
		
		public void Logout() throws InterruptedException {
			logout.click();

			Thread.sleep(2000);
		}
		
		public void YesLogout() throws InterruptedException {
			yeslogout.click();

			Thread.sleep(2000);
		}
		
		public void AccountMappingApproval() throws InterruptedException {
			Accountmappingapproval.click();

			Thread.sleep(2000);
		}
		
		public void DeAccountMappingApproval() throws InterruptedException {
			DeAccountmappingapproval.click();

			Thread.sleep(2000);
		}
		
		public void PendingAproval() throws InterruptedException {
			pendingaproval.click();

			Thread.sleep(2000);
			pendingaproval.sendKeys(Keys.TAB);
			Thread.sleep(2000);
		}
		
		
		
}
