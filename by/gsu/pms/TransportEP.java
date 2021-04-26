package by.gsu.pms;

public class TransportEP extends AbP{
    private Byn transportExpenses;

    public TransportEP(Commodity commodity, int number, Byn transportExpenses) {
        super(commodity, number);
        this.transportExpenses = transportExpenses;
    }

    public Byn getTransportEP() {
        return transportExpenses;
    }

    public void setTransportExpenses(Byn transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    @Override
    public Byn getCost() {
        return super.getCost().add(transportExpenses);
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + transportExpenses;
    }
}
