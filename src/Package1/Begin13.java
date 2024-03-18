package Package1;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("R1 =");
        float R1 = scanner.nextFloat();
        System.out.print("R2 =");
        float R2 = scanner.nextFloat();

        float S1 = (float) (Math.PI * R1);
        float S2 = (float) (Math.PI * R2);
        float S3 = (float) (Math.PI * (R1 - R2));

        System.out.println(" S1 = " + S1);
        System.out.println(" S2 = " + S2);
        System.out.println(" Ularnign ayirmasi S3 = " + S3);
    }
}
