package Package1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Begin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doiraning radiusini kiring ");
        int R = scanner.nextInt();
        double L = 2 * Math.PI * R;
        double S = Math.PI * Math.pow(R, 2);


        System.out.println(L);

        System.out.println("Doiraning yuzasi = " + S);


    }
}
