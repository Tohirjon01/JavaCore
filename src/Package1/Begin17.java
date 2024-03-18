package Package1;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" A = ");
        double A = scanner.nextDouble();
        System.out.print(" B = ");
        double B = scanner.nextDouble();
        System.out.print(" C = ");
        double C = scanner.nextDouble();

        double AC = Math.abs(A - C);
        System.out.println("the length of the section AC : " + AC);
        double BC = Math.abs(B - C);
        System.out.println("the length of the section BC : " + BC);

        double sum = AC + BC ;
        System.out.println("Length section AC and BC is equal : " + sum );

    }
}
