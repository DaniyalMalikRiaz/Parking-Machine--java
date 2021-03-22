package com.company;

public class Standard extends TicketingMachine{
    public Standard(int hour, int amount, int carNum) {
        super(hour, amount, carNum);
    }

    public Standard() {
    }

    public int calculations(){

        amount = (hour * 2);
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }
}

