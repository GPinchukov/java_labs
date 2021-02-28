package by.gsu.pms;

public class Employee {
    //fields

    public static final int RATE = 2500;
    private String account;
    private int transport;
    private int days;

    //constructors

    public Employee() {
        this("",0,0);
    }
    public Employee(String account, int transport, int days) {
        super();
        this.account = account;
        this.transport = transport;
        this.days = days;
    }

    //getters and setters

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
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