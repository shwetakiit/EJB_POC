package kumari.shweta.ejb.statefulbean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

@Stateful(mappedName = "ShoppingCart")
@LocalBean
public class ShoppingCart implements ShoppingCartRemote {
	//Maintain  state here 
	List<String> cart;
    public ShoppingCart() {
    	cart= new ArrayList<>();
    }

	@Override
	public List<String> cartItems() {
		return cart;
	}

	@Override
	public void clearCart() {
		cart.clear();
	}

	@Override
	public void removeProduct(String productName) {
		cart.remove(productName);
	}

	@Override
	public void placeProduct(String productName) {
		cart.add(productName);
		
	}
}
