package adapters;

import abstracts.CustomerCheckService;
import entities.Customer;

public class EgovServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return customer.getNationalityId().length() == 11;
	}

}
