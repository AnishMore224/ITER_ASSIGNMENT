public class Q2 {
    public static void main(String[] args) {
        String s = "abcd";
        s.replace("a", "s");
        System.out.println(s);
        CharSequence cs = s;
        System.out.println(cs.subSequence(0, 3));
        System.out.println(cs.length());
    }
}
/*
 * Output--
 * abcd
 * abc
 * 4
 */