package com.example.paymentservicedec25.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @GetMapping("/paymentstatus")
    public void updatePaymentStatus() {

    }
}
