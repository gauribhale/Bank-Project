package Tests;

import org.testng.annotations.Test;

import WebPages.AddCustPage;

public class AddCustomerTest {
	
	@Test
	public void addCustomer() {
		AddCustPage addcust=new AddCustPage();
		addcust.addCustomer();
		
	}

}
