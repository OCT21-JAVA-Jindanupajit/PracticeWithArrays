package ArrayExerciseX2;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] value = new int[10];
        Scanner kb = new Scanner(System.in);

        for (int i = 0; i < value.length; i++) {
            System.out.printf("Number %2d > ",i+1);
            value[i] = kb.nextInt();
        }

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }




    }
}
