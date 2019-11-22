package com.company;

import java.util.Date;

public class HourlyInvoice extends Invoice {
    private Integer hours;
    public HourlyInvoice(String id, Date createdDAte,
                         String customerName, String roomCode, Double price, Integer hours) {
        super(id, createdDAte, customerName, roomCode, price);
        this.hours = hours;
    }
}
