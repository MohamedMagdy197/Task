package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends PageBase {
	public Product(WebDriver driver) {
        super(driver);
    }
@FindBy(linkText = "Phones")
WebElement phone;

@FindBy(linkText = "Laptops")
WebElement laptop;

@FindBy(linkText = "Sony vaio i5")
WebElement buylap;


@FindBy(linkText = "Add to cart")
WebElement laptopcard;
//Alert alert=driver.switchTo().alert();
public void product() throws InterruptedException {
	
	phone.click();
	laptop.click();
	buylap.click();
	laptopcard.click();
	
    Alert alert=driver.switchTo().alert();
	alert.accept();
}

	
}
