package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by song on 2017/11/8.
 */
@Entity
@Data
public class PurchaseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String productCompany;
    String number;
    Date expire;
    String scope;
    String method;
    String username;
    String invoiceUrl;
    String detailUrl;
    String productUrl;
    @Column(columnDefinition = "TIMESTAMP")
    Date createTime;
}


