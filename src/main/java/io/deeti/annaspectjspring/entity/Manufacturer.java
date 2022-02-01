package io.deeti.annaspectjspring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer companyId;
    String companyName;
    String manufacturerCategory;

    @ManyToOne
    ManufacturerAddress manufacturerAddress;

    public Manufacturer() {
    }

    public Manufacturer(Integer companyId, String companyName, String manufacturerCategory, ManufacturerAddress manufacturerAddress) {
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

    public ManufacturerAddress getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(ManufacturerAddress manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }
}
