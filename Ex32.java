//WAJP TO PRINT MISSING ELEMENT IN AN ARRAY

import java.util.Arrays;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of  Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Missing Element from an Array");
        int ele = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != ele) {
                System.out.print(ele + " ");
                i--;
            }
            ele++;
        }

        s.close();
    }
}
