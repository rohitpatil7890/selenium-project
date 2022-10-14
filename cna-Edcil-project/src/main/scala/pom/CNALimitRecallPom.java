package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CNALimitRecallPom {


	
	       
    
    @FindBy(xpath = "//*[@id=\"txtUser\"]")
    public WebElement USERNAME;
    
    
    @FindBy(xpath = "//*[@id=\"txtPass\"]")
    public WebElement PASSWORD;
    
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    public WebElement LOGIN;
    
    @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
    public WebElement Transaction;
  //*[@id="Form1"]/div[4]/div[3]/div/div/ul/li[2]/a
  //*[@id="Form1"]/div[4]/div[3]/div/div/ul/li[2]/a

   @FindBy(xpath = "//a[normalize-space()='Limit Recall']")
    public WebElement limitrecall;

   @FindBy(xpath = "//select[@id='body_ddlImplementedAgency']")
    public WebElement Iagencyname;
    
    @FindBy(xpath = "//select[@id='body_ddlCashbook']")
    public WebElement subscheme;
    
    @FindBy(xpath = "//*[@id=\"body_ddlHeadCode\"]")
    public WebElement HeadCode;
    
    @FindBy(xpath = "//input[@id='body_txtTotalBill']")
    public WebElement withdrawAmount;

    @FindBy(xpath = "//*[@id=\"body_txtRemark\"]")
    public WebElement Remark;

    @FindBy(xpath = "//*[@id=\"FileUploadBillCopy\"]")
    public WebElement uploadFile;
    
    @FindBy(xpath = "//*[@id=\"body_btnSave\"]")
    public WebElement Save;
    
    @FindBy(xpath = "(//input[@id='Button1'])[1]")
    public WebElement OK;

    @FindBy(xpath = "//input[@id='body_btnSaveRecord']")
    public WebElement Yes;

    @FindBy(xpath = "//input[@id='Button1']")
    public WebElement Ook;
    
    @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
    public WebElement Transaction1;
    
  //a[normalize-space()='Transaction']
    @FindBy(xpath = "//a[normalize-space()='Transaction']")
    public WebElement Transactioncheck;
    
  
    @FindBy(xpath = "//a[normalize-space()='Limit Recall Approval']")
    public WebElement BudgetApproval;

    @FindBy(xpath = "//a[normalize-space()='Limit Recall Inbox']")
    public WebElement LimitReclInbox;
  
    @FindBy(xpath = "//body[1]/form[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/div[1]")
    public WebElement ViewSlip;
    
    @FindBy(xpath = "//*[@id=\"body_btnApprove\"]")
    public WebElement ApproveSlip;
    
    @FindBy(xpath = "//*[@id=\"body_btnYes\"]")
    public WebElement ApproveSlipYes;
    
    @FindBy(xpath = "//*[@id=\"body_Button2\"]")
    public WebElement ApproveSlipOk;
    
  //a[normalize-space()='Transaction']
    
    @FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
    public WebElement Transaction2;

    @FindBy(xpath = "//a[normalize-space()='Limit Recall Approval']")
    public WebElement BudgetApproval1;

    @FindBy(xpath = "//a[normalize-space()='Limit Recall Outbox']")
    public WebElement LimitRecloutbox;
    

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;
	
	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;
	
    
      
        
    



       private WebDriver driver;
        
        
        public CNALimitRecallPom(WebDriver driver)



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
        public void clickontransaction() {
            Transaction.click();
        }
        
        
        public void clickontransactionchek() {
            Transactioncheck.click();
        }
        
        
        public void clickonlimitrecall() {
            limitrecall.click();
        }
        public void clickonIagencyname() {
        	Iagencyname.click();
            Select s = new Select(Iagencyname);
            s.selectByIndex(14);
        }
        public void clickonsubscheme() {
        	subscheme.click();
            Select s1 = new Select(subscheme);
            s1.selectByIndex(1);
        }
        public void clickonHeadCode() {
                HeadCode.click();
                Select s2 = new Select(HeadCode);
                s2.selectByIndex(1);
        }
        public void clickWithDrawAmount(String amt ) {
        	withdrawAmount.sendKeys(amt);
     
            }
        
        public void clickremark(String Re) {
        	Remark.sendKeys(Re);
   
            }
        
        public void Clickuploadfile(String filePath) {
           uploadFile.sendKeys(filePath);
     
            }
        public void clickonok() {
            OK.click();
        }
            public void clickonSave() throws InterruptedException {
            Save.click(); 
            Thread.sleep(2000);
        }
            public void clickonYes() throws InterruptedException {
            Yes.click();
            Thread.sleep(2000);
        }
            public void clickonOok() throws InterruptedException {
            Ook.click();
            Thread.sleep(2000);
        }
                
            public void clickontransaction1() {
            Transaction.click();
        }  
		public void clickonlimitrcllApproval(WebDriver driver ) {
			Actions action = new Actions(driver);
			WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Recall Approval']"));
			action.moveToElement(ele).perform();

		}
      
           public void clickonlimitreclInbox() {
        	   LimitReclInbox.click();
      }
           public void clickonViewSlip() {
             ViewSlip.click();
           }
             
            public void clickonApproveSlip() {
                 ApproveSlip.click();
            }
            public void clickonApproveSlipYes() throws InterruptedException {
                ApproveSlipYes.click();
                Thread.sleep(10000);
            }
            public void clickonApproveSlipOk() throws InterruptedException {
                ApproveSlipOk.click();
                Thread.sleep(10000);
           
}
            public void clickontransaction2() {
                Transaction2.click();
            }  
    		public void clickonlimitrcllApproval2(WebDriver driver ) {
    			Actions action = new Actions(driver);
    			WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Recall Approval']"));
    			action.moveToElement(ele).perform();

    		}
          
               public void clickonlimitrecloutbox() {
            	   LimitRecloutbox.click();
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
           	









