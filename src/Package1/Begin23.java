package Package1;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        System.out.print("C = ");
        int C = scanner.nextInt();


        int sum = A ;
        A = B ;
        int sam = B ;
        B = C ;
        int all = sam   ;
        C = A;


        System.out.println("After exchange A = " + A);
        System.out.println("After exchange B = " + B);
        System.out.println("After exchange C = " + C);

    }
}
