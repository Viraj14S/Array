//WAJP TO REVERSE THE EACH ELEMENT FROM AN ARRAY

import java.util.Scanner;

public class Ex20 {
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
            int sum = 0;
            int element = arr[i];
            while (element != 0) {
                int rem = element % 10;
                sum = sum * 10 + rem;
                element = element / 10;
            }
            arr[i] = sum;

        }

        System.out.println("REVERSE ELEMENT FROM AN ARRAY IS: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }

}
