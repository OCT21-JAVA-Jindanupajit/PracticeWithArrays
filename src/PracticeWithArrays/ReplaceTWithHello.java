package PracticeWithArrays;

import java.sql.SQLOutput;

public class ReplaceTWithHello {
    public static void main(String[] args) {
        String[] value = {"w","t","y","h","k"};
        System.out.println("\nBefore");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        for (int i = 0; i < value.length; i++) {
            if (value[i].compareTo("t") == 0)   {
                value[i] = "hello";
            }
        }
        System.out.println("\nAfter");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }
}
