package MiltonLibrary;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Transactions {

    // add a book to the library catalog
    // catalog => a list of books stored at a location
    // list a data structure [a,b,c,d] => 0 based index
    public void addBook(List<Book> allBooks) {
        Book bookitem = new Book();
        Scanner sc = new Scanner(System.in);
        // Enter the book details
        System.out.println("Enter book details:");
        System.out.println("Please Enter Book Name:");
        String bookName = sc.nextLine();
        System.out.println("Please enter authorName:");
        String authorName = sc.nextLine();
        System.out.println("Please enter price:");
        double price = sc.nextDouble();
        System.out.println("Please enter the quantity of books:");
        int quantity = sc.nextInt();

        if (bookName.isEmpty() || authorName.isEmpty() || price == 0 || quantity == 0) {
            System.out.println("Ensure that all values are not null!");
        } else {
            boolean issueStatus = false;
            for (Book b : allBooks) {
                if (b.getBookName() == bookName) {
                    issueStatus = true;
                    break;
                }
            }
            if (issueStatus) {
                System.out.println("Book Exists in the library catalog");
            } else {
                // generate a uuid for isbn
                String isbnId = UUID.randomUUID().toString();

                bookitem.setBookId(isbnId);
                bookitem.setBookName(bookName);
                bookitem.setAuthorName(authorName);
                bookitem.setPrice(price);
                bookitem.setQuantity(quantity);
                allBooks.add(bookitem);
                System.out.println("The Book has been successfully added to the library Catalog");
            }

        }
    }

    // list all books in the library catalog
    public void getAllBooks(List<Book> allBooks) {
        if (allBooks.size() > 0) {
            for (Book b : allBooks) {
                System.out.println("Printing the List of Books in the Library Catalog");

                System.out.println("Book Id:" + b.getBookId());
                System.out.println("Book Name:" + b.getBookName());
                System.out.println("Book Author:" + b.getAuthorName());
                System.out.println("Price:" + b.getPrice());
                System.out.println("Quantity:" + b.getQuantity());
            }

        } else {
            System.out.println("No books exists in the library catalog!");
        }

    }

    public void deleteBook() {

    }

    searchBookByName(){

    }

    isBookCheckedOut(){

    }

    checkinBook(){

    }

    showAllCheckedoutBooks(){
        
    }

}
