package by.gsu.pms;

public class Trip {

    public static final int RATE = 2500;
    private String account;
    private int transport;
    private int days;


    public Trip () {
        this("",0,0);
    }
    public Trip (String account, int transport, int days) {
        super();
        this.account = account;
        this.transport = transport;
        this.days = days;
    }


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
