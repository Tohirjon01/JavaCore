package Package1;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();

        System.out.println(" ikkala sonning yig'indisi = " + (a + b));
        System.out.println(" ikkala sonning kopaytmasi  = " + (a * b));
        System.out.println(" a ning kvadrati  = " + Math.abs(a));
        System.out.println(" b ning kvadrati  = " + Math.abs(b));
    }
}
