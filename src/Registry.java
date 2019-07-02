import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registry {
    Map<String, String> accounting = new HashMap<>();

    public void takeABook(String date, String book) {
        accounting.put(date, book);
        System.out.println("Today " + date + " you took the book " + book);
    }

    public void whenTheBookIsTaken(String d) {
        if (accounting.get(d) == null) {
            System.out.println("On this date " + d + " didn't take a book");
        } else System.out.println("On this date " + d + " took this book " + accounting.get(d));
    }

    public void loadRegister() {
        accounting.put("26/01/2019", "In Search of Lost Time by Marcel Proust");
        accounting.put("26/02/2019", "Don Quixote by Miguel de Cervantes");
        accounting.put("26/01/2018", "Ulysses by James Joyce");
        accounting.put("20/01/2019", "The Great Gatsby by F. Scott Fitzgerald");
        accounting.put("26/05/2019", "Moby Dick by Herman Melville");
    }

    public void getDateInformation() {
        System.out.println("\nThe dates, when books are issued: ");
        for (String key : accounting.keySet()) {
            System.out.println(key);
        }
    }

    public void getBookInformation() {
        System.out.println("\nAll issued books: ");
        for (String value : accounting.values()) {
            System.out.println(value);
        }
    }

    public void setDate() {
        String scan;
        do {
            System.out.println("\nEnter dates in format dd/MM/yyyy");
            Scanner sc = new Scanner(System.in);
            scan = sc.next();
            whenTheBookIsTaken(scan);
            System.out.println("If you want check other date press yes/no");
            scan = sc.next();
        }while (scan.equals("yes"));
    }
}

