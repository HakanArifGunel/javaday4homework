package coffeShops;

public class PersonCheckManager implements IPersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getNationalityId() > 1) {
			System.out.println("Kullan�c� do�ruland�");
			return true;
		} else {
			System.out.println("Kullan�c� do�rulanamad�. Do�ru TC giriniz.");
			return false;
		}
		
	}

}
