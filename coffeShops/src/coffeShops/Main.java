package coffeShops;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Hakan", "Günel", 1991, 1213);
		
		BaseCustomerManager baseCustomerManager1 = new NeroCustomerManager();
		baseCustomerManager1.save(customer1);
		//BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new PersonCheckManager());
		//baseCustomerManager2.save(customer1);
		StarbucksCustomerManager customerManager = new StarbucksCustomerManager();
		PersonCheckManager checkManager = new PersonCheckManager();
		checkManager.checkIfRealPerson(customer1);
	}

}
