package basics.nestedLoops.lab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int solutions = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i + j + k == n) solutions++;
                }
            }
        }
        System.out.println(solutions);
    }
}
