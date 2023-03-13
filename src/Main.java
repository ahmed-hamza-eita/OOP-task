import task_1.Rectangle;
import task_1.Task1;
import task_2.problem2.Circle;
import task_2.problem3.Account;
import task_2.problem4.Student;
import task_2.problem4.Teacher;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ///  task_1_operation();
        task_2_operation();
    }

    private static void task_1_operation() {
        Task1.draw();
        Task1.removeVowels("mObile");
        Task1.locateCharacter("Ahmed hamza", 'a');
        Task1.appendString("Ault", "Kelly");


        System.out.println("Enter the vale of Width and Height? ");
        System.out.print("Width: ");
        double w = s.nextDouble();
        System.out.print("Height: ");
        double h = s.nextDouble();
        Rectangle r = new Rectangle(w, h);
        System.out.println("Area = " + r.area());

    }

    private static void task_2_operation() {
        Circle c = new Circle();
        System.out.println(c.getArea());


        Account a = new Account("1248", "Ahmed hamza", 1000);
        a.showDetails();


        Teacher th = new Teacher("Hamza", "MU");
        th.details();
        th.addCourse("CS");
        th.removeCourse("It");

        Student sc = new Student("Ahmed", "MU");
        sc.details();
        sc.addCourseGrade("CS", 50);
        sc.addCourseGrade("It", 50);
        sc.printCoursesTaken();
        sc.getAverageGrade();


    }
}
