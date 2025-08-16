//WAJP TO REVERSE A GIVEN ARRAY

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int str = 0;
        // int end = n - 1;
        // while (str <= end) {
        // int temp = arr[str];
        // arr[str] = arr[end];
        // arr[end] = temp;
        // str++;
        // end--;
        // }
        int arrr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arrr[str++] = arr[i];
        }

        System.out.println("The reverser Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arrr[i] + " ");
        }
        s.close();
    }
}
