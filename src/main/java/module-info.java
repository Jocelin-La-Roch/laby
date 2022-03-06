module com.example.laby {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.laby to javafx.fxml;
    exports com.example.laby;
}