
//WAJP TO FIND 2 SMALLEST FROM ARRAY
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (small > arr[i]) {
                ssmall = small;
                small = arr[i];
            } else if (arr[i] < ssmall && arr[i] != small) {
                ssmall = arr[i];
            }
        }
        // System.out.println(small);
        System.out.println("The second smallest element in an array is: " + ssmall);
        s.close();
    }

}
