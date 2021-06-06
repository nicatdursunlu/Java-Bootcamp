package abstracts;

import entities.Customer;
import entities.Games;

public class BaseSellerManager implements SellerService {

	@Override
	public void sell(Games games, Customer customer) {
		System.out.println("Game " + games.getGameName() + " was sold to "
		+ customer.getFirstName() + " " + customer.getLastName() + " for " + games.getPrice() + " $");
	}

}
