package library;

import java.util.Scanner;

public class BooksByDateInformationProvider {
    static String scan;
    Scanner sc = new Scanner(System.in);

    public void showBookByDate() {
        System.out.println("Input date in format 'dd/mm/yyyy' ");
        scan = sc.next();
        if (BookRegisterInitializer.getAccounting().containsKey(scan)) {
            System.out.println("On this date " + scan + " took this bookRegister " + BookRegisterInitializer.getAccounting().get(scan));
        } else System.out.println("On this date " + scan + " didn't take a bookRegister");
    }
}
