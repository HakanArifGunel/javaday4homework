package coffeShops;

public class CustomerCheckManager implements IPersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}



}
