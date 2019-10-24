package PracticeWithArrays;

public class StoreThreeNames {
    public static void main(String[] args) {
        String[] name = {"Jane Doe", "John Doe", "Jack Doe"};

        for (int i = 0; i < name.length; i++) {
            System.out.println("Name "+(i+1)+" is "+name[i]);
        }
    }
}
