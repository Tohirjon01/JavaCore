package Package1;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radian = scanner.nextDouble();
        double gradus = Math.toDegrees(radian);

        System.out.println(gradus);
    }
}
