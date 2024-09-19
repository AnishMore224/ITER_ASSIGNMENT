public class Q8  {
    public static void main(String[] args) {
        Thread a=new Thread(()->{
            System.out.println("hello csw");
        });
        a.start();
    }
}
