package Osnove;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NoviTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime ldt =LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy.'T'HH:mm"));
        System.out.println(ldt);
    }
}
