package by.gsu.pms.tariff;


public class Tariff {
    public String type;
    private int costSubscriptionFee;
    private int costMinuteInNet;
    private int costMinuteInOtherNet;
    private int costSms;
    private int costMegabyte;
    private Species species;

    public Tariff(int costSubscriptionFee, int costMinuteInNet, int costMinuteInOtherNet,int costSms, int costMegabyte,Species species) {
        super();
        this.costSubscriptionFee = costSubscriptionFee;
        this.costMinuteInNet=costMinuteInNet;
        this.costMinuteInOtherNet=costMinuteInOtherNet;
        this.costSms=costSms;
        this.costMegabyte=costMegabyte;
        this.species = species;
    }
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    public int getCostSubscriptionFee() {
        return costSubscriptionFee;
    }
    public void setCostSubscriptionFee(int costSubscriptionFee) {
        this.costSubscriptionFee = costSubscriptionFee;
    }
    public int getCostMinuteInNet(){
        return costMinuteInNet;
    }
    public void setCostMinuteInNet(int costMinuteInNet) {
        this.costMinuteInNet=costMinuteInNet;
    }
    public int getCostMinuteInOtherNet(){
        return costMinuteInOtherNet;
    }
    public void setCostMinuteInOtherNet(int costMinuteInOtherNet) {
        this.costMinuteInOtherNet=costMinuteInOtherNet;
    }
    public int getCostSms(){
        return costSms;
    }
    public void setCostSms(int costSms) {
        this.costSms=costSms;
    }
    public int getCostMegabyte(){
        return costMegabyte;
    }
    public void setCostMegabyte(int costMegabyte) {
        this.costMegabyte=costMegabyte;
    }
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cost subscription fee= "+ costSubscriptionFee +", Cost minute in net= " + costMinuteInNet + ", Cost minute in other net= " + costMinuteInOtherNet + ", Cost megabyte= " + costMegabyte+ ", Cost sms= " + costSms + "tariff plan -" + species);
        return stringBuilder.toString();
    }
}
