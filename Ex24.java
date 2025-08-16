//WAJP TO PRINT FREQUENCY OF DUPLICATE ELEMENT

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] != Integer.MIN_VALUE) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
                if (count > 1)
                    System.out.println(arr[i] + " had Repeated " + count + " times");
            }
        }
        s.close();
    }
}
