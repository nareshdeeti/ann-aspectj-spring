package io.deeti.annaspectjspring.dto;

import java.io.Serializable;

public class BrandDto implements Serializable {
    private Integer brandId;
    private String brandName;
    private BrandAddressDto brandAddress;

    public BrandDto() {
    }

    public BrandDto(Integer brandId, String brandName, BrandAddressDto brandAddress) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandAddress = brandAddress;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public BrandAddressDto getBrandAddress() {
        return brandAddress;
    }

    public void setBrandAddress(BrandAddressDto brandAddress) {
        this.brandAddress = brandAddress;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "brandId = " + brandId + ", " +
                "brandName = " + brandName + ", " +
                "brandAddress = " + brandAddress + ")";
    }
}
