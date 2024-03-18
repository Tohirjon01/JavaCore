package Package1;

import java.util.Scanner;

public class Begin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To'gri to'rtburchakning a = ");
        int a = scanner.nextInt();
        System.out.print("To'gri to'rtburchakning b = ");
        int b = scanner.nextInt();
        int S = a * b;
        int P = 2 * (a + b);
        System.out.println("To'gri to'rtburchakning yuzasi = " + S);
        System.out.println("To'gri to'rtburchakning perimetri = " + P);
    }
}
