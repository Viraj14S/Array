//check the odd number from given array

import java.util.Scanner;

class Ex3 {
    public static boolean odd(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The Odd number from the array are:");
        for (int i = 0; i < n; i++) {
            if (odd(arr[i])) {
                System.out.println(arr[i]);
            }

        }
        s.close();
    }

}
