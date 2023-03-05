package kumari.shweta.ejb.statefulbean;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ShoppingCartRemote {
	public List<String> cartItems();
	public void clearCart();
	public void removeProduct(String productName);
	public void placeProduct(String productName);

}
