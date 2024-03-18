public class RabinKarp {
    public static void main(String[] args) {
        RabinKarp obj = new RabinKarp();
        obj.Rabinkarp("23590231415267399131415", "31415", 13, 10);
    }

    public void Rabinkarp(String text, String pattern, int q, int d) {
        int m = pattern.length();
        int n = text.length();
        int h = 1;
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }
        int p = 0, t = 0;
        for (int i = 0; i < m; i++) {
            p = (d * p + (pattern.charAt(i) - 48)) % q;
            t = (d * t + (text.charAt(i) - 48)) % q;
        }
        for (int s = 0; s < n - m + 1; s++) {
            if (p == t) {
                boolean b = true;
                for (int i = 0; i < m; i++) {
                    if (text.charAt((s + i)) != pattern.charAt(i)) {
                        b = false;
                    }
                }
                if (b == true) {
                    System.out.println("Found at index:" + s);
                }
            }
            if (s < n - m) {
                t = (d * (t - (text.charAt(s) - 48) * h) + (text.charAt(s + m) - 48)) % q;
                if (t < 0) {
                    t += q; // Ensure t is positive
                }
            }
        }
    }
}
/*
 * Output---
 * Found at index:6
 * Found at index:18
 */