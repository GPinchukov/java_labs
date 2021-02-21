import by.gsu.pms.Trip;
import by.gsu.pms.Converter;

public class Runner {

    public static void main(String[] args) {


        Trip[] employees = {

                new Trip("Sakovich", 4500, 1),
                new Trip("Valenko", 4000, 10),
                null,
                new Trip("Kirievsky", 5000, 3),
                new Trip("Ivanov", 10000, 31),
                new Trip("Urchenko", 5500, 18),
                new Trip(),

        };


        for (Trip employee : employees) {
            if (employee != null){
                employee.show();
                System.out.println("------------");
            }
        }


        employees[6].setTransport(700);
        System.out.println(employees[6]);


        System.out.println("Duration = "+(employees[1].getDays()+employees[0].getDays()));


        for (Trip employee : employees) {
            System.out.println(employee);
        }


        int totalExpenses = 0;

        for (Trip employee : employees) {
            if (employee != null) {
                totalExpenses += employee.getTotal();
            }
        }

        System.out.println("Total expenses = " + totalExpenses);


        int max = 0;
        for (Trip employee : employees) {
            if (employee != null && employee.getTotal() > max) {
                max = employee.getTotal();
            }
        }
        System.out.println("Max = " + max);



        Converter newCurrency = new Converter(33,2);
        System.out.println("Converted = " + newCurrency.convert(employees[3].getTotal()));

    }
}