package by.gsu.asoilab;

public class Material {


    private String Name;
    private int Density;

    //constructors

    public Material() {
        this("", 0);
    }

    public Material(String Name, int Density) {
        super();
        this.Name = Name;
        this.Density = Density;
    }

    //Methods

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDensity() {
        return Density;
    }

    public void setDensity(int density) {
        Density = density;
    }

    public String toString() {
        return Name + ";" + Density;
    }

}




