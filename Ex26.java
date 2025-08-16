
//WAJP TO INSERT ARRAY AT SPECIFIC POSITION AND SHIFT ALL ELEMENTS TO RIGHT AND LOOSE 1 OF THE ELEMENT FROM RIGHT
// 10 20 30 40 50 
// 100
// POS:1
// 100 10 20 30 40 
import java.util.Scanner;

class Ex26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the " + n + " elements in Array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.err.println("Enter the element");
        int element = s.nextInt();
        System.out.println("Enter the poistion");
        int pos = s.nextInt();
        if (pos > 0 && pos <= n) {
            for (int i = n - 1; i > pos - 1; i--) {
                arr[i] = arr[i - 1];
            }
        } else {
            System.out.println("Invalid Position");
            System.exit(0);
        }
        arr[pos - 1] = element;
        System.out.println("Element of array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}