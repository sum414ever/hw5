package library;

import java.util.ArrayList;
import java.util.List;

public class Book {

    public static void addBook(String date, String book) {
        if (!AllTookBooks.getAccounting().containsKey(date)) {
            List<String> list = new ArrayList<>();
            list.add(book);
            AllTookBooks.getAccounting().put(date, list);
        } else {
            List<String> list2;
            list2 = AllTookBooks.getAccounting().get(date);
            list2.add(book);
            AllTookBooks.getAccounting().put(date, list2);
        }
    }
}
