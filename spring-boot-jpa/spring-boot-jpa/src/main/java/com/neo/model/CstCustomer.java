package com.neo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CstCustomer {

    @Id
    @GeneratedValue
    @Column(name = "cust_id", nullable = false)
    private Long custId;
    @Column(name = "cust_address", nullable = false)
    private String custAddress;
    @Column(name = "cust_industry", nullable = false)
    private String custIndustry;
    @Column(name = "cust_level", nullable = false)
    private String custLevel;
    @Column(name = "cust_name", nullable = false)
    private String custName;
    @Column(name = "cust_phone", nullable = false)
    private String custPhone;
    @Column(name = "cust_source", nullable = false)
    private String custSource;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }
}
