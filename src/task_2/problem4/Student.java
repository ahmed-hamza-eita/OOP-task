package task_2.problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student extends Person {



    public Student(String name, String address) {
        super(name, address);
        listCourses=new ArrayList<>(30);
        listGrades=new ArrayList<>();
    }

    public void addCourseGrade(String course, int grade) {
        listCourses.add(course);
        listGrades.add(grade);

     }

    public void printCoursesTaken() {
        System.out.print("Courses taken: ");
        for (String cours : listCourses) {
            if (!(cours == null)) {
                System.out.print(cours + "  ");
            }
        }
        System.out.println();
    }


    public void getAverageGrade() {
        double sum = 0;
        int len = listGrades.size();
        for (int grade : listGrades) {
            sum += grade;
        }
        System.out.println("Average grades: " + sum / len);
    }


}
