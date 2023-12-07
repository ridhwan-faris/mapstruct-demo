package com.ridhwan.mapstructdemo.common.model.web.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class PaymentRequest {

    private String externalId;
    private Amount amount;

    @Data
    public static class Amount {
        private String currency;
        private BigDecimal value;
    }
}

