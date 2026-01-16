package com.kxprem.learn1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "paypal")
public class paypalPaymentService implements PaymentService{
    @Override
    public String pay() {
        String paymentSrc= "PAYPAL";
        System.out.println("Payment from: "+ paymentSrc);
        return paymentSrc;
    }
}
