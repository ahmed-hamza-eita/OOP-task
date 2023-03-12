import task_1.Rectangle;
import task_1.Task1;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        task_1_operation();

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
}
