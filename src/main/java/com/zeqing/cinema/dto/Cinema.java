package com.zeqing.cinema.dto;

import java.util.List;

public class Cinema {

    private Long id;

    private String brand;

    private String province;

    private String city;

    private String town;

    private String address;

    private String saleInfo;

    private String feature;

    private String special;

    private List<Calendar> calendars;

    private List<Snack> snacks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(String saleInfo) {
        this.saleInfo = saleInfo;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(List<Snack> snacks) {
        this.snacks = snacks;
    }
}
