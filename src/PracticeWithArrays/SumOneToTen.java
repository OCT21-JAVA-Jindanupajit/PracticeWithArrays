package PracticeWithArrays;
public class SumOneToTen{

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("The total of 1 to 10 is "+ sum);
    }
}
