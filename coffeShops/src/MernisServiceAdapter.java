import java.rmi.RemoteException;

import coffeShops.BaseCustomerManager;
import coffeShops.Customer;
import coffeShops.IPersonCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			
			return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName(), customer.getLastName(), customer.getBirthDate());
		}
		catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
