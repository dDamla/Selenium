package damla.damla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class ExampleOfSelenium {

	public static void main(String[] args)
	{
		//Read the article number and put them in the list
		ArrayList<String> acmArticles = new ArrayList<String>();
		ArrayList<String> acmArticleNo = new ArrayList<String>();
		ReadFile read = new ReadFile();
		read.ReadLine(acmArticles, "Articles/acmInfo.txt");
		for (String s : acmArticles)
		{
			acmArticleNo.add(s.substring(0, 6));
		}
		
		
		//Chrome things
		System.setProperty("webdriver.chrome.driver", "chrome/chromedriver.exe");
		try
		{
			ChromeOptions options = new ChromeOptions();
			Map<String, Object> preferences = new Hashtable<String, Object>();
			options.setExperimentalOption("prefs", preferences);

			// disable flash and the PDF viewer
			preferences.put("plugins.plugins_disabled", new String[] {
			    "Adobe Flash Player",
			    "Chrome PDF Viewer"
			});

			// launch the browser and navigate to the page
			ChromeDriver driver = new ChromeDriver(options);
			
			
			//Hocam ilk olarak bu kismi deneyin
			driver.get("http://dl.acm.org/results.cfm?query=375694");
			driver.findElement(By.linkText("PDF")).click();
			
			
			
			//Ise yaradiysa bu kismi acin
			
			/*
			for (String s : acmArticleNo)
			{
				driver.get("http://dl.acm.org/results.cfm?query="+s);
				driver.findElement(By.linkText("PDF")).click();
			}
			*/
			
			//Bu da bana gonderdiginiz deneme sayfasi
			//driver.get("http://www.philippe-fournier-viger.com/spmf/index.php?link=algorithms.php");
			//driver.findElement(By.linkText("Yen et al, 2009")).click();
			
		}	
		catch (Exception ex)
		{
			throw ex;
		}
		
		
		

	}

}
