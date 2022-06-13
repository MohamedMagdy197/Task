package Pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register extends PageBase {

    public Register(WebDriver driver) {
        super(driver);
    }
    
    
@FindBy(id="signin2")
WebElement reg;

@FindBy(id ="sign-username")
WebElement username;

@FindBy(id ="sign-password")
WebElement password;

@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
WebElement signup;


public void Registration() {
	
	reg.click();
	//username.sendKeys(name);
	//password.sendKeys(pass);

}

public void registerinput(String name,String pass) {
	username.sendKeys(name);
	password.sendKeys(pass);
	signup.click();
	WebDriverWait wait = new WebDriverWait(driver , 10);
    wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	

}
//public void alert() {
//	driver.switchTo().alert().accept();
//}
		
		
}
