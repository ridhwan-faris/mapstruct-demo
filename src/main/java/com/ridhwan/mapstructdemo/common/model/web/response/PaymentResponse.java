package com.ridhwan.mapstructdemo.common.model.web.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.math.BigDecimal;

@Data
@FieldNameConstants
@NoArgsConstructor
public class PaymentResponse {

    private String transactionId;
    private String externalId;
    private Amount amount;
    private String transactionDate;

    @Data
    public static class Amount {
        private String currency;
        private BigDecimal value;
    }
}
