package com.ybm.xyy.api.in;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDetail {
    private String CreateTime;
    private String OrderNo;
    private String MerchantName;
    private String ProductName;
    private String Spec;
    private String Manufacturer;
    private String Medium_package;
    private Integer Status;
    private Integer AuditState;
    private Double ProductPrice;
    private Integer ProductAmount;
    private Double RefundFee;
    private Integer ShipTime;
    private String ErpOrgCode;
}