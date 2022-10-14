package pom;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SchemeBudgetEntryPom2 {
	  //CNAmaker Approval
	
    @FindBy(xpath = "//*[@id=\"txtUser\"]")
    public WebElement USERNAME;
    
    @FindBy(xpath = "//*[@id=\"txtPass\"]")
    public WebElement PASSWORD;
    
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    public WebElement LOGIN;
    
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
	public WebElement Transaction;

	@FindBy(xpath = "//a[normalize-space()='Scheme Budget Entry']")
	public WebElement BudgetAsign;
	
	@FindBy(xpath = "//select[@id='body_ddlCashbook']")
	public WebElement Scheme;
	
	@FindBy(xpath = "//select[@id='body_ddlfinancialYear']")
	public WebElement FinancialYear;
	
	@FindBy(xpath = "//select[@id='body_ddlCashbook']")
	public WebElement SubScheme;
	
	@FindBy(xpath = "//*[@id=\"body_ddlHeadCode\"]")
	public WebElement HeadCode;
	
	@FindBy(xpath = "//input[@id='body_txtNewSchemeAmount']")
	public WebElement BudgetAmount;
	
	@FindBy(xpath = "//input[@id='body_txtSactionedOrderNo']")
	public WebElement SanctionedOrderNumber;
	
	@FindBy(xpath= "//*[@id=\"FileUploadGRCopy\"]")  //*[@id="FileUploadGRCopy"]
	public WebElement OrderCopy;

	@FindBy(xpath = "//*[@id=\"body_btnSave\"]")
	public WebElement Save;
	
	@FindBy(xpath = "//*[@id=\"body_btnRedirect\"]")
	public WebElement OK;
	
	@FindBy(xpath = "//*[@id=\"body_btnYes\"]")
	public WebElement Yes;
	
	@FindBy(id = "body_btnRedirect")
	public WebElement Ook;
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
	public WebElement Transaction1;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget Approval']")
	public WebElement BudgetApproval1;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget InBox']")
	public WebElement BudgetInbox;
	
	@FindBy(xpath = "//*[@id=\"tblSchemeBudgetInBox\"]/tbody/tr[1]/td[1]/a/div")
	public WebElement ViewSlip;
	
	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement ApproveSlip;
	
	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement ApproveSlipYes;
	
	@FindBy(xpath = "//*[@id=\"body_BtnOk\"]") 
	public WebElement ApproveSlipOk;
	
	@FindBy(xpath = "//input[@id='body_Button1']")
	public WebElement ApproveSlipBack;
	
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[2]/a")
	public WebElement Transaction2;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget Approval']")
	public WebElement BudgetApproval;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget OutBox']")
	public WebElement BudgetOutbox;
	
	@FindBy(xpath = "//tbody/tr[10]/td[1]/a[1]/div[1]")
	public WebElement ViewSlip1;
	
	
	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement MakerLogOut;
	
	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement MakerLogOutYes;
	
	

//CNAchecker Approval/////////////////////////////////////////
	
    @FindBy(xpath = "//*[@id=\"txtUser\"]")
    public WebElement USERNAME1;
    
    @FindBy(xpath = "//*[@id=\"txtPass\"]")
    public WebElement PASSWORD1;
    
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    public WebElement LOGIN1;
    
	@FindBy(xpath = "	//a[normalize-space()='Transaction']")
	public WebElement Transaction3;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget Approval']")
	public WebElement SchemeBudgetApproval;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget InBox']")
	public WebElement SchemeBudgetApprovalInbox;
	
	@FindBy(xpath = "//tbody/tr[5]/td[1]/a[1]/div[1]")
	public WebElement ViewSlip2;
	
	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement Approve2;
	
	@FindBy(xpath = "//*[@id=\"body_btnYes\"]")
	public WebElement Yes2;
	
	@FindBy(xpath = "//*[@id=\"body_BtnOk\"]")
	public WebElement Ok2;
	
	@FindBy(xpath = "	//a[normalize-space()='Transaction']")
	public WebElement Transaction4;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget Approval']")
	public WebElement SchemeBudgetApproval2;
	
	@FindBy(xpath = "//a[normalize-space()='Scheme Budget OutBox']")
	public WebElement SchemeBudgetApprovalOutbox;
	
	
	@FindBy(xpath = "//tbody/tr[7]/td[1]/a[1]/div[1]")
	public WebElement ViewSlip3;
	
	
	
	@FindBy(xpath = "//*[@id=\"btnLogout\"]")
	public WebElement CheckerLogout;
	
	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement CheckerLogoutYess;
	
	
	

	private WebDriver driver;
	
	
	public SchemeBudgetEntryPom2(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	  
	//CNAmaker Approval//////////////////////////////////////////////////////////////////////////////////////////////
	
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
		Transaction.click();
		Thread.sleep(1000);
	}
	public void clickBudgetAssign() throws InterruptedException {
		BudgetAsign.click();
		Thread.sleep(2000);
	}
	public void clickselectFeYear() throws InterruptedException {
		FinancialYear.click();
		Select s = new Select(FinancialYear);
		s.selectByIndex(0);
		Thread.sleep(1000);
	}
	public void clickonScheme() throws InterruptedException {
		Scheme.click();
	Select s1 = new Select(Scheme);
	s1.selectByIndex(1);
	Thread.sleep(1000);

	}
	public void clickonSubScheme() throws InterruptedException {
	SubScheme.click();
	Select s2 = new Select(SubScheme);
	s2.selectByIndex(1);
	Thread.sleep(1000);
	}
	public void clickonHeadCode() throws InterruptedException {
		HeadCode.click();
		Select s3 = new Select(HeadCode);
		s3.selectByIndex(3);
		Thread.sleep(1000);
	}
	public void clickBudgetAmount(String strBudgetAmmount) throws InterruptedException {
		BudgetAmount.sendKeys(strBudgetAmmount);
		BudgetAmount.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		}
	public void clickSanctionedOrderNumber(String strsanctOrdrAmmount) throws InterruptedException {
		SanctionedOrderNumber.sendKeys(strsanctOrdrAmmount);
		Thread.sleep(1000);
	}
	public void clickonOrderCopy(String file) throws InterruptedException {
		OrderCopy.sendKeys(file); //"E:\\demofile.pdf"
		Thread.sleep(1000);
	}

	public void clickonok() throws InterruptedException {
		OK.click();
		Thread.sleep(1000);
	}
		public void clickonSave() throws InterruptedException {
		Save.click();	
		Thread.sleep(1000);
    }
		public void clickonYes() throws InterruptedException {
		Yes.click();
		//Yes.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}
		public void clickonOok() throws InterruptedException {
		Ook.click();
		Thread.sleep(1000);
	}
			
		public void clickontransaction1() throws InterruptedException {
		Transaction1.click();
		Thread.sleep(1000);
	}	
		public void clickonBudgetApproval(WebDriver driver ) throws InterruptedException {
            Actions action = new Actions(driver);
            WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Scheme Budget Approval']"));
            action.moveToElement(ele).perform();
            Thread.sleep(1000);
            
     }
       public void clickonBudgetInbox() throws InterruptedException {
		 BudgetInbox.click();
		 Thread.sleep(1000);
  }
       public void clickonViewSlip() throws InterruptedException {
         ViewSlip.click();
         Thread.sleep(10000);
       }
         
        public void clickonApproveSlip() throws InterruptedException {
        	 ApproveSlip.click();
        	 Thread.sleep(1000);
        }
        public void clickonApproveSlipYes() throws InterruptedException {
        	ApproveSlipYes.click();
        	//ApproveSlipYes.sendKeys(Keys.TAB);
        	Thread.sleep(15000);
        }
        public void clickonApproveSlipOk() throws InterruptedException {
        	try {
        	 ApproveSlipOk.click();
        	}catch (StaleElementReferenceException e) {
        		ApproveSlipOk.click();
        	}
        	Thread.sleep(11000);
        	  }
        public void clickonApproveSlipBack() throws InterruptedException {
        	try {
        	ApproveSlipBack.click();
        	}catch (StaleElementReferenceException e) {
        		ApproveSlipBack.click();
        	}
        	Thread.sleep(1000);
        }
        	
        	public void clickontransaction2() throws InterruptedException {
    			Transaction1.click();
    			Thread.sleep(1000);
    		}	
    			public void clickonBudgetApproval1(WebDriver driver ) throws InterruptedException {
    	            Actions action1 = new Actions(driver);
    	            WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Scheme Budget Approval']"));
    	            action1.moveToElement(ele).perform();
    	            Thread.sleep(1000);
    	     
    	     }
    	       public void clickonBudgetOutbox() throws InterruptedException {
    			 BudgetOutbox.click();
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
        
//////////////CNA CHECKER INBOX/////////////////////////////////////
        
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

    		  public void clickonSchemeBudgetApproval1(WebDriver driver ) throws InterruptedException {
  	            Actions action = new Actions(driver);
  	            WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Scheme Budget Approval']"));
  	            action.moveToElement(ele).perform();
  	          Thread.sleep(1000);
  	          
    		  }
    		  public void clickonSchemeBudgetApprovalInbox() throws InterruptedException {
    			  SchemeBudgetApprovalInbox.click();
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
    			  Thread.sleep(1000);
    		  }
    		  public void clickonOOk() throws InterruptedException {
    		  try {
    			  Ok2.click();
 	        	}catch (StaleElementReferenceException e) {
 	        		Ok2.click();
 	        	}
 	        	Thread.sleep(1000);
 	        	  }
    		
  //////////////////////CNA CHECKER OUTBOX////////////////////////////////////////
    		  
    		  public void clickonTransaction4() throws InterruptedException {
    			  Transaction4.click();
    			  Thread.sleep(1000);
    		  }
    		  public void clickonSchemeBudgetApproval2(WebDriver driver ) throws InterruptedException {
	  	            Actions action = new Actions(driver);
	  	            WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Scheme Budget Approval']"));
	  	            action.moveToElement(ele).perform();
	  	          Thread.sleep(1000);
	    		  }
    		  public void clickonSchemeBudgetApprovalOutbox() throws InterruptedException {
    			  SchemeBudgetApprovalOutbox.click();
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

}



		

