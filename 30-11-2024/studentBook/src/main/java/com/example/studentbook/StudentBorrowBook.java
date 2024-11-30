package com.example.studentbook;

public class StudentBorrowBook {
    private String bookName;
    private String StudentName;

    public StudentBorrowBook(String bookName, String studentName) {
        this.bookName = bookName;
        StudentName = studentName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
