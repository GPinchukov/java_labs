package by.gsu.pms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MySerializer {
    private MySerializer(){}

    public static void serialize(Employee[] Employees, String file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(Employees);
        } catch (Exception e) {
        }
    }
}