package Package1;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aylananing diametrini kiriting = ");
        int d = scanner.nextInt();
        float pi = 3.14f ;
        float L = (float) (pi * d);
        System.out.println("Aylananing uzunligi = " + L);

    }
}
