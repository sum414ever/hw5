package library;

public class BookInformationProvider {

    public void getBookInformation() {
        System.out.println("\nAll issued books: ");
        System.out.println(AllTookBooks.getAccounting().values());
    }
}
