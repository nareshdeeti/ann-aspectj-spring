package io.deeti.annaspectjspring.dto;

import java.io.Serializable;

public class ManufacturerDto implements Serializable {
    private Integer companyId;
    private String companyName;
    private String manufacturerCategory;
    private ManufacturerAddressDto manufacturerAddress;

    public ManufacturerDto() {
    }

    public ManufacturerDto(Integer companyId, String companyName, String manufacturerCategory, ManufacturerAddressDto manufacturerAddress) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.manufacturerCategory = manufacturerCategory;
        this.manufacturerAddress = manufacturerAddress;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getManufacturerCategory() {
        return manufacturerCategory;
    }

    public void setManufacturerCategory(String manufacturerCategory) {
        this.manufacturerCategory = manufacturerCategory;
    }

    public ManufacturerAddressDto getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(ManufacturerAddressDto manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "companyId = " + companyId + ", " +
                "companyName = " + companyName + ", " +
                "manufacturerCategory = " + manufacturerCategory + ", " +
                "manufacturerAddress = " + manufacturerAddress + ")";
    }
}
