package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by huang on 2017/11/10.
 */
@Entity
@Data
public class EnterpriseDirectory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    /**
     * 企业名称
     */
    String enterpriseName;
    /**
     * 经营范围
     */
    String businessScope;
    /**
     * 企业地址
     */
    String enterpriseaddress;  
    /**
     * 成立时间
     */
    Date establishmentime;
    /**
     * 联系人
     */
    String contacts;
    /**
     * 联系方式
     */
    String phone;
    /**
     * 占地面积
     */
    String areaCovered;
    /**
     * 规模
     */
    String scale;
    /**
     * 总投资
     */
    Double totalInvestment;
    /**
     * 在职人数
     */
    Integer incumbency;
    /**
     * 种植面积
     */
    String plantingArea;
    /**
     * 种植作物
     */
    String raiseCrops;

}