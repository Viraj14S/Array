public class Ex36 {
    public static void main(String[] args) {
        String s = "sonawane";

        boolean[] visited = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (!visited[i]) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 0) {
                    System.err.println(s.charAt(i) + " is present " + (count + 1) + " times");
                }

            }
        }
    }
}