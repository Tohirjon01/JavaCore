package Package1;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" S = ");
        float S = scanner.nextFloat();
        float pi = 3.14F;

        float R = (float) Math.sqrt(S / pi);
        float D = 2 * R;

        System.out.println("Aylananing radiusi = " + R);
        System.out.println("Aylananing diametri = " + D);


    }
}
