package TEST;

import org.testng.annotations.Test;

import Pages.Aboutus;

public class AboutusTest extends TestBase {

	Aboutus aboutusobject;
@Test
public void aboutustest() {
	
	aboutusobject=new Aboutus(driver);
	aboutusobject.aboutuspage();
	aboutusobject.playvideo();
}
}
