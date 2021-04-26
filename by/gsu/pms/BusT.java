package by.gsu.pms;

public class BusT implements Comparable<BusT>{
    private static int dailyRate = 25000;
    private String account;
    private int transportExpenses;
    private int days;

    public BusT() {
        this("",0,0);
    }

    public BusT(String account, int transportExpenses, int days) {
        this.account = account;
        this.transportExpenses = transportExpenses;
        this.days = days;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static int getDailyRate() {
        return dailyRate;
    }

    public static void setDailyRate(int dailyRate) {
        BusT.dailyRate = dailyRate;
    }


    public int getTotal() {
        return days * dailyRate + transportExpenses;
    }

    public void show() {
        System.out.println("rate = " + dailyRate + "\n"
                +"account = " + account + "\n"
                +"transport = " + getTransportExpenses() + "\n"
                +"days = " + days + "\n"
                +"total = " + getTotal());
    }

    @Override
    public String toString() {
        final String SEPARATOR = ";";
        return dailyRate + SEPARATOR + account + SEPARATOR + getTransportExpenses() + SEPARATOR + days +
                SEPARATOR + getTotal();
    }

    @Override
    public int compareTo(BusT businessT) {
        return businessT.getTotal() - getTotal();
    }
}
