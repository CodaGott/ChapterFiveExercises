import java.util.Scanner;
import java.util.*;
import java.util.Scanner;
public class BarChart {
    private static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int barCounter = 1; barCounter <=5; barCounter++){
            System.out.println("enter number between 1 and 30");
            int getNumberOfPrints = scanner.nextInt();
            for (int barPrinter = 1; barPrinter<= getNumberOfPrints; barPrinter++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
