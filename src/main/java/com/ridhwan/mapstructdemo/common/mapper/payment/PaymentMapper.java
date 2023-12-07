package com.ridhwan.mapstructdemo.common.mapper.payment;

import com.ridhwan.mapstructdemo.common.mapper.BaseMapper;
import com.ridhwan.mapstructdemo.common.model.dto.PaymentDto;
import com.ridhwan.mapstructdemo.common.model.web.request.PaymentRequest;
import com.ridhwan.mapstructdemo.common.model.web.response.PaymentResponse;
import com.ridhwan.mapstructdemo.config.BaseMapperConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public interface PaymentMapper {

    @Mapper(config = BaseMapperConfig.class)
    interface ToPaymentRequest extends BaseMapper<PaymentDto, PaymentRequest>{
        @Override
        PaymentDto fromTarget(PaymentRequest request);
    }

    @Mapper(config = BaseMapperConfig.class)
    interface ToPaymentResponse extends BaseMapper<PaymentDto, PaymentResponse>{
        @Override
        @Mapping(target = "transactionId", source = "trxId")
        @Mapping(target = "transactionDate", source = "createdAt", dateFormat = "yyyy-MM-dd")
        PaymentResponse toTarget(PaymentDto paymentDto);
    }
}
