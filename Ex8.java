//WAJP TO IDENTIFY THE SUM OF GIVEN EVEN ELEMENTS

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        System.out.println("The sum of even elements are");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        s.close();
    }
}
