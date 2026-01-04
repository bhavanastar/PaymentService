package com.example.paymentservicedec25.paymentgateways;

import com.stripe.exception.StripeException;

public interface PaymentGatewayAdapter {
    String generatePaymentLink(Long orderId) throws StripeException;
}
