package by.gsu.pms;

public abstract class AbP implements Comparable<AbP>{
    private Commodity commodity;
    private int number;

    public AbP(Commodity commodity, int number) {
        this.commodity = commodity;
        this.number = number;
    }

    public AbP() {

    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Byn getCost(){
        return commodity.getPrice().mul(number);
    }

    @Override
    public final String toString() {
        return fieldsToString() + ";" + getCost();
    }

    protected String fieldsToString(){
        return  commodity + ";" + number;
    }

    @Override
    public int compareTo(AbP abP) {
        return abP.getCost().compareTo(this.getCost());
    }
}
