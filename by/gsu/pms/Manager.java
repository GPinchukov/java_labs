package by.gsu.pms;

public class Manager {


    private String perName;
    private int perAge;
    private boolean perDuties;

    //constructors

    public Manager() {
        this("",0,false);
    }
    public Manager(String perName, int perAge, boolean perDuties) {
        super();
        this.perName = perName;
        this.perAge = perAge;
        this.perDuties = perDuties;
    }

    //getters and  vetterrr

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public int getPerAge() {
        return perAge;
    }

    public void setPerAge(int perAge) {
        this.perAge = perAge;
    }

    public boolean isPerDuties() {
        return perDuties;
    }

    public void setPerDuties(boolean perDuties) {
        this.perDuties = perDuties;
    }


    //methods

    public int getTotal() {
        return RATE * days + transport;
    }

    public void show() {

        System.out.println("rate = " + RATE);
        System.out.println("account = " + account);
        System.out.println("transport = " + transport);
        System.out.println("days = " + days);

    }

    @Override
    public String toString() {
        return RATE + ";" + account + ";" + transport + ";" + days + ";" + getTotal();
    }


}
