package library;

import java.util.Scanner;

public class ShowBookByDate {
    static String scan;
    AddBook addBook = new AddBook();
    Scanner sc = new Scanner(System.in);

    public void showBookByDate() {
        System.out.println("Input date in format 'dd/mm/yyyy' ");
        scan = sc.next();
        if (LoadRegister.getAccounting().containsKey(scan)) {
            System.out.println("On this date " + scan + " took this book " + LoadRegister.getAccounting().get(scan));
        } else System.out.println("On this date " + scan + " didn't take a book");
    }
}
