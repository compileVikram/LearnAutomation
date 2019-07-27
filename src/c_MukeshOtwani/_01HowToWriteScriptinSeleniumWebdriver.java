package c_MukeshOtwani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import a_Base.Base_Class;

public class _01HowToWriteScriptinSeleniumWebdriver 
{
	public static void main(String...args)
	{
		Base_Class.ConfigueFirefox();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_j")).sendKeys("Vikram");
		driver.findElement(By.id("u_0_l")).sendKeys("Kadam");
		driver.findElement(By.id("u_0_o")).sendKeys("vikram007@yopmail.com");
		driver.findElement(By.id("u_0_v")).sendKeys("qwertyuiop");
		
		Select sel=new Select(driver.findElement(By.id("day")));
		sel.selectByVisibleText("8");
		
		Select sel1=new Select(driver.findElement(By.id("month")));
		sel1.selectByValue("Aug");
		
		Select sel2=new Select(driver.findElement(By.id("year")));
		sel2.selectByIndex(6);
		
		driver.findElement(By.id("u_0_a")).click();
		
		
	}

}
