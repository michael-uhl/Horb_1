package a03_Date;

import static java.lang.System.out;
import static java.time.Duration.between;
import static java.time.LocalDateTime.now;
import static java.time.LocalDateTime.of;

public class Differenz {

    public static void main(String[] args) {
        out.println(between(of(1978, 10, 14, 0, 0), now()).toMinutes());
    }

}
