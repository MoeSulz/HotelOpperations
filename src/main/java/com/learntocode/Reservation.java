package com.learntocode;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        if (roomType.equals("King")) {
            this.price = 139;
        } else {
            this.price = 124;
        }
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        double totalPrice = price * numberOfNights;
        if (isWeekend) {
            totalPrice *= 1.1;
        }
        return totalPrice;
    }


    public int getNumberOfNights() {

        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getReservationTotal() {
        return getPrice();
    }
}