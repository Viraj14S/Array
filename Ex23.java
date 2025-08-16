//WAJP TO PRINT THE FREQUENCY OF ELEMENTS

import java.util.Scanner;

public class Ex23 {
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
                System.out.println(arr[i] + " had appears " + count + " times");
            }
        }
        s.close();
    }
}