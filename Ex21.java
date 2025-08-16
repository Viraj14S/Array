//WAJP TO IDENTFY REMOVE DUPLICATE ELEMENT FROM ARRAY;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Array after removing duplicate array");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println(arr[i]);
            }
        }

        s.close();
    }
}
