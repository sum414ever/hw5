package library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfAllTookBooks {
    public static Map<String, List<String>> accounting = new HashMap<>();
    private static TakeBook takeBook = new TakeBook();

    static {
        takeBook.addBook("26/01/2019","In Search of Lost Time by Marcel Proust");
        takeBook.addBook("26/02/2019","Don Quixote by Miguel de Cervantes");
        takeBook.addBook("26/01/2018","Ulysses by James Joyce");
        takeBook.addBook("20/01/2019","The Great Gatsby by F. Scott Fitzgerald");
        takeBook.addBook("26/05/2019","Moby Dick by Herman Melville");
    }

    public static Map<String, List<String>> getAccounting() {
        return accounting;
    }
}
