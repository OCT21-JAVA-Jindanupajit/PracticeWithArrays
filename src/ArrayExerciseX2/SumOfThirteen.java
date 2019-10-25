package ArrayExerciseX2;

public class SumOfThirteen {

    public static void main(String[] args) {
        int[] array1 = {1,7,6,5,9};
        int[] array2 = {2,7,6,3,4};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if ((array1[i] + array2[j])==13)
                    System.out.printf("(%d,%d)\n",array1[i],array2[j]);
            }
        }


    }
}
