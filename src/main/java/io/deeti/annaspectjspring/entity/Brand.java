package io.deeti.annaspectjspring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brandId;
    private String brandName;

    @ManyToOne
    private BrandAddress brandAddress;

    public Brand() {
    }

    public Brand(Integer brandId, String brandName, BrandAddress brandAddress) {
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

    public BrandAddress getBrandAddress() {
        return brandAddress;
    }

    public void setBrandAddress(BrandAddress brandAddress) {
        this.brandAddress = brandAddress;
    }
}
