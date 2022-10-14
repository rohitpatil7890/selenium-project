package baseclasses;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass{

	
	public WebDriver driver;
	
	public static Map<String, StringBuilder> pannumberMap ;
	public static int deductionnumber=0;
	
	public static Map<String, String> mapAANumber =new HashMap<String, String>();

	public void initializeBrowser() throws IOException {
		Reporter.log("----Open Chrome Browser & URL CNA ----");

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.0.162:3364/Login.aspx");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}


}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static WebDriver driver;
//	
//	@BeforeClass
//	
//	public void setup() throws IOException
//	{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Browser//chromedriver.exe");
//				
//		
//		driver = new ChromeDriver();
//		
//FileInputStream fis = new FileInputStream("E://mahacna-scenarios-one//APPLICATION_CREDENTIALS.properties");
// Properties prop = new Properties();
//   
//  prop.load(fis);
//  String url= prop.getProperty("applicationurl");
//  driver.get("http://192.168.0.162:3364/Login.aspx");
//  driver.manage().window().maximize();
//	}
	
	//http://192.168.0.162:3364/DeductionApproval.aspx
	
	
//	@AfterClass
//	public void close() {
//		
//		
//		driver.quit();
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	