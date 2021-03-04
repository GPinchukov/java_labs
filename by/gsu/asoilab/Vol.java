package by.gsu.asoilab;

public class Vol {


    private String Name;
    private String Material;
    private int Volume;

    //constructors

    public Vol() {
        this("", "", 0);
    }

    public Vol(String Name, String Material, int Volume) {
        super();
        this.Name = Name;
        this.Material = Material;
        this.Volume = Volume;
    }

    //getters and setters

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }
    getDensity(){

    }
}

    public int getMass() {
        return ;
}