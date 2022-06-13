package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Aboutus extends PageBase {
	
	public Aboutus(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[3]/a")
WebElement aboutusbtn;

@FindBy(xpath = "//*[@id=\"example-video\"]/button")
WebElement videoplay;

@FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div[3]/button")
WebElement close;

public void aboutuspage() {
	aboutusbtn.click();
	videoplay.click();
	
}

public void playvideo() {
	videoplay.click();
	close.click();

}

}

