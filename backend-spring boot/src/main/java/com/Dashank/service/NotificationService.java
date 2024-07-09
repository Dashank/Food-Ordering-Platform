package com.Dashank.service;

import java.util.List;

import com.Dashank.model.Notification;
import com.Dashank.model.Order;
import com.Dashank.model.Restaurant;
import com.Dashank.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
