package Package1;

import java.util.Scanner;

public class Begin9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.println(Math.sqrt(a * b));
    }
}
