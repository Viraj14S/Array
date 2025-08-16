public class Ex39 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int n = 2;
        int ans = 0;
        int count = 0;
        while (true) {
            if (isprime(n)) {
                count++;
                if (count == x) {
                    ans = n;
                    break;
                }
            }
            n++;
        }
        System.out.println(ans / y);
    }

    public static boolean isprime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
