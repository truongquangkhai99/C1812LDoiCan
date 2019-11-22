package com.company;

import java.util.Date;

public class DailyInvoice extends Invoice {
    private Integer days;
    public DailyInvoice(String id, Date createdDAte, String customerName, String roomCode, Double price) {
        super(id, createdDAte, customerName, roomCode, price);
    }

    @Override
    public Double getTotalPrice() {
        return super.getTotalPrice();
    }
}
