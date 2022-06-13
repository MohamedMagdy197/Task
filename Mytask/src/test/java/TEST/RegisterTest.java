package TEST;

import org.testng.annotations.Test;

import Pages.Register;

public class RegisterTest extends TestBase{
	String UserName="midomagdydsdfs";
	String password="123456";
    Register registerobject;
	@Test(priority = 1)
	public void registertest() {
		registerobject =new Register(driver);
		registerobject.Registration();
		registerobject.registerinput(UserName, password);
	
 
		
	}
	
}
