import java.util.*;

public class Registry {
    Map<String, List<String>> accounting = new HashMap<>();

    public void addBookToRegister(String date, String book) {
        if (!accounting.containsKey(date)) {
            List<String> books = new ArrayList<>();
            books.add(book);
            accounting.put(date, books);
        } else {
            List<String> books2;
            books2 = accounting.get(date);
            books2.add(book);
            accounting.put(date, books2);

        }
    }
    public void takeABook(String date, String book) {
        addBookToRegister(date, book);
        System.out.println("Today " + date + " you took the book " + book);
    }

    public void whenTheBookIsTaken(String d) {
        if (accounting.containsKey(d)) {
            System.out.println("On this date " + d + " took this book " + accounting.get(d));
        } else System.out.println("On this date " + d + " didn't take a book");
    }

    public void loadRegister() {
        addBookToRegister("26/01/2019", "In Search of Lost Time by Marcel Proust");
        addBookToRegister("26/02/2019", "Don Quixote by Miguel de Cervantes");
        addBookToRegister("26/01/2018", "Ulysses by James Joyce");
        addBookToRegister("20/01/2019", "The Great Gatsby by F. Scott Fitzgerald");
        addBookToRegister("26/05/2019", "Moby Dick by Herman Melville");
    }

    public void getDateInformation() {
        System.out.println("\nThe dates, when books are issued: ");
        for (String key : accounting.keySet()) {
            System.out.println(key);
        }
    }

    public void getBookInformation() {
        System.out.println("\nAll issued books: ");
        System.out.println(accounting.values());
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

