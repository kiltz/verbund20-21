package gui.uebung;

import java.time.Duration;
import java.time.Instant;

public class timertest {
    public static void main(String[] args) throws InterruptedException {
        Instant starts = Instant.now();
        Instant ends = Instant.now();
        System.out.println(Duration.between(starts, ends)+"Sekunden");
    }

}
