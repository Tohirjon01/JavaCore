package Package1;

import java.util.Scanner;

public class Begin5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kubning yon tomonini kiriting ");
        int a = scanner.nextInt();
        int V = a * a * a;
        int S = 6 * a * a;
        System.out.println("Kubning hajmi = " + V);
        System.out.println("Kubning to'la sirti = " + S
        );
    }
}
