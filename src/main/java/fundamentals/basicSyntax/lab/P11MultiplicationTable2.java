package fundamentals.basicSyntax.lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) System.out.printf("%d X %d = %d%n", n, times, n * times);
        else {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }
    }
}
