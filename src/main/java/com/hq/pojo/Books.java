package com.hq.pojo;

public class Books {
    private int bookID;
    private String bookName;
    private int bookCount;
    private String detail;

    public Books() {
    }

    public Books(int bookID, String bookName, int bookCount, String detail) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookCount = bookCount;
        this.detail = detail;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", bookCount=" + bookCount +
                ", detail='" + detail + '\'' +
                '}';
    }
}
