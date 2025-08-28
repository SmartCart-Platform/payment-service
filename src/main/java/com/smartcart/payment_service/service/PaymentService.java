package com.smartcart.payment_service.service;

import com.smartcart.payment_service.model.dto.PaymentDto;
import com.smartcart.payment_service.model.entity.PaymentStatus;
import net.javaguides.common_lib.dto.order.OrderEvent;

public interface PaymentService {
    void createPayment(OrderEvent orderEvent);
    PaymentDto getPaymentByOrderId(String orderId);
    void updateStatusPayment(String orderId, PaymentStatus status);
    void refundPayment(String orderId);
}