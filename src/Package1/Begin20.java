package Package1;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        double sum = Math.sqrt((x2 * x2 - 2 * x2 * x1 + x1 * x1) + (y2 * y2 - 2 * y2 * y1 + y1 * y1));
        System.out.println(sum);
    }
}
