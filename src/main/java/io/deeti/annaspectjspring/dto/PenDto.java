package io.deeti.annaspectjspring.dto;

import io.deeti.annaspectjspring.dto.BrandDto;
import io.deeti.annaspectjspring.dto.ManufacturerDto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PenDto implements Serializable {
    private Integer penId;
    private String penModel;
    private BrandDto brand;
    private LocalDate manufacturedDate;
    private ManufacturerDto manufacturedBy;

    public PenDto() {
    }

    public PenDto(Integer penId, String penModel, BrandDto brand, LocalDate manufacturedDate, ManufacturerDto manufacturedBy) {
        this.penId = penId;
        this.penModel = penModel;
        this.brand = brand;
        this.manufacturedDate = manufacturedDate;
        this.manufacturedBy = manufacturedBy;
    }

    public Integer getPenId() {
        return penId;
    }

    public void setPenId(Integer penId) {
        this.penId = penId;
    }

    public String getPenModel() {
        return penModel;
    }

    public void setPenModel(String penModel) {
        this.penModel = penModel;
    }

    public BrandDto getBrand() {
        return brand;
    }

    public void setBrand(BrandDto brand) {
        this.brand = brand;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public ManufacturerDto getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(ManufacturerDto manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    @Override
    public String toString() {
        return "PenDto{" +
                "penId=" + penId +
                ", penModel='" + penModel + '\'' +
                ", brand=" + brand +
                ", manufacturedDate=" + manufacturedDate +
                ", manufacturedBy=" + manufacturedBy +
                '}';
    }
}
