package Package1;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("point A = ");
        double pointA = scanner.nextDouble();
        System.out.print("point B = ");
        double pointB = scanner.nextDouble();
        System.out.print("point C = ");
        double pointC= scanner.nextDouble();

        double distanceAC = Math.abs(pointA - pointB);
        double distanceBC = Math.abs(pointB - pointC);

        double multipleACBC = distanceAC * distanceBC ;

        System.out.println(multipleACBC);
    }
}
