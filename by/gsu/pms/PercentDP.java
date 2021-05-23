package by.gsu.pms;

import java.util.Scanner;

public class PercentDP extends Purchase {
    private double discount;
    private static final int NUMBER_DISCOUNT = 300;

    public PercentDP() {
        this("", 0,0,0);
    }

    public PercentDP(String name, int price, int number, double discount) {
        super(name, price, number);
        this.discount = discount;
    }

    public PercentDP(Scanner scanner){
        this(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public int getCost() {
        return getNumber() > NUMBER_DISCOUNT ? (int)Math.round(super.getCost() * (1 - discount)): super.getCost();
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}