package tests;

	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	 
	public class simpletest {
	 
	 public static WebDriver driver1 = null;
	 
	 @BeforeSuite
	 public void initialize() throws IOException{
	 
	 driver1 = new ChromeDriver(); 
	 //maximize browser
	                driver1.manage().window().maximize();
	         //wait
	        	driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //To open facebook
	                driver1.get("https://www.facebook.com");
	 }
	 
	 @AfterSuite
	 //Test cleanup
	 public void exit()
	    {
	        simpletest.driver1.quit();
	    }
	 
	}
