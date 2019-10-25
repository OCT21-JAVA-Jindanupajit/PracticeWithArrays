package ArrayExerciseX2;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        int[] value = new int[10];
        int even = 0;
        int odd = 0;
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < value.length; i++) {
            System.out.printf("Enter %2d# >", i+1);
            value[i] = kb.nextInt();
            switch (value[i] % 2) {
                case 0: // even
                    even++;
                    break;
                case 1: // odd
                    odd++;
                    break;
            }

        }
        System.out.printf("Total even number is %d\n",even);
        System.out.printf("Total odd number is %d\n", odd);
    }
}
