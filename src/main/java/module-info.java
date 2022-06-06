module com.example.lab_21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_21 to javafx.fxml;
    exports com.example.lab_21;
}