package PracticeWithArrays;

public class PrintTheIndex {
    public static void main(String[] args) {
        int[] number = {2,5,9,0,2,1,8,5,4};

        for (int i = 0; i < number.length; i++) {
            if (number[i] == 5)
                System.out.println("The index of value 5 is "+i);
        }
    }
}
