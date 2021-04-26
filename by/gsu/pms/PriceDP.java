package by.gsu.pms;

public class PriceDP extends AbP {
    private Byn discount;

    public PriceDP(Commodity commodity, int number, Byn discount) {
        super(commodity, number);
        this.discount = discount;
    }

    public Byn getDiscount() {
        return discount;
    }

    public void setDiscount(Byn discount) {
        this.discount = discount;
    }

    public PriceDP(Byn discount) {
        this.discount = discount;
    }

    @Override
    public Byn getCost() {
        return super.getCost().sub(discount);
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + discount;
    }
}
