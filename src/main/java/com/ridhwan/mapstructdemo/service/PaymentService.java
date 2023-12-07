package com.ridhwan.mapstructdemo.service;

import com.ridhwan.mapstructdemo.common.model.web.request.PaymentRequest;
import com.ridhwan.mapstructdemo.common.model.web.response.PaymentResponse;

public interface PaymentService {
    PaymentResponse pay(PaymentRequest request);
}
