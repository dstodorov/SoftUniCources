package basics.forLoop.moreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }
        }

        System.out.printf("%.2f%%%n", 1.0 * sectorA / fans * 100);
        System.out.printf("%.2f%%%n", 1.0 * sectorB / fans * 100);
        System.out.printf("%.2f%%%n", 1.0 * sectorV / fans * 100);
        System.out.printf("%.2f%%%n", 1.0 * sectorG / fans * 100);
        System.out.printf("%.2f%%%n", 1.0 * (sectorA + sectorB + sectorV + sectorG) / stadiumCapacity * 100);

    }
}
