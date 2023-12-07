package com.ridhwan.mapstructdemo.common.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@SuperBuilder(toBuilder = true)
@FieldNameConstants
@NoArgsConstructor
public class PaymentDto {

    private String trxId;
    private String externalId;
    private Amount amount;
    private Date createdAt;

    @Data
    public static class Amount {
        private String currency;
        private BigDecimal value;
    }
}
