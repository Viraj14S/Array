
//missing number in an array of 1 to n
import java.util.Scanner;

class Ex31 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of  Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int total = ((n + 1) * (n + 2) / 2);

        // System.out.println(total);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
        s.close();
    }

}