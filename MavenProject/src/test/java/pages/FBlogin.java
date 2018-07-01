package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBlogin {

	WebDriver driver1;
        public FBlogin(WebDriver driver1){ 
                 this.driver1=driver1; 
        }

	//Using FindBy- locating elements
	@FindBy(how=How.XPATH, using="//input[@type='email'][@name='email']") WebElement email;
	@FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement password;
	//@FindBy(how=How.ID, using="//input[@type='submit'][@id='u_0_2']") WebElement Button;
	@FindBy(how=How.LINK_TEXT, using="Log In") WebElement Button;


        //to set Email in the email text box
	public void setEmail(String keyEmail){
		email.sendKeys(keyEmail);
	}
	//to set Password in the password text box
	public void setPassword(String keyPassword){
		password.sendKeys(keyPassword);
	}
	//to click on Login Button
	public void clickLoginButton(){
		Button.click();
	}	
}