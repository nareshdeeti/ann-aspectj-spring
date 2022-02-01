package io.deeti.annaspectjspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pen")
public class Pen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    Integer penId;
    String penModel;

    @OneToOne
//    @JoinColumn(name = "brand", referencedColumnName = "brand_name")
    Brand brand;

    LocalDate manufacturedDate;

    @OneToOne
    Manufacturer manufacturedBy;

    public Pen() {
    }

    public Pen(Integer penId, String penModel, Brand brand, LocalDate manufacturedDate, Manufacturer manufacturedBy) {
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Manufacturer getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(Manufacturer manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penId=" + penId +
                ", penModel='" + penModel + '\'' +
                ", brand=" + brand +
                ", manufacturedDate=" + manufacturedDate +
                ", manufacturedBy=" + manufacturedBy +
                '}';
    }
}