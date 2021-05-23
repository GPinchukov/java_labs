import by.gsu.pms.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {

        final String TEXT_CSV = "E:\\programming\\java\\java\\idz2\\src\\text.scv";

        try (Scanner scanner = new Scanner(new FileReader(TEXT_CSV))) {
            int totalPayment = 0;
            int totalKids = 0;
            final int MAX = 10;
            Employee[] employees = new Employee[MAX];



            for (int i = 0; i < MAX; i++) {
                try{
                    employees[i] = new Employee(scanner);
                }catch(Exception e){
                    employees[i] = new Employee();
                }
            }
            for (Employee employee : employees) {
                System.out.println(employee);
            }

            for (Employee employee : employees) {
                if (employee != null) {
                    totalPayment += employee.getPayment();
                    if (employee.haveKids()) {
                        totalKids += 1;
                    }
                }
            }
            int averagePayment = totalPayment / employees.length;
            System.out.println("Average payment = " + averagePayment);
            System.out.println("Employees with kids = " + totalKids);

            final String DAT_FILE = "E:\\programming\\java\\java\\idz2\\src\\text.dat";


            System.out.println("-------Serialization-------------");

            Serializer.serialize(employees, DAT_FILE);
            employees = Deserializer.deserialize(DAT_FILE);

            for (Employee employee : employees) {
                System.out.println(employee);
            }



        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
