package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IACheckerInboxOutboxPom {
	

	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement IACUSERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement IACPASSWORD;

	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	public WebElement IACLOGIN;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement IACtransaction;
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[3]/a")
	public WebElement AAfileapprovel;
	
	@FindBy(xpath = "//a[normalize-space()='Administrative Approval File Details Inbox']")
	public WebElement AAfileinbox;
	
	@FindBy(xpath = "//select[@name='tblAdminApprovalNoInBox_length']")
	public WebElement showrecord;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement inboxslip;
	
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

	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[3]/a")
	public WebElement AAfileapprovalrepeat;

	@FindBy(xpath = " //a[normalize-space()='Administrative Approval File Details Outbox']")
	public WebElement AAfileoutbox;
	
	@FindBy(xpath = "//select[@name='tblAdminApprovalNoOutBox_length']")
	public WebElement showrecord1;

	@FindBy(xpath = "//*[@id=\"tblAdminApprovalNoOutBox\"]/tbody/tr[1]/td[1]/a/div")
	public WebElement outboxslip;

	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;

	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;


	
	
	private WebDriver driver;

	public IACheckerInboxOutboxPom(WebDriver driver) throws InterruptedException

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
	}

	public void IACusername(String USERNAME1) throws InterruptedException {
		IACUSERNAME.sendKeys(USERNAME1);
		Thread.sleep(1000);
	}

	public void IACPassword(String password) throws InterruptedException {
		IACPASSWORD.sendKeys(password);
		Thread.sleep(1000);
	}

	public void IACLOGINclick() throws InterruptedException {
		IACLOGIN.click();
		Thread.sleep(1000);
	}

	public void IACtransaction() throws InterruptedException {
		IACtransaction.click();
		Thread.sleep(1000);
	}
	
	public void hoverAAfileapprovelIAC(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(AAfileapprovel).perform();
		Thread.sleep(1000);
	}
	
	public void AAfileinboxclick() throws InterruptedException {
		AAfileinbox.click();
		Thread.sleep(1000);
	}
	
	public void showrecordclick() throws InterruptedException {
		showrecord.click();
		Select s = new Select(showrecord);
		s.selectByIndex(3);
		Thread.sleep(1000);
	}
	
	public void inboxslipclick() throws InterruptedException {
		inboxslip.click();
		Thread.sleep(1000);
	}
	
	public void approveslipclick() throws InterruptedException {
		approveslip.click();
		Thread.sleep(1000);
	}

	public void remarksend() throws InterruptedException {
		remark.sendKeys("Approved");
		Thread.sleep(1000);
	}

	public void remarkyesclick() throws InterruptedException {
		remarkyes.click();
		Thread.sleep(1000);
	}

	public void okclick() throws InterruptedException {
		ok.click();
		Thread.sleep(1000);
	}
	
	//fbhg
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

	public void showrecordclick1() throws InterruptedException {
		showrecord1.click();
		Select s = new Select(showrecord1);
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


}
