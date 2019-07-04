package library;

import java.util.ArrayList;
import java.util.List;

public class AddBook {

    public static void addBook(String date, String book) {
        if (!LoadRegister.getAccounting().containsKey(date)) {
            List<String> list = new ArrayList<>();
            list.add(book);
            LoadRegister.getAccounting().put(date, list);
        } else {
            List<String> list2;
            list2 = LoadRegister.getAccounting().get(date);
            list2.add(book);
            LoadRegister.getAccounting().put(date, list2);
        }
    }
}
