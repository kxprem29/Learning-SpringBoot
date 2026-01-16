package com.kxprem.learn1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "phonepe")
public class phonepePaymentService implements PaymentService{
    @Override
    public String pay() {
        String paymentSrc= "phonepe";
        System.out.println("Payment from: "+ paymentSrc);
        return paymentSrc;
    }
}
