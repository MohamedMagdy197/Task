package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact extends PageBase{

	public Contact(WebDriver driver) {
        super(driver);
    }

//button
	
@FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[2]/a")
WebElement contactbtn;

//input
@FindBy(xpath = "//*[@id=\"recipient-email\"]")
WebElement ContactEmail;


@FindBy(xpath = "//*[@id=\"recipient-name\"]")
WebElement Contactname;

@FindBy(id = "message-text")
WebElement Contactmessage;

@FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
WebElement sendmessage;

public void contactpage() {
	contactbtn.click();
}
	
public void contactpageinput(String email,String name,String message) {
	ContactEmail.sendKeys(email);
	Contactname.sendKeys(name);
	Contactmessage.sendKeys(message);
	sendmessage.click();
}
}
