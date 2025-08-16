//WAJP TO MERGE 2 ARRAY

import java.util.Arrays;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of 1st Array");
        int n = s.nextInt();
        int arr1[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter the size of 2nd Array");
        int num = s.nextInt();
        int arr2[] = new int[num];

        System.out.println("Enter the " + num + " elements in Array");
        for (int i = 0; i < num; i++) {
            arr2[i] = s.nextInt();
        }

        int size = n + num;
        int arr3[] = new int[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[j];
                j++;
            }

        }
        Arrays.sort(arr3);
        System.out.println("Merged Arry of Array1 & Array2 is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        // System.out.println(Arrays.binarySearch(arr3, 2));

        s.close();
    }
}
