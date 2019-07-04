package library;

import java.util.Scanner;

public class ReferenceInformation {
    static String scan;
    Scanner sc = new Scanner(System.in);

    public void showBookByDate() {
        System.out.println("Input date in format 'dd/mm/yyyy' ");
        scan = sc.next();
        if (Register.getAccounting().containsKey(scan)) {
            System.out.println("On this date " + scan + " took this book " + Register.getAccounting().get(scan));
        } else System.out.println("On this date " + scan + " didn't take a book");
    }
}
