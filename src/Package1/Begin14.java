package Package1;

import java.util.Scanner;

public class Begin14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" L = ");
        float L = scanner.nextFloat();
        float Pi = 3.14F;

        float R = (2 * Pi) / L;
        float S = (float) (Pi * Math.pow(R,2));

        System.out.println("Aylananing radiusi R = " + R);
        System.out.println("Aylananing yuzasi S = " + S);
    }
}
