
//WAJP TO IDENTIFY THE AVG OF ODD ELEMENTS
import java.util.Scanner;

public class Ex9 {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println("The Avg of odd elements is " + sum / count);

        s.close();
    }
}
