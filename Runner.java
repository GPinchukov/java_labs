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
                Meneger[] menegers = new Manager[MAX];


            for (int i = 0; i < MAX; i++) {
                try{
                    menegers[i] = new Manager(scanner);
                }catch(Exception e){
                    menegers[i] = new Manager();
                }
            }
            for (Manager meneger : menegers) {
                System.out.println(meneger);
            }

            for (Manager meneger : menegers) {
                if (meneger != null) {
                    totalPayment += meneger.getPayment();
                    if (meneger.haveKids()) {
                        totalKids += 1;
                    }
                }
            }
            int averagePayment = totalPayment / meneger.length;
            System.out.println("Average payment = " + averagePayment);
            System.out.println("meneger with kids = " + totalKids);

            final String DAT_FILE = "E:\\programming\\java\\java\\idz2\\src\\text.dat";


            System.out.println("-------Serialization-------------");

            Serializer.serialize(menegers, DAT_FILE);
            meneger = Deserializer.deserialize(DAT_FILE);

            for (Manager meneger : menegers) {
                System.out.println(meneger);
            }



        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
