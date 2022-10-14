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
        public void Username(String USERNAME1) throws InterruptedException {
            USERNAME.sendKeys(USERNAME1);
        	Thread.sleep(2000);
        }
        public void Password(String password) throws InterruptedException {
            PASSWORD.sendKeys(password);
        	Thread.sleep(2000);
        }
        public void clickOnLOGIN() throws InterruptedException {
            LOGIN.click();
        	Thread.sleep(2000);
        }
        public void clickontransaction() throws InterruptedException {
            Transaction.click();
        	Thread.sleep(2000);
        }
        public void clickonlimitrecall() throws InterruptedException {
            limitrecall.click();
        	Thread.sleep(2000);
        }
        public void clickonIagencyname() throws InterruptedException {
        	Iagencyname.click();
            Select s = new Select(Iagencyname);
            s.selectByIndex(68);
        	Thread.sleep(2000);
        }
        public void clickonsubscheme() throws InterruptedException {
        	subscheme.click();
            Select s1 = new Select(subscheme);
            s1.selectByIndex(1);
        	Thread.sleep(2000);
        }
        public void clickonHeadCode() throws InterruptedException {
                HeadCode.click();
                Select s2 = new Select(HeadCode);
                s2.selectByIndex(1);
            	Thread.sleep(2000);
        }
        public void clickWithDrawAmount(String amt ) throws InterruptedException {
        	withdrawAmount.sendKeys(amt);
        	Thread.sleep(2000);
     
            }
        
        public void clickremark(String Re) throws InterruptedException {
        	Remark.sendKeys(Re);
        	Thread.sleep(2000);
   
            }
        
        public void Clickuploadfile(String filePath) throws InterruptedException {
           uploadFile.sendKeys(filePath);
       	Thread.sleep(2000);
     
            }
        public void clickonok() throws InterruptedException {
            OK.click();
        	Thread.sleep(2000);
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
                
            public void clickontransaction1() throws InterruptedException {
            Transaction.click();
        	Thread.sleep(2000);
        }  
		public void clickonlimitrcllApproval(WebDriver driver ) throws InterruptedException {
			Actions action = new Actions(driver);
			WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Recall Approval']"));
			action.moveToElement(ele).perform();
			Thread.sleep(2000);

		}
      
           public void clickonlimitreclInbox() throws InterruptedException {
        	   LimitReclInbox.click();
        		Thread.sleep(2000);
      }
           public void clickonViewSlip() throws InterruptedException {
             ViewSlip.click();
         	Thread.sleep(2000);
           }
             
            public void clickonApproveSlip() throws InterruptedException {
                 ApproveSlip.click();
             	Thread.sleep(2000);
            }
            public void clickonApproveSlipYes() throws InterruptedException {
                ApproveSlipYes.click();
                Thread.sleep(10000);
            }
            public void clickonApproveSlipOk() throws InterruptedException {
                ApproveSlipOk.click();
                Thread.sleep(7000);
           
}
            public void clickontransaction2() throws InterruptedException {
                Transaction.click();
            	Thread.sleep(2000);
            }  
    		public void clickonlimitrcllApproval2(WebDriver driver ) {
    			Actions action = new Actions(driver);
    			WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Limit Recall Approval']"));
    			action.moveToElement(ele).perform();

    		}
          
               public void clickonlimitrecloutbox() throws InterruptedException {
            	   LimitRecloutbox.click();
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
           	









