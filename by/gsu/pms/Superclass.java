package by.gsu.pms;

public class Superclass {


    private String Commodity;
    private int Price;
    private int Uni_num;

    //constructors

    public Superclass() {
        this("", 0, 0);
    }

    public Superclass(String Commodity, int Price, int Uni_num) {
        super();
        this.Commodity = Commodity;
        this.Price = Price;
        this.Uni_num = Uni_num;
    }

    //getters and setters


}

    public int getCost() {
        return Price*Uni_num;
    }
    public String toString() {
        return Commodity + ";" + Price + ";" + Uni_num;
    }
    public String equals(String Commodity, int Price, int Uni_num, String Commodity2, int Price2, int Uni_num2){
        private boolean eq;

        if (Commodity || Price || Uni_num == Commodity2 || Price2 || Uni_num2 ) {
            return "equal";
        } else
            return "not equal";
    }