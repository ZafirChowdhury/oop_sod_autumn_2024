module com.example.studentbook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentbook to javafx.fxml;
    exports com.example.studentbook;
}