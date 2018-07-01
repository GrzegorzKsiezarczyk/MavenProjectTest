package tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.FBhome;
import pages.FBlogin;

 
public class FBtestlogin extends simpletest{
 
 @Test
 public void start() throws Exception{
 
 driver1.get("https://www.facebook.com");
 FBlogin loginpage = PageFactory.initElements(driver1, FBlogin.class);
 loginpage.setEmail("ksiakster@gmail.com");
 loginpage.setPassword("HAS.");
 driver1.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
 loginpage.clickLoginButton();
 
 FBhome homepage = PageFactory.initElements(driver1, FBhome.class);
 homepage.clickProfile();
 homepage.verify();
 homepage.clickLogoutLink(); 
 }
}