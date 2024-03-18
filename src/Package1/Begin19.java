package Package1;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print(" y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print(" x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print(" y2 = ");
        double y2 = scanner.nextDouble();
        double length = Math.abs(x2 - x1);
        double width = Math.abs(y2 - y1);

        double P = 2 * (length + width);
        double S = length * width;

        System.out.println("length is : " + length);
        System.out.println("width is : " + width);
        System.out.println("Perimetr is " + P);
        System.out.println("Area is " + S);
    }
}
