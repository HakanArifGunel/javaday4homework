package coffeShops;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	public IPersonCheckService checkService;
	
//	public StarbucksCustomerManager(IPersonCheckService iPersonCheckService) {
	//	this.checkService = iPersonCheckService;
	//}
	
	public void StarbucksCustomerManager() {}

	public void save(Customer customer) {
		
		
		
		if (checkService.checkIfRealPerson(customer)) {
			save(customer);
		}
		
		else {
			System.out.println("Doðrulama baþarýsýz");
		}
	
	}
	
	

}
