package Package1;

import java.util.Scanner;

public class Begin37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First car's speed : ");
        double v1 = scanner.nextDouble();
        System.out.print("First car's speed : ");
        double v2 = scanner.nextDouble();
        System.out.print("All length between two car : ");
        double s = scanner.nextDouble();
        System.out.print("After this time : ");
        double t = scanner.nextDouble();

        double s1 = v1 * t;
        double s2 = v2 * t;
        double y = s - s1 ;
        double x = s - s2 ;

        System.out.println(x+y);
    }
}
