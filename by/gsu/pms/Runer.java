import by.gsu.pms.Superclass;

public class Runner {

    public static void main(String[] args) {


        Superclass[] superclasses = {

                new Superclass("Milk", 2500, 3),
                null,
                new Superclass("Lime", 2000, 5),
                new Superclass("Wather", 300, 4),
                new Superclass("Egg",1100, 2),
                new Superclass("Sugar", 500, 2),
                new Superclass("Bread", 800, 1),
                new Superclass("Coke", 400, 5),
                new Superclass("Turcey", 1000, 8),
                new Superclass(),

        };

        string toString = "";
        int equals = 0;
        int getCost = 0;


        for (Superclass manager : managers) {
            if (manager != null){
                totalPerAge+=manager.getPerAge();
                if (manager.isPerDuties()){
                    totalPerDuties+=1;
                }
            }
        }


        int averagePerAge = totalPerAge/ managers.length;
        System.out.println("Average age = " + averagePerAge);
        System.out.println("Workers in charge = " + totalPerDuties);
    }
}