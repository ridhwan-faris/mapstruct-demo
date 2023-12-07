package com.ridhwan.mapstructdemo.service.impl;

import com.ridhwan.mapstructdemo.common.mapper.payment.PaymentMapper;
import com.ridhwan.mapstructdemo.common.model.dto.PaymentDto;
import com.ridhwan.mapstructdemo.common.model.web.request.PaymentRequest;
import com.ridhwan.mapstructdemo.common.model.web.response.PaymentResponse;
import com.ridhwan.mapstructdemo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper.ToPaymentRequest paymentRequestMapper;
    private final PaymentMapper.ToPaymentResponse paymentResponseMapper;

    @Override
    public PaymentResponse pay(PaymentRequest request){
        PaymentDto paymentDto = paymentRequestMapper.fromTarget(request).toBuilder().trxId(UUID.randomUUID().toString())
                .createdAt(new Date()).build();
        // TODO: some login here
        return paymentResponseMapper.toTarget(paymentDto);
    }
}
