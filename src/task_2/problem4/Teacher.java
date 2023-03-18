package task_2.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {
    private int numCourses = 0;


    public Teacher(String name, String address) {
        super(name, address);
        listCourses=new ArrayList<>(5);
        listGrades=new ArrayList<>();
    }

    public boolean addCourse(String course) {

        if (listCourses.contains(course)) {
            System.out.println("Course already exists");
            return false;
        }
        listCourses.add(course);
        numCourses++;
        System.out.println("Course was added");
        return true;
    }

    public boolean removeCourse(String course) {
        if (!listCourses.contains(course)) {
            System.out.println("Course not found");
            return false;
        }
        System.out.println("Course was deleted");
        return true;
    }

    @Override
    public void details() {
        super.details();
    }
}
