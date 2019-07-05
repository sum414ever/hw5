package library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllTookBooks {
    public static Map<String, List<String>> accounting = new HashMap<>();
    private static Book book = new Book();

    static {
        book.addBook("26/01/2019","In Search of Lost Time by Marcel Proust");
        book.addBook("26/02/2019","Don Quixote by Miguel de Cervantes");
        book.addBook("26/01/2018","Ulysses by James Joyce");
        book.addBook("20/01/2019","The Great Gatsby by F. Scott Fitzgerald");
        book.addBook("26/05/2019","Moby Dick by Herman Melville");
    }

    public static Map<String, List<String>> getAccounting() {
        return accounting;
    }
}
