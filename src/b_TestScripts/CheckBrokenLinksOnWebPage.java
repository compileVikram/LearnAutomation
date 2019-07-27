package b_TestScripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import a_Base.Base_Class;

public class CheckBrokenLinksOnWebPage 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException 

	{
		Base_Class.ConfigueChrome();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		//Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://edulastic.com/");
		
//		driver.get("https://www.freecrm.com/");
//		
//		driver.findElement(By.name("username")).sendKeys("naveenk");
//		driver.findElement(By.name("password")).sendKeys("test@123");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		driver.switchTo().frame("mainpanel");
//		
		//links ---  //a href <http://www.google.com>
		//images --- //img href <http://www.test.com>
		
		//1. Get the list of all the links and images
		Thread.sleep(5000);
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activeLinks= new ArrayList<WebElement>();
		System.out.println("size of full links and images ---->"+linksList.size());

		
		//2. iterate linkList: Exclude all the links/images - doesnt have any href attribute
		
		for(int i=0;i<linksList.size();i++)
		{
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href") !=null 
					&& (!linksList.get(i).getAttribute("href").contains("javascript:void(0)")
					&& (!linksList.get(i).getAttribute("href").contains("javascript"))));
			{
				activeLinks.add(linksList.get(i));
				
				
			}
		}
		
		//Get the size of active links list:
		
		System.out.println("size of active links and images ---->"+activeLinks.size());
		
		//3. Check the href URL with httpconnection api:java.net package
		
		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage(); //ok
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"---->"+response);
			
		}
		
		driver.close();
}
}
