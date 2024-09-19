import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
    public static void main(String[] args) {
        LocalDateTime a=LocalDateTime.of(2024,5,15,14,59,0);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(a.format(f));
    }
}
