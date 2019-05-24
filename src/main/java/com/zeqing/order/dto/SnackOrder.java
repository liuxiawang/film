package com.zeqing.order.dto;

import java.math.BigDecimal;
import java.util.Date;

public class SnackOrder {

    private Long id;

    private Long openId;

    private Long snackId;

    private Integer count;

    private BigDecimal price;

    private String payState;

    private Date time;

    private String userName;

    private String snackName;

    private String description;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOpenId() {
        return openId;
    }

    public void setOpenId(Long openId) {
        this.openId = openId;
    }

    public Long getSnackId() {
        return snackId;
    }

    public void setSnackId(Long snackId) {
        this.snackId = snackId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
