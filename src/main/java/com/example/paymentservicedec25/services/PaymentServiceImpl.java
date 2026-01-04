package com.example.paymentservicedec25.services;

import com.example.paymentservicedec25.paymentgateways.PaymentGatewayAdapter;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentGatewayAdapter paymentGatewayAdapter;

    public PaymentServiceImpl(PaymentGatewayAdapter paymentGatewayAdapter) {
        this.paymentGatewayAdapter = paymentGatewayAdapter;
    }

     @Override
    public String generatePaymentLink(Long orderId) throws StripeException {

        return paymentGatewayAdapter.generatePaymentLink(orderId);
    }
}
