package library;

public class GetDateInformation {

    public void getDateInformation() {
        System.out.println("\nThe dates, when books are issued: ");
        for (String key : LoadRegister.getAccounting().keySet()) {
            System.out.println(key);
        }
    }
}
