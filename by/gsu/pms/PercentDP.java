package by.gsu.pms;

public class PercentDP extends AbP{
    private double discount;

    public PercentDP(Commodity commodity, int number, int discount) {
        super(commodity, number);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public Byn getCost() {
        return super.getCost().mul((100 - discount)/100);
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + discount;
    }
}
