package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IACBillTransectionInwardOutWard {
	
	@FindBy(xpath = "//*[@id=\"txtUser\"]")
	public WebElement IACUSERNAME;

	@FindBy(xpath = "//*[@id=\"txtPass\"]")
	public WebElement IACPASSWORD;

	@FindBy(xpath = "//input[@id='btnLogin']")  
	public WebElement IACLOGIN;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement IACtransaction;
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[1]/a")
	public WebElement BillTransection;
	
	@FindBy(xpath = "//a[normalize-space()='Bill Inwards']")
	public WebElement BillInwards;
	
	@FindBy(xpath = "//select[@name='tblBillApproval_length']")
	public WebElement showrecord;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement inwerdslip;
	
	@FindBy(xpath = "//input[@id='body_btnApprove']")
	public WebElement approveslip;

	@FindBy(xpath = "//textarea[@id='body_txtApprove']")
	public WebElement remark;

	@FindBy(xpath = "//input[@id='body_btnYes']")
	public WebElement remarkyes;

	@FindBy(xpath = "//a[normalize-space()='Transaction']")
	public WebElement IACtransaction1;
	
	@FindBy(xpath = "//*[@id=\"Form1\"]/div[4]/div[3]/div/div/ul/li[1]/ul/li[1]/a")
	public WebElement BillTransection1;
	
	@FindBy(xpath = "//a[normalize-space()='Bill Outwards']")
	public WebElement BillOutwords;
	
	@FindBy(xpath = "//*[@id=\"tblOutbox_length\"]/label/select")
	public WebElement showrecord1;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]/div[1]")
	public WebElement outwordslip;
	
	@FindBy(xpath = "//input[@id='btnLogout']")
	public WebElement logout;
	
	@FindBy(xpath = "//input[@id='btnYesLogout']")
	public WebElement yeslogout;
	
	
	

	private WebDriver driver;

	public IACBillTransectionInwardOutWard(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
	
	public void hoverBillTransection(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(BillTransection).perform();
	}
	
	public void BillInwardsclick() throws InterruptedException {
		BillInwards.click();
		Thread.sleep(1000);
	}
	
	public void showrecordclick() throws InterruptedException {
		showrecord.click();
		Select s = new Select(showrecord);
		s.selectByIndex(4);
		Thread.sleep(2000);
	}
	
	public void inwerdslipclick() throws InterruptedException {
		inwerdslip.click();
		Thread.sleep(2000);
	}
	
	public void approveslipclick() throws InterruptedException {
		approveslip.click();
		Thread.sleep(2000);
	}

	public void remarksend() throws InterruptedException {
		remark.sendKeys("Approved");
		Thread.sleep(1000);
	}

	public void remarkyesclick() throws InterruptedException {
		remarkyes.click();
	}
	
	public void IACtransaction1click() throws InterruptedException {
		IACtransaction1.click();
		Thread.sleep(2000);
	}
	
	public void hoverBillTransection1(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(BillTransection1).perform();
	}
	
	public void BillOutwordsclick() throws InterruptedException {
		BillOutwords.click();
		Thread.sleep(2000);
	}
	
	public void showrecordclick1() throws InterruptedException {
		showrecord1.click();
		Select s = new Select(showrecord1);
		s.selectByIndex(4);
		Thread.sleep(2000);
	}
	
	public void outwordslipclick() throws InterruptedException {
		outwordslip.click();
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
