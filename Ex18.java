
//WAJP TO IDENTIFY THE HIGHEST SUM OF TWO NUMBER FROM AN ARRAY
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        if (arr.length == 1) {
            System.out.println("THE HIGHEST SUM OF TWO NUMBER FROM AN ARRAY is: " + arr[0]);
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                max = Math.max(max, sum);
            }
        }

        System.out.println("THE HIGHEST SUM OF TWO NUMBER FROM AN ARRAY is: " + max);
        s.close();
    }
}
