package com.example.paymentservicedec25.services;

import com.stripe.exception.StripeException;

public interface PaymentService {
    public String generatePaymentLink(Long orderId) throws StripeException;
}
