package www.vikas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.vikas.dao.CartItemDAOInt;
import www.vikas.model.CartItem;


@Service
public class CartItemServiceImpl implements CartItemServiceInt {

	@Autowired
	private CartItemDAOInt cartitemdao;
	
	public void addCartItem(CartItem cartItem) {
		cartitemdao.addCartItem(cartItem);
	}

	public CartItem getCartItem(String cartItemId) {
		// TODO Auto-generated method stub
		return cartitemdao.getCartItem(cartItemId);
	}

	public void removeCartItem(String cartItemId) {
		cartitemdao.removeCartItem(cartItemId);
	}

	public void removeAllCartItems(String customerid) {
		cartitemdao.removeAllCartItems(customerid);
	}

}
