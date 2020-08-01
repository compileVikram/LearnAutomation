package c_MukeshOtwani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import a_Base.Base_Class;



public class _01HowToWriteScriptinSeleniumWebdriver 
{
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String...args) 
	{

		Base_Class.ConfigueChrome();
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		
	    dr.findElement(By.id("u_0_m")).sendKeys("Vikram");
		dr.findElement(By.id("u_0_o")).sendKeys("Kadam");
		dr.findElement(By.id("u_0_r")).sendKeys("vikram007@yopmail.com");
		dr.findElement(By.id("u_0_u")).sendKeys("vikram007@yopmail.com");
		
		dr.findElement(By.id("password_step_input")).sendKeys("qwertyuiop");
		
		dr.findElement(By.xpath("//select[@id='day']")).sendKeys("16");
	    dr.findElement(By.xpath("//select[@id='month']")).sendKeys("apr");
		dr.findElement(By.xpath("//select[@id='year']")).sendKeys("1991");
		
		System.out.println("Chorme Ran Successfully");
		
		dr.close();
		
		Base_Class.ConfigueFirefox();
		WebDriver dr1=new FirefoxDriver();
		dr1.manage().window().maximize();
		dr1.get("https://en-gb.facebook.com/");
		
	    dr1.findElement(By.id("u_0_m")).sendKeys("Vikram");
		dr1.findElement(By.id("u_0_o")).sendKeys("Kadam");
		dr1.findElement(By.id("u_0_r")).sendKeys("vikram007@yopmail.com");
		dr1.findElement(By.id("u_0_u")).sendKeys("vikram007@yopmail.com");
		
		dr1.findElement(By.id("password_step_input")).sendKeys("qwertyuiop");
		
		dr1.findElement(By.xpath("//select[@id='day']")).sendKeys("16");
	    dr1.findElement(By.xpath("//select[@id='month']")).sendKeys("apr");
		dr1.findElement(By.xpath("//select[@id='year']")).sendKeys("1991");
		
		System.out.println("Firefox Ran Successfully");
		
		dr1.close();
		
		Base_Class.ConfigueIE();
		WebDriver dr2=new InternetExplorerDriver();
		dr2.manage().window().maximize();
		dr2.get("https://en-gb.facebook.com/");
		
	    dr2.findElement(By.id("u_0_m")).sendKeys("Vikram");
		dr2.findElement(By.id("u_0_o")).sendKeys("Kadam");
		dr2.findElement(By.id("u_0_r")).sendKeys("vikram007@yopmail.com");
		dr2.findElement(By.id("u_0_u")).sendKeys("vikram007@yopmail.com");
		
		dr2.findElement(By.id("password_step_input")).sendKeys("qwertyuiop");
		
		dr2.findElement(By.xpath("//select[@id='day']")).sendKeys("16");
	    dr2.findElement(By.xpath("//select[@id='month']")).sendKeys("apr");
		dr2.findElement(By.xpath("//select[@id='year']")).sendKeys("1991");
		
		System.out.println("IE Ran Successfully");
		
		dr2.close();
	}

}
