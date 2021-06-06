package abstracts;

import entities.Customer;
import entities.Games;

public interface SellerService {
	
	public void sell(Games games, Customer customer);
}
