package com.neo.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class CstLinkman {

    @Id
    @GeneratedValue
    @Column(name = "lkm_id", nullable = false)
    private Long lkmId;
    @Column(name = "lkm_email", nullable = false)
    private String lkmEmail;
    @Column(name = "lkm_gender", nullable = false)
    private String lkmGender;
    @Column(name = "lkm_memo", nullable = false)
    private String lkmMemo;
    @Column(name = "lkm_mobile", nullable = false)
    private String lkmMobile;
    @Column(name = "lkm_name", nullable = false)
    private String lkmName;
    @Column(name = "lkm_phone", nullable = false)
    private String lkmPhone;
    @Column(name = "lkm_position", nullable = false)
    private String lkmPosition;
    @Column(name = "lkm_cust_id", nullable = false)
    private String lkmCustId;

    @OneToMany(mappedBy = "CstCustomer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<CstCustomer> cstCustomerList;

    public Long getLkmId() {
        return lkmId;
    }

    public void setLkmId(Long lkmId) {
        this.lkmId = lkmId;
    }

    public String getLkmEmail() {
        return lkmEmail;
    }

    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    public String getLkmGender() {
        return lkmGender;
    }

    public void setLkmGender(String lkmGender) {
        this.lkmGender = lkmGender;
    }

    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }

    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    public String getLkmPhone() {
        return lkmPhone;
    }

    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    public String getLkmPosition() {
        return lkmPosition;
    }

    public void setLkmPosition(String lkmPosition) {
        this.lkmPosition = lkmPosition;
    }

    public String getLkmCustId() {
        return lkmCustId;
    }

    public void setLkmCustId(String lkmCustId) {
        this.lkmCustId = lkmCustId;
    }
}
