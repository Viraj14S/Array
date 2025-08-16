
//WAJP TO IDENTIFY THE SUM OF ODD ELEMENTS AND AVG OF EVEN ELEMENTS
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int sumodd = 0;
        int sumeven = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                sumodd += arr[i];
            } else {
                sumeven += arr[i];
                count++;
            }
        }
        System.out.println("The Sum of odd elements is: " + sumodd);
        System.out.println("The Avg of Even elements is: " + sumeven / count);

        s.close();
    }

}
