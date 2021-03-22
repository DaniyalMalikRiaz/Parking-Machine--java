package com.company;

abstract class TicketingMachine {
    int hour;
    int amount;
    int carNum;

    public TicketingMachine(int hour, int amount, int carNum) {
        this.hour = hour;
        this.amount = amount;
        this.carNum = carNum;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public TicketingMachine() {

    }



}
