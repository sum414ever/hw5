package library;

import java.util.Scanner;

public class TakeBookViaConsole {
    Scanner sc = new Scanner(System.in);
    static String scan;
    Book book = new Book();
    public void addBookViaConsole(){
        System.out.println("Input date in format 'dd/mm/yyyy-the book name' ");
        scan = sc.next();
        String[] parts = scan.split("-");
        String date = parts[0];
        String book = parts[1];
        this.book.addBook(date,book);
        System.out.println("You took book " + book + " on this date " + date);
        sc = new Scanner(System.in);
        scan=sc.next();
    }
}
