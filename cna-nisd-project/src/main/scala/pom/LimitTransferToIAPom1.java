package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LimitTransferToIAPom1 {

	 ////////////////// CNA Maker LOGIN/////////////////////// 

	   @FindBy(xpath = "//*[@id=\"txtUser\"]")
	    public WebElement USERNAME; 

	   @FindBy(xpath = "//*[@id=\"txtPass\"]")
	    public WebElement PASSWORD; 

	   @FindBy(xpath = "//*[@id=\"btnLogin\"]")
	    public WebElement LOGIN; 

	   /////////////////// LIMIT TRANSFER TO IA/////////////////////////////////// 

	   @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
	    public WebElement Transaction; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Transfer to IA']")
	    public WebElement LimitTransferToIA; 

	   @FindBy(xpath = "//select[@id='body_ddlCashBook']")
	    public WebElement SchemeName; 

	   @FindBy(xpath = "//select[@id='body_ddlCashBook']")
	    public WebElement SubScheme; 

	   @FindBy(xpath = "//select[@id='body_ddlbudgetYear']")
	    public WebElement FinancialYear; 

	   @FindBy(xpath = "//*[@id=\"body_ddlHeadCode\"]")
	    public WebElement HeadCode; 

	   @FindBy(xpath = "//*[@id=\"body_txtSearchIA\"]")
	    public WebElement SearchIA; 

	   @FindBy(xpath = "//span[@id='body_Label13']")
	    public WebElement SideClick; 

	   @FindBy(xpath = "//*[@id=\"body_txtExpAmtYr3\"]")
	    public WebElement LimitAllocated; 

	   @FindBy(xpath = "//input[@id='body_grdRemmiBlock_txtTotAmount_0']")
	    public WebElement IALimit;

	    @FindBy(xpath = "    //*[@id=\"body_txtWorksDetails\"]")
	    public WebElement Details; 

	   @FindBy(xpath = "//*[@id=\"body_txtRemark\"]")
	    public WebElement Remarks; 

	   @FindBy(xpath = "//input[@id='body_txtSactionedOrderNo']")
	    public WebElement SanctionedOrderNumber; 

	   @FindBy(xpath = "//*[@id=\"FileUploadBillCopy\"]")
	    public WebElement FileUpload1; 

	   @FindBy(name = "ctl00$body$btnHide")
	    public WebElement FileUploadOK; 

	   @FindBy(xpath = "//*[@id=\"body_btnSave\"]")
	    public WebElement Save; 

	   @FindBy(xpath = "//input[@id='body_btnYesSave']")
	    public WebElement SaveYES; 

	   @FindBy(xpath = "//*[@id=\"btnOkFinal\"]")
	    public WebElement SaveYESOK; 

	   //////////////////// CNA MAKER LIMIT APPROVAL
	    //////////////////// INBOX///////////////////////////////// 

	   @FindBy(xpath = "//a[normalize-space()='Transaction']")
	    public WebElement Transaction1; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Approval']")
	    public WebElement LimitApproval1; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Inbox']")
	    public WebElement LimitApprovalInbox; 

	   @FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	    public WebElement ViewSlip; 

	   @FindBy(xpath = "//input[@id='body_btnApprove']")
	    public WebElement ApproveSlip; 

	   @FindBy(xpath = "//*[@id=\"body_btnYes\"]")
	    public WebElement ApproveSlipYes; 

	   @FindBy(xpath = "//*[@id=\"body_Button2\"]")
	    public WebElement ApproveSlipOk; 

	   @FindBy(name = "ctl00$body$btnback")
	    public WebElement ApproveSlipBack; 

	   //////////////////////// CNA MAKER LIMIT APPROVAL
	    //////////////////////// OUTBOX/////////////////////////////////// 

	   @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
	    public WebElement Transaction2; 

	   @FindBy(xpath = "//a[normalize-space()='Scheme Budget Approval']")
	    public WebElement LimitApproval2; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Outbox']")
	    public WebElement LimitApprovalOutbox; 

	   @FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	    public WebElement ViewSlip1; 

	   @FindBy(xpath = "//input[@id='btnLogout']")
	    public WebElement MakerLogOut; 

	   @FindBy(xpath = "//*[@id=\"btnYesLogout\"]")
	    public WebElement MakerLogOutYes; 

	////////////////////////CNA CHECKER LIMIT APPROVAL INBOX/////////////////////////////////////     

	   @FindBy(xpath = "//*[@id=\"txtUser\"]")
	    public WebElement USERNAME1; 

	   @FindBy(xpath = "//*[@id=\"txtPass\"]")
	    public WebElement PASSWORD1; 

	   @FindBy(xpath = "//*[@id=\"btnLogin\"]")
	    public WebElement LOGIN1; 

	   @FindBy(xpath = "    //a[normalize-space()='Transaction']")
	    public WebElement Transaction3; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Approval']")
	    public WebElement LimitApproval3; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Inbox']")
	    public WebElement LimitApprovalInbox1; 

	   @FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	    public WebElement ViewSlip2; 

	   @FindBy(xpath = "//input[@id='body_btnApprove']")
	    public WebElement Approve2; 

	   @FindBy(xpath = "//*[@id=\"body_btnYes\"]")
	    public WebElement Yes2; 

	   @FindBy(xpath = "//*[@id=\"body_Button2\"]")
	    public WebElement Ok2; 

	   //////////////////// CNA CHECKER LIMIT APPROVAL
	    //////////////////// OUTBOX////////////////////////////////////////////// 

	   @FindBy(xpath = "    //a[normalize-space()='Transaction']")
	    public WebElement Transaction4; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Approval']")
	    public WebElement LimitApproval4; 

	   @FindBy(xpath = "//a[normalize-space()='Limit Outbox']")
	    public WebElement LimitApprovalOutbox2; 

	   @FindBy(xpath = "//*[@id=\"tblDmaBudgetTransferOutBox\"]/tbody/tr[1]/td[1]/a/div")
	    public WebElement ViewSlip3; 

	   @FindBy(xpath = "//*[@id=\"btnLogout\"]")
	    public WebElement CheckerLogout; 

	   @FindBy(xpath = "//input[@id='btnYesLogout']")
	    public WebElement CheckerLogoutYess;

	
	public LimitTransferToIAPom1(WebDriver driver)

	{
		PageFactory.initElements(driver, this);

	}

	///// CNA MAKER LOGIN/////
	 ///// CNA MAKER LOGIN/////

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
	    ///// CNA MAKER LIMIT APPROVAL TO IA///// 

	   public void clickontransaction() throws InterruptedException {
	        Transaction.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonLimitTransfer() throws InterruptedException {
	        LimitTransferToIA.click();
	        Thread.sleep(1000);
	    }
//	    public void clickonSelectScheme() throws InterruptedException {
//	        SelectScheme.click();
//	        Select s = new Select(SelectScheme);
//	        s.selectByIndex(1);
	//    
//	        Thread.sleep(2000); 

	   public void ClickOnSchemeName() throws InterruptedException {
	        SchemeName.click();
	        Thread.sleep(1000);
	    } 

	   public void ClickOnSubScheme() throws InterruptedException {
	        SubScheme.click();
	        Select s = new Select(SubScheme);
	        s.selectByIndex(1);
	        Thread.sleep(1000);
	    } 

	   public void ClickOnfinancialYear() throws InterruptedException {
	        FinancialYear.click();
	        Thread.sleep(1000);
	    } 

	   public void ClickonHeadCode() throws InterruptedException {
	        HeadCode.click();
	        Select s1 = new Select(HeadCode);
	        s1.selectByIndex(1);
	        Thread.sleep(1000);
	    } 

	   public void ClickOnSearchIA(String IA) throws Exception {
	        SearchIA.sendKeys(IA);
	        Thread.sleep(1000);
	    } 

	   public void ClickOnSideClick() throws InterruptedException {
	        SideClick.click();
	        Thread.sleep(1000); 

	   } 

	   public void ClickOnLimitAllocated(String Amount,WebDriver driver, Boolean isvalidLimit) throws InterruptedException {
	        LimitAllocated.sendKeys(Amount);
	        LimitAllocated.sendKeys(Keys.TAB);
	        Amount = handleBVAForLimitAmount(Amount,driver,isvalidLimit) ;
	        Thread.sleep(1000);
	    } 

	   public void ClickOnIALimit(String limit) throws InterruptedException {
	        IALimit.sendKeys(limit);
	        Thread.sleep(1000);
	    } 


	   public void clickonDetails(String Detail) throws InterruptedException {
	        Details.sendKeys(Detail);
	        Thread.sleep(1000);
	    } 

	   public void clickonRemarks(String Remark) throws InterruptedException {
	        Remarks.sendKeys(Remark);
	        Remarks.sendKeys(Keys.TAB);
	        Thread.sleep(1000);
	    } 

	   public void ClickOnSanctionedOrderNumber(String number) throws InterruptedException {
	        SanctionedOrderNumber.sendKeys(number);
	        SanctionedOrderNumber.sendKeys(Keys.TAB);
	        Thread.sleep(1000); 

	   } 

	   public void clickonUploadDocuments(String File) throws InterruptedException {
	        FileUpload1.sendKeys(File);
	        Thread.sleep(3000);
	    } 

	   public void clickonFileUploadOk() throws InterruptedException {
	        FileUploadOK.click();
	        Thread.sleep(3000);
	    } 

	   public void clickonSave() throws InterruptedException {
	        Save.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonSaveYes() throws InterruptedException {
	        SaveYES.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonSaveYesok() throws InterruptedException {
	        SaveYESOK.click();
	        Thread.sleep(1000);
	   }

	///// CNA MAKER INBOX/////

	   public void clickontransaction1() throws InterruptedException {
	        Transaction1.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonLimitApproval(WebDriver driver) throws InterruptedException {
	        Actions action = new Actions(driver);
	        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Approval']"));
	        action.moveToElement(ele).perform();
	        Thread.sleep(1000); 

	   } 

	   public void clickonLimitInbox() throws InterruptedException {
	        LimitApprovalInbox.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonViewSlip() throws InterruptedException {
	        ViewSlip.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonApproveSlip() throws InterruptedException {
	        ApproveSlip.click();
	        Thread.sleep(3000);
	    } 

	   public void clickonApproveSlipYes() throws InterruptedException {
	        ApproveSlipYes.click();
	        // ApproveSlipYes.sendKeys(Keys.TAB);
	        Thread.sleep(15000);
	    } 

	   public void clickonApproveSlipOk() throws InterruptedException {
	        ApproveSlipOk.click(); 

	       Thread.sleep(3000);
	    } 

	   public void clickonApproveSlipBack() throws InterruptedException {
	        ApproveSlipBack.click();
	        Thread.sleep(5000);
	    } 

	   ////// CNA MAKER OUTBOX/////// 

	   public void clickontransaction2() throws InterruptedException {
	        Transaction2.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonLimitApproval2(WebDriver driver) throws InterruptedException {
	        Actions action = new Actions(driver);
	        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Approval']"));
	        action.moveToElement(ele).perform();
	        Thread.sleep(1000); 

	   } 

	   public void clickonLimitOutbox() throws InterruptedException {
	        LimitApprovalOutbox.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonViewSlip1() throws InterruptedException {
	        ViewSlip1.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonLogOut() throws InterruptedException {
	        MakerLogOut.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonLogOutYes() throws InterruptedException {
	        MakerLogOutYes.click();
	        Thread.sleep(1000);
	    } 

	   ////// CNA CHECKER INBOX////// 

	   public void Username2(String USERNAME2) throws InterruptedException {
	        USERNAME1.sendKeys(USERNAME2);
	        Thread.sleep(1000);
	    } 

	   public void Password2(String password2) throws InterruptedException {
	        PASSWORD1.sendKeys(password2);
	        Thread.sleep(1000);
	    } 

	   public void clickOnLOGIN2() throws InterruptedException {
	        LOGIN1.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonTransaction3() throws InterruptedException {
	        Transaction3.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonLimitApproval3(WebDriver driver) throws InterruptedException {
	        Actions action = new Actions(driver);
	        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Approval']"));
	        action.moveToElement(ele).perform();
	        Thread.sleep(1000);
	    } 

	   public void clickonLimitApprovalInbox() throws InterruptedException {
	        LimitApprovalInbox1.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonViewSlip2() throws InterruptedException {
	        ViewSlip2.click();
	        Thread.sleep(1000); 

	   } 

	   public void clickonApprove2() throws InterruptedException {
	        Approve2.click();
	        Thread.sleep(1000); 

	   } 

	   public void clickonYess() throws InterruptedException {
	        Yes2.click();
	        Thread.sleep(11000);
	    } 

	   public void clickonOOk() throws InterruptedException {
	        Ok2.click();
	        Thread.sleep(3000);
	    } 

	   ////// CNA CHECKER OUTBOX////// 

	   public void clickonTransaction4() {
	        Transaction4.click();
	    } 

	   public void clickonLimitApproval4(WebDriver driver) throws InterruptedException {
	        Actions action = new Actions(driver);
	        WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Approval']"));
	        action.moveToElement(ele).perform();
	        Thread.sleep(1000);
	    } 

	   public void clickonLimitApprovalOutbox() throws InterruptedException {
	        LimitApprovalOutbox2.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonViewSlip3() throws InterruptedException {
	        ViewSlip3.click();
	        Thread.sleep(1000); 

	   } 

	   public void clickonCheckerLogout() throws InterruptedException {
	        CheckerLogout.click();
	        Thread.sleep(1000);
	    } 

	   public void clickonCheckerLogoutYess() throws InterruptedException {
	        CheckerLogoutYess.click();
	        Thread.sleep(1000);
	    }
	    
	    public String handleBVAForLimitAmount(String budgetAmount, WebDriver driver, Boolean isvalidLimit) throws InterruptedException {
	        Thread.sleep(2000);
	        if (isvalidLimit) {
	            WebElement alertBoxOk = driver.findElement(By.name("ctl00$body$btnbudget")); 
	            alertBoxOk.click();
	        }
	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	        jse.executeScript("document.getElementById('body_txtExpAmtYr3').focus();"); 

	       return budgetAmount;

	
	}

}




