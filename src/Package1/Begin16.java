package Package1;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a =");
        double a = scanner.nextDouble();
        System.out.print("b =");
        double b = scanner.nextDouble();
        double distance = Math.abs(a - b);
        System.out.println(" The distance between " + a + " and " + b + " on the number line is: " + distance);
    }
}
