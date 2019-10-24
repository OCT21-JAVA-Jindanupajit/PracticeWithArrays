package PracticeWithArrays;


import java.util.Scanner;

public class AverageTenNumbers {
    public static void main(String[] args) {
        int[] number = new int[10];
        int sum = 0;
        Scanner kb = new Scanner(System.in);


        for (int i = 0; i < number.length; i++) {
            System.out.printf("Number %2d > ",i+1);
            number[i] = kb.nextInt();
            sum += number[i];
        }

        System.out.printf("The Average is %.2f",((float)sum)/10);
    }
}
