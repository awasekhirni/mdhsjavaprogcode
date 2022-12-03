package MiltonLibrary;

import java.util.Date;
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

    public void deleteBook(List<Book> allBooks) {
        if (allBooks.size() == 0) {
            System.out.println("-----------The Library Catalog is Empty------");

        } else {
            System.out.println("Please Enter the book to delete:");
            Scanner scd = new Scanner(System.in);
            String bName = scd.nextLine();
            boolean bStatus = false;
            for (Book bd : allBooks) {
                if (bd.getBookName() == bName) {
                    allBooks.remove(bd);
                    bStatus = true;
                    System.out.println("The Book is deleted!");
                    break;
                } else {
                    System.out.println("The Book does not exist!");
                }
            }
        }
    }

    // search a book in the library catalog
    public void searchBookByName(List<Book> allBooks, String bookName) {
        boolean isAvailable = false;
        for (Book mybook : allBooks) {
            if (mybook.getBookName().toLowerCase().equals(bookName.toLowerCase())) {
                System.out.println("Book Details are:");
                System.out.println("BookId:" + mybook.getBookId() + " " + "BookName:" + mybook.getBookName());
                isAvailable = true;
                break;
            } else if (mybook.getBookName().toLowerCase().contains(bookName.toLowerCase())) {
                System.out.println("Book Details are:");
                System.out.println("BookId:" + mybook.getBookId() + " " + "BookName:" + mybook.getBookName());
                isAvailable = true;
                break;
            } else {
                isAvailable = false;
                System.out.println("There is no book available with this name in the library catalog!");
            }
        }
    }

    // write the transaction to record who has checkedin a book or
    // checkedout a book
    public void isBookCheckedOut(List<CheckInOut> allCheckedoutBooks, List<Book> allBooks) {
        // input checkout book
        Scanner sco = new Scanner(System.in);
        System.out.println("Please Enter the book that you want to checkout!");
        String mybookName = sco.nextLine();
        // who is the person who is borrowing the book
        System.out.println("Please Enter UserName:!");
        String myusername = sco.nextLine();

        for (Book cb : allBooks) {
            CheckInOut ciob = new CheckInOut();
            if (cb.getBookName().toLowerCase().equals(mybookName.toLowerCase())) {
                cb.setQuantity(cb.getQuantity() - 1);
                ciob.setBookId(cb.getBookId());
                ciob.setUserName(myusername);
                ciob.setBookName(mybookName);
                ciob.setDateBorrowed(new Date());
            }
            allCheckedoutBooks.add(ciob); // push
        }
        System.out.println("You have successfully borrowed a book!");

    }

    // statement of books checkout by users
    public void showAllCheckedoutBooks(List<CheckInOut> allCheckedoutBooks) {
        if (allCheckedoutBooks.size() == 0) {
            System.out.println("There are no book issued to users!");
        } else {
            for (CheckInOut cio : allCheckedoutBooks) {
                System.out.println("Here are the list of books borrowed!");
                System.out.println("bookId:" + cio.getBookId() + " " + "userName:" + cio.getUserName() + "date:"
                        + cio.getDateBorrowed() + "bookName:" + cio.getBookName());
            }
        }

    }

    // returning the book
    // deposit of the book to library catalog
    public void checkInBook(List<CheckInOut> allCheckedoutBooks, List<Book> allBooks) {

        Scanner sci = new Scanner(System.in);
        System.out.println("Please enter the bookname to checkin to the catalog:");
        String ibookName = sci.nextLine();
        System.out.println("Enter the username:");
        String iUserName = sci.nextLine();

        for (CheckInOut cib : allCheckedoutBooks) {
            if (cib.getBookName().toLowerCase().equals(ibookName.toLowerCase())
                    && cib.getUserName().toLowerCase().equals(iUserName.toLowerCase())) {
                for (Book issuedBook : allBooks) {
                    if (cib.getBookName().toLowerCase().equals(ibookName.toLowerCase())) {
                        issuedBook.setQuantity(issuedBook.getQuantity() + 1);
                        allCheckedoutBooks.remove(cib);
                    }
                }

            }
        }
        System.out.println(" The Book has been returned Successfully!");

    }

    // update
    // homework
    public void updateBook(List<Book> allBooks) {
        Scanner scu = new Scanner(System.in);
        // fetch the bookid/bookname
        System.out.println("Please Enter the Book you would like to update:");
        String ubookName = scu.nextLine();
        System.out.println("Please bookId:");
        String ubid = scu.nextLine();
        for (Book ub : allBooks) {
            if (ub.getBookId().toLowerCase().equals(ubid.toLowerCase())
                    && (ub.getBookName().toLowerCase().equals(ubookName.toLowerCase()))) {
                System.out.println("Please enter the price");
                int uprice = scu.nextInt();
                System.out.println("Please enter the qty");
                int uqty = scu.nextInt();
                if (uprice != 0 && uqty != 0) {
                    ub.setPrice(uprice);
                    ub.setQuantity(uqty);

                } else {
                    System.out.println("Price and Qty values have not been provided");
                }

            } else {
                System.out.println("We could not find the records you requested!");
            }
        }

    }

}
