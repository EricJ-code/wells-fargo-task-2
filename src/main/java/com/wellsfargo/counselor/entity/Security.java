package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Security {
    
    @Id
    @GeneratedValue()
    private long securityId;
    
    @ManyToMany
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private Integer quantity;

    protected Security(){

    }

    public Security(String name, String category, Double purchasePrice, Date purchaseDate, Integer quantity){
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId(){
        return securityId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

    public Double getPurchasePrice(){
        return purchasePrice;
    }
    public void setPurchasePrice(Double purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate(){
        return purchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public Integer getQuantity(){
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }
}
