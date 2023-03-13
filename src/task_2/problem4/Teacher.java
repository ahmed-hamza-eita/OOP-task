package task_2.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses = new String[5];
    private List<String> list =new ArrayList<>(Arrays.asList(courses));

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {

        if (list.contains(course)) {
            System.out.println("Course already exists");
            return false;
        }
        list.add(course);
        numCourses++;
        System.out.println("Course was added");
        return true;
    }

    public boolean removeCourse(String course) {
        if (!list.contains(course)) {
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
