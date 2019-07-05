package library;

import java.util.Scanner;

public class ListOfAllTookBooksByDate {
    static String scan;
    Scanner sc = new Scanner(System.in);

    public void showBookByDate() {
        System.out.println("Input date in format 'dd/mm/yyyy' ");
        scan = sc.next();
        if (AllTookBooks.getAccounting().containsKey(scan)) {
            System.out.println("On this date " + scan + " took this book " + AllTookBooks.getAccounting().get(scan));
        } else System.out.println("On this date " + scan + " didn't take a book");
    }
}
