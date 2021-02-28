import by.gsu.pms.Manager;

public class Runner {

    public static void main(String[] args) {


        Manager[] manager = {

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
