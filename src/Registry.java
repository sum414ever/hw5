import java.util.*;

public class Registry {
    Map<String, List<String>> accounting = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    static String scan;

    public void addBookViaConsole(){
        System.out.println("Input date in format 'dd/mm/yyyy-the book name' ");
        scan = sc.next();
        String[] parts = scan.split("-");
        String date = parts[0];
        String book = parts[1];
        addBook(date,book);
        System.out.println("You took book " + book + " on this date " + date);
        sc = new Scanner(System.in);
        scan=sc.next();
    }

    public void addBook(String date, String book) {
        if (!accounting.containsKey(date)) {
            List<String> list = new ArrayList<>();
            list.add(book);
            accounting.put(date, list);

        } else {
            List<String> list2;
            list2 = accounting.get(date);
            list2.add(book);
            accounting.put(date, list2);
        }
    }

    public void showBookByDate() {
        System.out.println("Input date in format 'dd/mm/yyyy' ");
        scan = sc.next();
        if (accounting.containsKey(scan)) {
            System.out.println("On this date " + scan + " took this book " + accounting.get(scan));
        } else System.out.println("On this date " + scan + " didn't take a book");
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

    public void loadRegister() {
        addBook("26/01/2019","In Search of Lost Time by Marcel Proust");
        addBook("26/02/2019","Don Quixote by Miguel de Cervantes");
        addBook("26/01/2018","Ulysses by James Joyce");
        addBook("20/01/2019","The Great Gatsby by F. Scott Fitzgerald");
        addBook("26/05/2019","Moby Dick by Herman Melville");
    }
}

