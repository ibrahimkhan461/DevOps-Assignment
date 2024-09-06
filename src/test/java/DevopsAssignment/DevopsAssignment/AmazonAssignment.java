package DevopsAssignment.DevopsAssignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonAssignment {
	
	static WebDriver driver;
	@Parameters({"browserName"})
	@Test
	public static void amazonBrowserTest(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		if(browserName.equalsIgnoreCase("edge")) 
		{
		     driver = new EdgeDriver();
		}
		
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.amazon.in/");
		  driver.close();

	}

}
