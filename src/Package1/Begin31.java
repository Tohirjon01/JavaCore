package Package1;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double far = scanner.nextDouble();
        double celc = (far - 32) * 5 / 9;
        System.out.println(celc);
    }
}
