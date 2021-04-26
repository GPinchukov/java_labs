package by.gsu.pms;

public class Com {
    private String name;
    private Byn price;

    public Com(String name, Byn price) {
        this.name = name;
        this.price = price;
    }

    public Com(){
        this("", new Byn());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byn getPrice() {
        return price;
    }

    public void setPrice(Byn price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ";" + price;
    }
}
