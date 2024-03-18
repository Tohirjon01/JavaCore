package Package1;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert speed of boat");
        double v = scanner.nextDouble();
        System.out.print("Insert speed of flow");
        double u = scanner.nextDouble();
        System.out.print("insert time t1 = ");
        double t1 = scanner.nextDouble();
        System.out.print("insert time t2 = ");
        double t2 = scanner.nextDouble();
        double s1 = (v + u ) * t1;
        double s2 = (u - v) *t2;
        double S = s1 + s2 ;
        System.out.println("Total path of the ship " + S);
    }
}
