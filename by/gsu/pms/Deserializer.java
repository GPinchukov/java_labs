package by.gsu.pms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyDeserializer {
    private MyDeserializer(){}

    public static Manager[] deserialize(String file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Manager[]) inputStream.readObject();
        } catch (Exception e) {
            return new Manager[0];
        }
    }
}
