module com.example.test3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test3 to javafx.fxml;
    exports com.example.test3;
}