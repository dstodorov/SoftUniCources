package basics.conditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float age = Float.parseFloat(scanner.nextLine());
        String gender = scanner.nextLine();

        if(gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }
        }
    }
}
