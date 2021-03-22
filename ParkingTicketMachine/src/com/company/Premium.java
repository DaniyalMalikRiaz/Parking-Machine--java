package com.company;

public class Premium extends TicketingMachine {
    public Premium(int hour, int amount, int carNum) {
        super(hour, amount, carNum);
    }

    public Premium() {

    }

    public int calculation(){
        amount = (hour * 3);
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }
}
