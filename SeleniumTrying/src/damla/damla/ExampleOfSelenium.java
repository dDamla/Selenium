package damla.damla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExampleOfSelenium {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\damla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		try
		{
			WebDriver deneme = new ChromeDriver();
			deneme.get("https://tr.wikipedia.org/wiki/Mustafa_Kemal_Atat%C3%BCrk");
			deneme.findElement(By.linkText("Ýtilaf Devletleri")).click();
		}	
		catch (Exception ex)
		{
			throw ex;
		}
		

	}

}
