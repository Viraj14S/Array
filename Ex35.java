//WAJP TO SHIFT THE HALF ELEMENTS OF AN ARRAY TO THE END OF THE ARRAY.
//E.G. INPUT: 1 2 3 4 5 6 7 8 9 10
//OUTPUT: 6 7 8 9 10 1 2 3 4 5

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of  Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int mid = n / 2;
        if (arr.length % 2 == 0) {
            mid = arr.length / 2;
        } else {
            mid = (arr.length / 2) + 1;
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[mid];
            arr[mid] = temp;
            mid++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();

    }

}
