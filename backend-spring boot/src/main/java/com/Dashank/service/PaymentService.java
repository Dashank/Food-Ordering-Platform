package com.Dashank.service;

import com.stripe.exception.StripeException;
import com.Dashank.model.Order;
import com.Dashank.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
