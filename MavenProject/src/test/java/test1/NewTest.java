package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
	private WebDriver driver1=new ChromeDriver();

 
	    @BeforeClass
	    public void test() {
		}

	    @AfterClass
	    public void afterClass() {
	        driver1.quit();
	    }

	    @Test
	    public void verifySearchButton() {
			driver1.navigate().to("http://google.com");
			Assert.assertEquals("Google", driver1.getTitle());
	           
	    }

  }

