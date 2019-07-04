package library;

public class GetBookInformation {

    public void getBookInformation() {
        System.out.println("\nAll issued books: ");
        System.out.println(LoadRegister.getAccounting().values());
    }
}
