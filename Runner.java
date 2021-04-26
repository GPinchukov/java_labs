import by.gsu.asoilab.Material;
import by.gsu.asoilab.Vol;

public class Runner {
    public static void main(String[] args) {
        Material steel = new Material("Steel", 7850);
        Vol wire = new Vol("Wire", steel, 0.03);
        System.out.println(wire);

        wire.setMaterial(new Material("Copper", 8500));
        System.out.println(wire);

        wire.setMaterial(steel);
        System.out.println(wire);
    }
}