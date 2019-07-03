

public class Main {

    public static void main(String[] args) {

        Registry registry = new Registry();

//        //This method loads all register dates and books
        registry.loadRegister();

//        //This method adds to register new book
        registry.takeABook("26/01/2018", "Harry Potter");

//        //This method shows all dates when books are issued.
        registry.getDateInformation();

        //This method shows all issued books
        registry.getBookInformation();

        registry.setDate();
    }
}