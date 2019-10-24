package PracticeWithArrays;

public class PrintNumberBackward {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};

        for (int i = number.length-1; i >= 0; i--) {
            System.out.println(number[i]);

        }
    }
}
