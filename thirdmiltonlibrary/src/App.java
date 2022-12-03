import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MiltonLibrary.Book;
import MiltonLibrary.CheckInOut;
import MiltonLibrary.Transactions;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Milton Library!");
        // instance of data structure information stored in built with in java
        List<Book> allBooks = new ArrayList<>();
        List<CheckInOut> allCheckInOuts = new ArrayList<>();
        Transactions t = new Transactions();

        while (true) {
            System.out.println("Select from the menu option given:");
            System.out.println("Milton Library Menu");
            Scanner mmenu = new Scanner(System.in);
            String menuoption = mmenu.nextLine();
            switch (menuoption) {
                case "addBook":
                    t.addBook(allBooks);
                    break;
                case "updateBook":
                    t.updateBook(allBooks);
                    break;
                case "getAllBooks":
                    t.getAllBooks(allBooks);
                    break;
                case "deleteBook":
                    t.deleteBook(allBooks);
                    break;
                case "searchBookByName":
                    String sbbn = mmenu.nextLine();
                    t.searchBookByName(allBooks, sbbn);
                    break;
                case "isBookCheckedOut":
                    t.isBookCheckedOut(allCheckInOuts, allBooks);
                    break;
                case "showAllCheckedoutBooks":
                    t.showAllCheckedoutBooks(allCheckInOuts);
                    break;
                case "checkInBook":
                    t.checkInBook(allCheckInOuts, allBooks);
                    break;
                default:
                    System.out.println("Invalid Operation Performed- Exit the Application Now!");
                    break;
            }

        }
    }
}
