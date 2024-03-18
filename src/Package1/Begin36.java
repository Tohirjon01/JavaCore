package Package1;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First car's speed : " );
        double v1 = scanner.nextDouble();
        System.out.print("Second car's speed : ");
        double v2 = scanner.nextDouble();
        System.out.print("After time : ");
        double t = scanner.nextDouble();
        System.out.print("Length between two car : " );
        double s = scanner.nextDouble();

        double car1S =  v1 * t ;
        double car2S = v2 * t;
        double alllength = s + car1S + car2S ;

        System.out.println(alllength);
    }
}
