package Package1;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grad = scanner.nextDouble();
        double far =(grad - 32) * 5 / 9;
        System.out.println(far);

    }
}
