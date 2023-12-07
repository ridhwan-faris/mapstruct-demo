package com.ridhwan.mapstructdemo.controller;

import com.ridhwan.mapstructdemo.common.ApiPath;
import com.ridhwan.mapstructdemo.common.model.web.request.PaymentRequest;
import com.ridhwan.mapstructdemo.common.model.web.response.PaymentResponse;
import com.ridhwan.mapstructdemo.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(ApiPath.V1 + ApiPath.PAY)
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<PaymentResponse> pay(@RequestBody PaymentRequest request){
        PaymentResponse response = paymentService.pay(request);
        return ResponseEntity.ok(response);
    }
}
