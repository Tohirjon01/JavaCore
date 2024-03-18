package Package1;

import java.util.Scanner;

public class Begin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kvadratning tomonini kiriting = ");
        int a = scanner.nextInt();
        int S = a * a;
        System.out.println("Kvadratning yuzasi = " + S);
    }
}
