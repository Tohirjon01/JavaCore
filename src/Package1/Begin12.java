package Package1;

import java.util.Scanner;

public class Begin12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a katet = ");
        float a = scanner.nextFloat();
        System.out.print("b katet = ");
        float b = scanner.nextFloat();

        float c = (float) Math.sqrt((a * a + b * b));
        System.out.println("To'g'ri tortburchakning gipotenuzasi = " + c);

        float P = a + b +c;
        System.out.println("To'g'ri tortburchakning perimetri = " + P);

    }
}
