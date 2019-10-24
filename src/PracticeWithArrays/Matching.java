package PracticeWithArrays;

public class Matching {
    public static void main(String[] args) {


        int[] array1 = {1, 7, 6, 5, 9};
        int[] array2 = {2, 7, 6, 3, 4};

        for (int i = 0; i < Math.min(array1.length,array2.length); i++) {
            if (array1[i] == array2[i]) {
                System.out.printf("(%d,%d)\n",array1[i],array2[i]);
            }
        }
    }
}
