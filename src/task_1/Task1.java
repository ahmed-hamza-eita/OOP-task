package task_1;

import java.util.HashMap;

public class Task1 {

    //MarioPyramid
    public static void draw() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Vowels Removal
    public static void removeVowels(String str) {

        str = str.toLowerCase();
        String s = str.replaceAll("[aeiou]", "");
        System.out.println(s);

    }

    //Character Locator
    public static void locateCharacter(String str, char l) {
        str = str.toLowerCase();
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len  ; i++) {
            if (str.charAt(i) == l) {
                count++;
            }

        }
        System.out.println(count);
    }

    //Append String
    public static void appendString(String str1, String str2) {
        StringBuffer buffer = new StringBuffer(str1);
        buffer.insert((str1.length()/2),str2);
        System.out.println(buffer.toString());
    }
}
