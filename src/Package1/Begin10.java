package Package1;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();

        System.out.println(" ikkala sonning yig'indisi = " + (a + b));
        System.out.println(" ikkala sonning kopaytmasi  = " + (a * b));
        System.out.println(" a ning kvadrati  = " + a * a);
        System.out.println(" b ning kvadrati  = " + b * b);

    }
}
