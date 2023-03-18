package task_2.problem4;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name, address;
    private int size;
    protected ArrayList<String> listCourses ;
    protected ArrayList<Integer>  listGrades;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void details() {
        System.out.println("Name: " + name + "\nAddress: " + address);
    }
}
