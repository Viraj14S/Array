import java.util.Arrays;

public class Ex37 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr1 = new int[4];
        for (int i = 0; i < arr.length; i++) {
            int sum = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum = sum * arr[j];
                    arr1[i] = sum;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));

    }
}
