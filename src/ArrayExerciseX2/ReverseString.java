package ArrayExerciseX2;

public class ReverseString {
    public static void main(String[] args) {
        String value = "Welcome";
        int valueLength = value.length();
        char[] arr = new char[valueLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = value.charAt(valueLength - i -1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
