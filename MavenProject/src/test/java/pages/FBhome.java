package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBhome {
	 
	        WebDriver driver;
	 
	        public FBhome(WebDriver driver){ 
	                this.driver=driver; 
	        }
	 //FindBy for locating elements
	 @FindBy(how=How.XPATH, using="//div[text()='Account Settings']") WebElement profile;
	 @FindBy(how=How.XPATH, using="//text()[.='Log Out']/ancestor::span[1]") WebElement logoutLink;
	 @FindBy(how=How.XPATH, using="///div[text()='Good']") WebElement loggedUserNameText;
	 
	        // click on Profile 
	 public void clickProfile(){
	 profile.click();
	 }
	 //  click on Logout link
	 public void clickLogoutLink(){
	 logoutLink.click();
	 }
	 // verify LoggedIn Username Text
	 public String verify(){
	 String userName = loggedUserNameText.getText();
	 return userName;
	 }
	 
	}