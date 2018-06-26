package a_Base;

public class Base_Class 
{
	public static void ConfigueFirefox()
	{
		String key="webdriver.gecko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key, value);
	}
	
	public static void ConfigueChrome()
	{
		String key="webdriver.chrome.driver";
		String value="./software/chromedriver.exe";
		System.setProperty(key, value);
	}
	
	public static void ConfigueIE()
	{
		String key="webdriver.ie.driver";
		String value="./software/IEDriverServer.exe";
		System.setProperty(key, value);
	}

}
