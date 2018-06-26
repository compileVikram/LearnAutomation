package b_TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import a_Base.Base_Class;


public class BrowserOpenClose 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Base_Class.ConfigueChrome();
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://google.com");
		System.out.println(driver1.getTitle());
		driver1.close();
		System.out.println("---------------End of Google Chrome---------------");
		
		
		
		Base_Class.ConfigueFirefox();
		WebDriver driver2=new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("https://google.com");
		Thread.sleep(5000);
		System.out.println(driver2.getTitle());
		Thread.sleep(5000);
		driver2.close();
		System.out.println("---------------End of Firefox---------------");
		
		
	    Base_Class.ConfigueIE();
	    DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR, 1); 
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);        
		WebDriver driver3 = new InternetExplorerDriver(cap);
		driver3.manage().window().maximize();
		driver3.get("https://google.com");
		System.out.println(driver3.getTitle());
		driver3.close();
		System.out.println("---------------End of Internet Explorer---------------");
		
		
		
	
	}

}
