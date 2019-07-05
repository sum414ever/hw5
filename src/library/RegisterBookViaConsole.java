package library;

import java.util.Scanner;

public class RegisterBookViaConsole {
    Scanner sc = new Scanner(System.in);
    static String scan;
    BookRegister bookRegister = new BookRegister();
    public void addBookViaConsole(){
        System.out.println("Input date in format 'dd/mm/yyyy-the bookRegister name' ");
        scan = sc.next();
        String[] parts = scan.split("-");
        String date = parts[0];
        String book = parts[1];
        this.bookRegister.addBook(date,book);
        System.out.println("You took bookRegister " + book + " on this date " + date);
        sc = new Scanner(System.in);
        scan=sc.next();
    }
}
