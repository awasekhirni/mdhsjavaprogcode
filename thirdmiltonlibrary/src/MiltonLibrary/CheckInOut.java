package MiltonLibrary;

import java.util.Date;

public class CheckInOut {

    private String userName;
    private String bookId;
    private String bookName;
    private Date dateBorrowed;

    // getter
    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public String getUserName() {
        return userName;
    }
    // setter

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
