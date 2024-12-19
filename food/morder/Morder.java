package io.yenniii.food.morder;

import java.sql.Timestamp;

public class Morder {
    private int orderID;
    private Timestamp orderDateTime;
    private String status;
    private int totalAmount;
    private String customerID;

    public Morder(int orderID, Timestamp orderDateTime, String status, int totalAmount, String customerID) {
        this.orderID = orderID;
        this.orderDateTime = orderDateTime;
        this.status = status;
        this.totalAmount = totalAmount;
        this.customerID = customerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public Timestamp getOrderDateTime() {
        return orderDateTime;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return "Morder{" +
                "orderID=" + orderID +
                ", orderDateTime=" + orderDateTime +
                ", status='" + status + '\'' +
                ", totalAmount=" + totalAmount +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}