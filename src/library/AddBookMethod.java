package library;

import java.util.ArrayList;
import java.util.List;

public class AddBookMethod {

    public static void addBook(String date, String book) {
        if (!Register.getAccounting().containsKey(date)) {
            List<String> list = new ArrayList<>();
            list.add(book);
            Register.getAccounting().put(date, list);
        } else {
            List<String> list2;
            list2 = Register.getAccounting().get(date);
            list2.add(book);
            Register.getAccounting().put(date, list2);
        }
    }
}
