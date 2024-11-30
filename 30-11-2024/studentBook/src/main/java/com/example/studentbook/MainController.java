package com.example.studentbook;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MainController
{
    @javafx.fxml.FXML
    private TextField studentNameTextField;
    @javafx.fxml.FXML
    private TextField bookIdTextField;
    @javafx.fxml.FXML
    private TextField studentIdTextField;
    @javafx.fxml.FXML
    private TextField bookNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> studentComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> bookComboBox;
    @javafx.fxml.FXML
    private TableColumn<StudentBorrowBook, String> studentCol;
    @javafx.fxml.FXML
    private TableColumn<StudentBorrowBook, String> bookCol;
    @javafx.fxml.FXML
    private TableView<StudentBorrowBook> table;

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<StudentBorrowBook> borrows = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        studentCol.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
        bookCol.setCellValueFactory(new PropertyValueFactory<>("bookName"));
    }

    @javafx.fxml.FXML
    public void addNewBook(ActionEvent actionEvent) {
        String bookName = bookNameTextField.getText();
        int bookId = Integer.parseInt(bookIdTextField.getText());

        books.add(new Book(bookId, bookName));

        bookComboBox.getItems().add(bookName);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        borrows.add(new StudentBorrowBook(bookComboBox.getValue(), studentComboBox.getValue()));

        table.getItems().clear();
        table.getItems().addAll(borrows);

    }

    @javafx.fxml.FXML
    public void addNewStudent(ActionEvent actionEvent) {
        String studentName = studentNameTextField.getText();
        int studentId = Integer.parseInt(studentIdTextField.getText());

        students.add(new Student(studentId, studentName));

        studentComboBox.getItems().add(studentName);
    }
}