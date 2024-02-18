package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToMany
    @JoinColumn(name = "clientId")
    private Client clientId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio(){

    }

    public Portfolio(Date creationDate){
        this.creationDate = creationDate;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}
