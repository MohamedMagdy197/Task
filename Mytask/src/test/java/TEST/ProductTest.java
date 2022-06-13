package TEST;


import org.testng.annotations.Test;

import Pages.Product;

public class ProductTest extends TestBase {

	
	Product productobject;
	@Test
	public void product() throws InterruptedException {
		productobject=new Product(driver);
		productobject.product();
		
	}
	
}
