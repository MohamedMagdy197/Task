package TEST;

import org.testng.annotations.Test;

import Pages.Contact;

public class ContactTest extends TestBase{
    String ContactEmail ="mido@.com";
    String ContactName="mohamed";
    String Message= "mohamed Magdy elsayed";
	Contact contactobject;
	@Test
	public void contacttest() {
		contactobject=new Contact(driver);
		contactobject.contactpage();
		contactobject.contactpageinput(ContactEmail, ContactName, Message);
		
	}
}
