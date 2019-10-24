package ArrayExerciseX2;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        System.out.print("Enter a String > ");
       String value =  (new Scanner(System.in)).nextLine();
       int counter = 0;
       for(char ch : value.toCharArray()) {
            ++counter;
       }
        System.out.printf("The length of \"%s\" is %d\n", value, counter);
    }
}
