package coffeShops;

public class PersonCheckManager implements IPersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getNationalityId() > 1) {
			System.out.println("Kullanýcý doðrulandý");
			return true;
		} else {
			System.out.println("Kullanýcý doðrulanamadý. Doðru TC giriniz.");
			return false;
		}
		
	}

}
