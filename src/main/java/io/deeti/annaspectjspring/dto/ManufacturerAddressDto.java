package io.deeti.annaspectjspring.dto;

import java.io.Serializable;

public class ManufacturerAddressDto implements Serializable {
    private String hno;
    private String street;
    private String village;
    private String city;
    private String state;
    private String country;

    public ManufacturerAddressDto() {
    }

    public ManufacturerAddressDto(String hno, String street, String village, String city, String state, String country) {
        this.hno = hno;
        this.street = street;
        this.village = village;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "hno = " + hno + ", " +
                "street = " + street + ", " +
                "village = " + village + ", " +
                "city = " + city + ", " +
                "state = " + state + ", " +
                "country = " + country + ")";
    }
}
