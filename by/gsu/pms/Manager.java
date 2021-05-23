package by.gsu.pms;

import java.io.Serializable;
import java.util.Scanner;

public class Manager implements Serializable {

    private String name;
    private int age;
    private boolean duty;

    public Manager() {
        this("",0, false);
    }
    public Manager(String name, int age, boolean duty) {
        super();
        this.name = name;
        this.age = age;
        this.duty = duty;
    }
    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
        this.duty = false;
    }

    public Manager(Scanner scanner){
        this(scanner.next(), scanner.nextInt(), scanner.nextBoolean());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean haveDute() {
        return duty;
    }

    public void setDute(boolean duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return name + ";" + age + ";" + duty + ";";
    }
}
