import by.gsu.pms.Manager;

public class Runner {

    public static void main(String[] args) {


        Manager[] managers = {

                new Manager("Sakovich", 45, true),
                null,
                new Manager("Kirievsky", 20, true),
                new Manager("Ivanov", 30, false),
                new Manager("Urchenko", 19, true),
                new Manager("Damov", 45, true),
                new Manager("Lorov", 54, false),
                new Manager("Korob", 30, true),
                new Manager("Binov", 20, true),
                new Manager(),

        };

        int totalPerAge = 0;
        int totalPerDuties = 0;


        for (Manager manager : managers) {
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

