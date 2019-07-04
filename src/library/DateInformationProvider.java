package library;

public class DateInformationProvider {

    public void getDateInformation() {
        System.out.println("\nThe dates, when books are issued: ");
        for (String key : ListOfAllTookBooks.getAccounting().keySet()) {
            System.out.println(key);
        }
    }
}
