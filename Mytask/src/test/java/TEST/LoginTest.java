package TEST;

import org.testng.annotations.Test;

import Pages.Login;

public class LoginTest extends TestBase{
     String username="midomagdy";
     String password="123456";
	 Login loginobject;
	 @Test
	 public void loginpage() {
		 loginobject =new Login(driver);
		 loginobject.loginbutton();
		 loginobject.logininput(username, password);
	 }
	 
	 
}
