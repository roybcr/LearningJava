import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Coordinates of point A: ");
        double xA = scan.nextDouble();
        double yA = scan.nextDouble();

        System.out.println("Enter Coordinates of point B: ");
        double xB = scan.nextDouble();
        double yB = scan.nextDouble();

        System.out.println("Enter Coordinates of point C: ");
        double xC = scan.nextDouble();
        double yC = scan.nextDouble();
        scan.close();

        double AB = Math.round(Math.sqrt(Math.pow((xA - xB), 2) + Math.pow((yA - yB), 2)));
        double AC = Math.round(Math.sqrt(Math.pow((xA - xC), 2) + Math.pow((yA - yC), 2)));
        double BC = Math.round(Math.sqrt(Math.pow((xB - xC), 2) + Math.pow((yB - yC), 2)));

        System.out.println("AB Length:\t" + AB);
        System.out.println("AC Length:\t" + AC);
        System.out.println("BC Length:\t" + BC);

        counter += AB == AC ? 1 : 0;
        counter += AB == BC ? 1 : 0;
        counter += AC == BC ? 1 : 0;

        if (counter > 2)
            System.out.println("Equilateral Triangle");

        else if (counter == 1)
            System.out.println("Isosceles triangle");

        else
            System.out.println("Triangle");

        // Drawing the triangle in the console
        int longest = (int) Math.max(Math.max(AB, AC), BC);

        for (int i = 1; i <= longest; i++) {

            if (i % 2 == 0) {
                System.out.println(" ");
            } else {
                if (i == 1) {

                    for (int j = 0; j < ((longest - i) / 2); j++) {
                        System.out.print(" ");
                    }

                    for (int x = 0; x < i; x++) {
                        System.out.print(" * ");
                    }

                    for (int r = 0; r < ((longest - i) / 2); r++) {
                        System.out.print(" ");
                    }

                    System.out.println(" ");
                    System.out.println(" ");
                }

                for (int j = 0; j < ((longest - i) / 2); j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int x = 0; x < i; x++) {
                    System.out.print("*");
                }

                System.out.print("*");

                for (int r = 0; r < ((longest - i) / 2); r++) {
                    System.out.print(" ");
                }

                System.out.println(" ");
            }
        }

    }
}