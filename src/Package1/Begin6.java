package Package1;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Paralelepipeding tomonini kiting a = ");
        int a = scanner.nextInt();
        System.out.print("Paralelepipeding tomonini kiting b = ");
        int b = scanner.nextInt();
        System.out.print("Paralelepipeding tomonini kiting c = ");
        int c = scanner.nextInt();

        int V = a * b * c;
        int S = 2 * (a * b + b * c + a * c);

        System.out.println("Paralelepipeding hajmi = " + V);
        System.out.println("Paralelepipeding to'la sirti  = " + S);
    }
}
