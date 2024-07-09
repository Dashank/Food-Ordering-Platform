package com.Dashank.service;

import com.Dashank.Exception.CartException;
import com.Dashank.Exception.CartItemException;
import com.Dashank.Exception.FoodException;
import com.Dashank.Exception.UserException;
import com.Dashank.model.Cart;
import com.Dashank.model.CartItem;
import com.Dashank.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
