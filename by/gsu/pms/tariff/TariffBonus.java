package by.gsu.pms.tariff;


public class TariffBonus  extends Tariff{
    private int packageMinute;
    private int packageInternet;

    public TariffBonus(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet, int costSms,
                       int costMegabyte, Species species, int packageInternet, int packageMinute) {
        super(costSubscriptionFee, costMinuteInNet, costMinuteInOtherNet, costSms, costMegabyte, species);
        this.packageInternet = packageInternet;
        this.packageMinute = packageMinute;
    }
    public int getPackageMinute() {
        return packageMinute;
    }

    public int getPackageInternet() {
        return packageInternet;
    }

    public void setPackageInternet(int packageInternet) {
        this.packageInternet = packageInternet;
    }

    public void setPackageMinute(int packageMinute) {
        this.packageMinute = packageMinute;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Tariff:[Bonus(Package minute= " + packageMinute + ", PackageInternet= " + packageInternet
               + ") " + super.toString() + "]");
        return stringBuilder.toString();
    }
}
