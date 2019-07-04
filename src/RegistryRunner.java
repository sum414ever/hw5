import library.*;

import java.util.Scanner;

public class RegistryRunner {

    public static void setDate() {
        System.out.println("Welcome to registry our library");
        System.out.println("Tell what you want: ");
        System.out.println("1. Add to register new book");
        System.out.println("2. Show all dates when books are issued");
        System.out.println("3. Show all issued books");
        System.out.println("4. Search book by date");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        int scan;
        scan = sc.nextInt();
        do {
            switch (scan) {
                case 1:
                    AddBookInConsole addBook = new AddBookInConsole();
                    addBook.addBookViaConsole();
                    break;
                case 2:
                    GetDateInformation getDate = new GetDateInformation();
                    getDate.getDateInformation();
                    break;
                case 3:
                    GetBookInformation getBook = new GetBookInformation();
                    getBook.getBookInformation();
                    break;
                case 4:
                    ShowBookByDate showBook = new ShowBookByDate();
                    showBook.showBookByDate();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("It is incorrect input");
                    break;
            }
            sc = new Scanner(System.in);
            scan = sc.nextInt();
        }
        while (scan > 0 && scan < 5);
    }
}

