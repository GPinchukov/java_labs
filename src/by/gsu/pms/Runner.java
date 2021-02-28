import by.gsu.pms.Employee;
import by.gsu.pms.Converter;

public class Runner {

    public static void main(String[] args) {


        EmployeeExpenses[] employees = {

                new EmployeeExpenses("Sakovich", 4500, 1),
                new EmployeeExpenses("Valenko", 4000, 10),
                null,
                new EmployeeExpenses("Kirievsky", 5000, 3),
                new EmployeeExpenses("Ivanov", 10000, 31),
                new EmployeeExpenses("Urchenko", 5500, 18),
                new EmployeeExpenses(),

        };



        for (EmployeeExpenses employee : employees) {
            if (employee != null){
                employee.show();
                System.out.println("------------");
            }
        }


        employees[6].setTransport(700);
        System.out.println(employees[6]);


        System.out.println("Duration = "+(employees[1].getDays()+employees[0].getDays()));


        for (EmployeeExpenses employee : employees) {
            System.out.println(employee);
        }


        int totalExpenses = 0;

        for (EmployeeExpenses employee : employees) {
            if (employee != null) {
                totalExpenses += employee.getTotal();
            }
        }

        System.out.println("Total expenses = " + totalExpenses);


        int max = 0;
        for (EmployeeExpenses employee : employees) {
            if (employee != null && employee.getTotal() > max) {
                max = employee.getTotal();
            }
        }
        System.out.println("Max = " + max);


        Converter newCurrency = new Converter(33,2);
        for (EmployeeExpenses employee : employees) {
            if (employee != null) {
                newCurrency.convert(employee);
                System.out.println("__________");
            }
        }

    }
}