package com.Dashank.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.Dashank.Exception.CartException;
import com.Dashank.Exception.OrderException;
import com.Dashank.Exception.RestaurantException;
import com.Dashank.Exception.UserException;
import com.Dashank.model.Order;
import com.Dashank.model.PaymentResponse;
import com.Dashank.model.User;
import com.Dashank.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
