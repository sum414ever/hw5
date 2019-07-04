package library;

import java.util.ArrayList;
import java.util.List;

public class TakeBook {

    public static void addBook(String date, String book) {
        if (!ListOfAllTookBooks.getAccounting().containsKey(date)) {
            List<String> list = new ArrayList<>();
            list.add(book);
            ListOfAllTookBooks.getAccounting().put(date, list);
        } else {
            List<String> list2;
            list2 = ListOfAllTookBooks.getAccounting().get(date);
            list2.add(book);
            ListOfAllTookBooks.getAccounting().put(date, list2);
        }
    }
}
