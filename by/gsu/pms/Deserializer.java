package by.gsu.pms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    private MyDeserializer(){}

    public static Employee[] deserialize(String file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Employee[]) inputStream.readObject();
        } catch (Exception e) {
            return new Employee[0];
        }
    }
}
