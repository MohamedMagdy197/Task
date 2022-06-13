package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase {

	 public Login(WebDriver driver) {
	        super(driver);
	    }
@FindBy(id = "login2")
WebElement login;

@FindBy(id = "loginusername")
WebElement loginusername;

@FindBy(id = "loginpassword")
WebElement loginuserpass;

@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
WebElement btn;


public void loginbutton() {
	login.click();
}
public void logininput(String name,String pass) {
	loginusername.sendKeys(name);
	loginuserpass.sendKeys(pass);
	btn.click();
}
	 
}
