
//WAJP IDENTIFY THE AVG OF AN ELEMENT IN AN ARRAY
import java.util.Scanner;

public class Ex7 {
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
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("The avg of elements are: " + sum / arr.length);
        s.close();
    }
}
