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

        System.out.println("\nBefore");
        for (int i : value) {
            System.out.print(i+" ");
        }

        System.out.println("\nAfter");

        String toPrint = "";
        outer:
        for (int i = value.length -1 ; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (value[i]==value[j]) {
                    continue outer;
                }

            }

            toPrint = +value[i]+" "+toPrint;
        }

        System.out.println(toPrint);


    }
}
