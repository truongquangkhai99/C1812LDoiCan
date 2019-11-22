package com.company;

import java.util.Date;

public class Invoice {
    private String id;
    private Date createdDAte;
    private String customerName;
    private String roomCode;
    private Double price;

    public Invoice(String id, Date createdDAte, String customerName, String roomCode, Double price) {
        this.id = id;
        this.createdDAte = createdDAte;
        this.customerName = customerName;
        this.roomCode = roomCode;
        this.price = price;
    }
    public Double getTotalPrice() {
        return 0.0;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDAte() {
        return createdDAte;
    }

    public void setCreatedDAte(Date createdDAte) {
        this.createdDAte = createdDAte;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
