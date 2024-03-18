package Package1;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sweet kg");
        double kg = scanner.nextDouble();
        System.out.print("All price sweet");
        double price = scanner.nextDouble();

        double y = scanner.nextDouble();

        double perkgprice = price / kg ;

        double cost = perkgprice * y ;
        System.out.println(cost);

    }

}
