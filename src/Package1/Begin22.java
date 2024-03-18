package Package1;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();

        int sum = A ;
        A = B ;
        B = sum ;

        System.out.println("A = " + A );
        System.out.println(" B = " + B);
    }

}
