package library;

import java.util.ArrayList;
import java.util.List;

public class BookRegister {

    public static void addBook(String date, String book) {
        if (!BookRegisterInitializer.getAccounting().containsKey(date)) {
            List<String> list = new ArrayList<>();
            list.add(book);
            BookRegisterInitializer.getAccounting().put(date, list);
        } else {
            List<String> list2;
            list2 = BookRegisterInitializer.getAccounting().get(date);
            list2.add(book);
            BookRegisterInitializer.getAccounting().put(date, list2);
        }
    }
}
