import java.util.Arrays;
public class Task05 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int NUMS = 13;
        int[] arr = new int[SIZE];
        int counter = 0;
       
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * NUMS) + 0);
            counter++;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        
        System.out.println("With SIZE=" + SIZE + " and " +
                "NUMS=" + NUMS + " the array\nhas been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr));
    }
}