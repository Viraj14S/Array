//WAJP TO PRINT THE ELEMENT IN ZIGZAG FROM 2 ARRAY
public class Ex30 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 5, 6, 7, 8, 9, 10 };
        int c[] = new int[a.length + b.length];
        int i = 0;
        int x = 0;
        int y = 0;
        while (i < c.length) {
            if (x < a.length) {
                c[i] = a[x];
                i++;
                x++;
            }
            if (y < b.length) {
                c[i] = b[y];
                i++;
                y++;
            }

        }

        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }

    }
}
