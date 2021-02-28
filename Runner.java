import by.gsu.pms.Manager;

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


        /*
         *2) Print the array content to the console, using show( ) method.
         */

        for (EmployeeExpenses employee : employees) {
            if (employee != null){
                employee.show();
                System.out.println("------------");
            }
        }

        /*
         *3) Change the employee`s transportaion expenses for the last object of the array.
         */

        employees[6].setTransport(700);
        System.out.println(employees[6]);

        /*
         *4) Print the duration of two initial business trips by the single operator.
         * Example:
         * Duration = 9
         */

        System.out.println("Duration = "+(employees[1].getDays()+employees[0].getDays()));

        /*
         *5) Print the array content to the console (one element per line), using toString( ) method implicitly.
         */

        for (EmployeeExpenses employee : employees) {
            System.out.println(employee);
        }

        /*
         *6) Find the sum of total expenses.
         */

        int totalExpenses = 0;

        for (EmployeeExpenses employee : employees) {
            if (employee != null) {
                totalExpenses += employee.getTotal();
            }
        }

        System.out.println("Total expenses = " + totalExpenses);

        /*
         * 7) Find and print account name employee’s with maximum total expenses.
         */

        int max = 0;
        for (EmployeeExpenses employee : employees) {
            if (employee != null && employee.getTotal() > max) {
                max = employee.getTotal();
            }
        }
        System.out.println("Max = " + max);

        Converter Rus = new Converter(33,2);
        System.out.println("Conv = " + Rus.convert(employees[3].RATE));


    }
}
